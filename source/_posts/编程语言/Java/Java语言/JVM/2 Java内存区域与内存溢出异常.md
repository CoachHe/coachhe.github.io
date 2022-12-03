---
title: 2 Java内存区域与内存溢出异常  
date: 2022-12-04 02:20:10  
tags: []  
categories:
  - 编程语言
  - Java
  - Java语言
  - JVM
---

# 内存介绍

内存是非常重要的系统资源，是硬盘和 CPU 的中间仓库及桥梁，承载着操作系统和应用程序的实时运行。JVM 内存布局规定了 Java 在运行过程中内存申请、分配、管理的策略，保证了 JVM 的高效稳定运行。

## 结构图
<img src="https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211221130003.png" width = "50%" />


# 从 JVM 角度看线程
- 线程是一个程序里的运行单元。JVM 允许一个应用有多个线程并行的执行
- 在 Hotspot JVM 中，每个线程都与操作系统的本地线程直接映射。
	- 当一个 Java 线程准备好执行以后，此时一个操作系统的本地线程也同时创建。Java 线程执行终止之后，本地线程也会回收。
- 操作系统负责所有线程的安排调度到任何一个可用的 CPU 上。一旦本地线程初始化成功，他就会调用 Java 线程中的 run () 方法


## JVM 系统线程
- 虚拟机线程
- 周期任务线程
- GC 线程
- 编译线程
- 信号调度线程


# 运行时数据区组件
接下来，我们就来一个个介绍这些运行时数据区的组件。

## 程序计数寄存器
程序计数寄存器：Program Counter Register

### CPU 的寄存器
在了解程序计数寄存器之前，我们先需要了解一下 CPU 的寄存器。
寄存器存储指令相关的现场信息。CPU 只有把数据装载到寄存器才能够运行。

### 程序计数寄存器和 CPU 寄存器之间的关系
JVM 中的 PC 寄存器是对物理 PC 寄存器的一种抽象模拟。

### PC 寄存器作用
PC 寄存器用来存储指向下一条指令的地址，也就是吉祥要执行的指令代码。由执行引擎读取下一条指令。

<img src="https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211222191350.png" width = "50%" />



### PC 寄存器介绍
- PC 寄存器是一块很小的内存空间，几乎可以忽略不计。也是运行速度最快的存储区域
- 在 JVM 规范中，每个线程都有它自己的程序计数器，是线程私有的，生命周期和线程的生命周期保持一致
- 任何时间一个线程都只有一个方法在执行，也就是所谓的当前方法。程序计数器会存储当前线程正在执行的 Java 方法的 JVM 指令地址；若是在执行 native 方法（也就是 C 语言的方法，不是 Java 方法），则是未指定值（undefined）
- 它是程序控制流的指示器，分支、循环、跳转、异常处理、线程回复等基础功能都需要依赖这个计数器来完成
- 字节码解释器工作时就是通过改变这个计数器的值来选取下一条需要执行的字节码指令
- 它是唯一一个在 Java 虚拟机规范中没有规定任何 OutOfMemoryError 情况的区域

#### PC 寄存器实例

我们首先新建一个类 `PCRegisterTest.java`, 为：
```java
package com.coachhe.PCRegister;  
  
public class PCRegisterTest {  
    public static void main(String[] args) {  
        int i = 10;  
        int j = 20;  
        int k = i + j;  
  
        String s = "abc";  
        System.out.println(i);  
        System.out.println(k);  
    }  
}
```


反编译之后我们可以看到：

<img src=" https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/%E7%A8%8B%E5%BA%8F%E5%91%98/%E5%B7%A5%E5%85%B7/git/20221204052528.png" width = "50%" />

主要还是看 main 方法中，以操作数 10 为例，代表我们创建了一个字符串，指向常量池中的#2，找到常量池中的#2 为 String 类型，并且再次指向了#16，为 abc。这里其实是两步操作 (多了一步从去找#16 的过程），因此在操作数 10 之后直接是操作数 12

![](https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211223095127.png)

#### PC 寄存器图解
还是看我们上面的例子中的部分：

<img src="https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211223100353.png" width = "50%" />

从图中可以看到，左边一排的数字就是 PC 寄存器中存储的地址，右边一排就是操作指令，操作引擎会根据 PC 寄存器的地址去找到对应的操作指令，将其翻译成机器指令，让 CPU 进行具体的操作。

### PC 寄存器面试题
1. 使用 PC 寄存器存储字节码指令地址有什么作用？

因为 CPU 在不停切换各个线程，这时候切换回来以后，就得知道接着从哪开始继续执行。
JVM 的字节码解释器就需要通过改变 PC 寄存器的值来明确下一条应该执行什么样的字节码指令。

2. PC 寄存器为什么是线程私有的？

为了能够准确地记录各个线程正在执行的当前字节码指令地址，最好的办法自然是为每一个线程都分配一个 PC 寄存器，这样一来各个线程之间便可以进行独立计算，从而不会出现相互干扰的情况。


## 虚拟机栈
### 虚拟机栈的概述
#### 背景
由于跨平台的设计，Java 的指令都是根据栈来设计的，不同平台的 CPU 架构不同，所以不能设计为基于寄存器的。

#### 优缺点
优点是跨平台，指令集小，编译器容易实现，缺点是性能下降，实现同样的功能需要更多的指令。

#### 栈和堆概述
栈是运行时的单位，而堆是存储的单位。
也就是说，栈解决程序的运行问题，即程序如何执行，或者说如何处理数据。堆解决的是数据存储的问题，即数据怎么放、放在哪？

#### JVM 栈是什么
每个线程在创建时都会创建一个虚拟机栈，其内部保存一个个的栈帧（Stack Frame），对应着一次次的 Java 方法调用。
是线程私有的

#### JVM 栈的生命周期
生命周期与线程一致

#### JVM 栈的作用
主管 Java 程序的运行，它保存方法的局部变量 （8 种数据类型、对象的引用地址）、部分结果，并参与方法的调用和返回。

#### JVM 栈的特点（有点）
- 栈是一种快速有效的分配存储方式，访问速度仅次于程序计数器。
- JVM 直接对 Java 栈的操作只有两个
	- 每个方法执行，伴随着进栈
	- 执行结束后的出栈工作
- 对于栈来说不存在垃圾回收问题

#### 栈中可能出现的异常
Java 虚拟机规范允许 Java 栈的大小是动态的或者是固定不变的。
- 如果采用**固定大小**的 JVM 栈，那每一个线程的 JVM 栈容量可以在线程创建时独立选定，那如果线程请求分配的栈容量超过 Java 虚拟机能允许的最大容量，JVM 就会抛出一个 StackOverflowError 异常。
```java
package com.coachhe.JVMStack;  
public class StackTest {  
  
    public void methodA(){  
        methodA();  
    }  
  
    public static void main(String[] args) {  
        StackTest stackTest = new StackTest();  
        stackTest.methodA();  
    }  
}
```

![](https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211224093503.png)


- 如果 Java 虚拟机栈**允许动态扩展**，并且在尝试拓展的时候无法申请到足够的内存，或者在创建新的线程时没有足够的内存去创建对应的虚拟机栈，那么 JVM 会抛出一个 OutOfMemoryError 异常（OOM）

#### 设置栈内存大小
可以使用 `-Xss` 选项来设置栈内存的大小。
代码：
```java
package com.coachhe.JVMStack;  
  
public class StackTest {  
  
    private static int i = 1;  
  
    public void methodB(){  
        i++;  
        System.out.println(i);  
        methodB();  
    }  
  
  
    public static void main(String[] args) {  
        StackTest stackTest = new StackTest();  
        stackTest.methodB();  
    }  
  
}
```

这里可以看到，每次执行methodB都会将i+1，这样可以看到methodB到底被调用了多少次（也就是虚拟机栈有多深）。

![](https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211224093930.png)

可以看到，在不进行设置的情况下，执行了 10737 次。

这时我们设置一下栈大小：
![](https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211224094507.png)

再次重新执行：
![](https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211224094554.png)

可以看到，在设置栈大小为 256k 之后，只执行了 1755 次之后栈就溢出了！
体现了设置栈大小的作用

### 栈的存储单位
#### 栈的存储内容-栈帧
- 每个线程都有自己的栈，栈中的数据都是以栈帧（Stack Frame）的格式存在。
- 在这个线程上正在执行的每个方法都各自对应一个栈帧
- 栈帧是一个内存区块，是一个**数据集**，维系着方法执行过程中的各种数据信息
- JVM 直接对 Java 栈的操作只有两个，那就是压栈和出栈，遵循“先进后出”/“后进先出”的原则。
- 在一条活动线程中，一个时间点上，只会有一个活动的栈帧。也就是说，只有当前正在执行的方法的栈帧是有效的，这个栈帧被称为当前栈帧，与当前栈帧对应的方法就是当前方法，定义这个方法的类就是当前类。
<img src="https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211224101004.png" width = "50%" />
- 执行引擎运行的所有字节码指令只针对当前栈帧进行操作
- 如果在该方法中调用了其他方法，对应的新的栈帧会被创建出来，成为新的当前栈帧

#### 栈运行原理
- 不同线程中所包含的栈帧是不允许存在相互引用的
- 如果当前方法调用了其他方法，方法返回之际，当前栈帧会传回此方法的执行结果给前一个栈帧，接着，虚拟机会丢弃当前栈帧，让前一个栈帧成为当前栈帧。
- Java 方法有两种返回函数的方式
	- 正常函数返回：使用 return 指令
	- 抛出异常：无论任何异常（只要没被处理），都会返回
	在这里值得注意的是，如果 A 方法调用 B 方法时，如果 B 方法抛出异常，则会直接返回，将异常抛给 A 方法，若 A 方法没有处理异常的方式，会继续返回给 main 方法，如果 main 方法也没对异常进行处理，那么线程就会停止，只要有任意一个方法有处理异常的方法，那么线程就不会结束。
	总结一句话：抛出异常不等于线程停止
举例来看：
```java
package com.coachhe.JVMStack;  
  
public class ReturnErrorTest {  
    public static void main(String[] args) {  
        ReturnErrorTest returnErrorTest = new ReturnErrorTest();  
        returnErrorTest.methodA();  
    }  
  
    public void methodA(){  
        System.out.println("methodA 开始执行");  
        methodB();  
        System.out.println("methodA 执行结束");  
    }  
  
    public void methodB(){  
        System.out.println("methodB 开始执行");  
        methodC();  
        System.out.println("methodB 执行结束");  
    }  
  
    public void methodC(){  
        System.out.println("methodC 开始执行");  
        System.out.println("methodC 执行结束");  
    }  
  
}
```

在这里可以看到，main 方法调用了 methodA，methodA 调用了 methodB，methodB 调用了 methodC，打印结果如下：

<img src="https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211224132142.png" width = "50%" />

此时没有任何方法有捕捉异常的机制，那么任意一个方法中抛出异常，则会直接线程终止：
例如我将 methodC 进行修改：
```java
public void methodC(){  
    System.out.println("methodC 开始执行");  
    System.out.println("methodC 执行结束");  
    throw new RuntimeException();  
}
```

那么结果会直接报错：
<img src="https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211224132358.png" width = "50%" />
在 C 方法执行之后就直接结束了，但是我如果在任意一个函数添加对异常的处理，例如我在 main 方法中捕捉并打印异常：

```java
public static void main(String[] args) {  
    ReturnErrorTest returnErrorTest = new ReturnErrorTest();  
    try {  
        returnErrorTest.methodA();  
    } catch (Exception e) {  
        System.out.println(e);  
    }  
  
}
```

此时再执行：
<img src="https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211224132543.png" width = "50%" />

可以看到，线程正常执行完成，之所以只打印了 methodC 的结束信息，是因为 methodB 和 methodA 都直接抛出异常返回了。如果我在 methodB 中就捕捉了异常并且处理了，那么又是另外一种情况了：

```java
public void methodB(){  
    System.out.println("methodB 开始执行");  
    try {  
        methodC();  
    } catch (Exception e) {  
        System.out.println(e);  
    }  
    System.out.println("methodB 执行结束");  
}
```


<img src="https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211224133037.png" width = "50%" />
可以看到，在方法 B 中打印了异常，其他任务正常执行，并且 main 方法中的捕捉异常也没有工作了。


### 栈帧的内部结构

<img src="https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211224133805.png" width = "80%" />

每个栈帧中存储着：
- 局部变量表
- 操作数栈
- 动态链接（指向运行时常量池的方法引用）
- 方法返回地址
- 一些附加信息

具体信息可以查看 [[8 虚拟机字节码执行引擎]]

## 虚拟机堆


















# 对象探秘
## 1. 对象的创建
1. 类的加载
先看看《深入理解JVM》里面的步骤：
当Java虚拟机遇到一条字节码new指令时，首先将去检查这个指令的参数是否能在常 量池中定位到一个类的符号引用，并且检查这个符号引用代表的类是否已被加载、解析和初始化过。如果没有，那必须先执行相应的类加载过程。
这部分对应的内容就是`java.lang.ClassLoader`类的`loadClass`方法。
- 首先，来看看前半句话：
	==当Java虚拟机遇到一条字节码new指令时，首先将去检查这个指令的参数是否能在常 量池中定位到一个类的符号引用，并且检查这个符号引用代表的类是否已被加载、解析和初始化过。==
	对应的源码部分：
	<img src=https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20210810094227.png height=700>
	点进`findLoadClass(name)`，可以看到：
	<img src=https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20210810094452.png height=200>
	在这里，`checkName`很简单，作用是检查name是否为null或者是一个有效的二进制名，然后根据`findLoadedClass0`这个native方法去执行JVM的方法。
- 接下来看看后半句话：
	==如果没有，那必须先执行相应的类加载过程。==
	对应的源码部分：
	<img src=https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20210810114433.png height=700>
	这部分内容在[[7 虚拟机类加载机制]]进行详细说明，我们先大概分析一下，就是首先使用双亲委派机制尝试进行类的加载，如果失败，那么需要调用findClass方法来进行类的加载，最终返回的是一个Class对象。
总结一下：类的加载主要分为三个步骤
1.  检查是否已经加载，有就直接返回，避免重复加载
2.  当前缓存中确实没有该类，那么遵循父优先加载机制，加载.class文件
3.  上面两步都失败了，调用findClass()方法加载




2. 分配内存
同样，看看《深入理解 JVM》
在类加载检查通过后，接下来虚拟机将为新生对象分配内存。对象所需内存的大小在类加载完成后便可完全确定，为对象分配空间的任务实际上便等同于把一块确定大小的内存块从 Java 堆中划分出来。


