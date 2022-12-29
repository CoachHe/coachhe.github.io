---
title: 1 PC寄存器
tags: []
categories:
  - 编程语言
  - Java
  - Java语言
  - JVM
  - 2 Java内存区域与内存溢出异常
  - 3 运行时数据区域
date: 2022-12-29 15:49:35
---

程序计数寄存器：Program Counter Register

# CPU 的寄存器

在了解程序计数寄存器之前，我们先需要了解一下 CPU 的寄存器。
寄存器存储指令相关的现场信息。CPU 只有把数据装载到寄存器才能够运行。

## 程序计数寄存器和 CPU 寄存器之间的关系

JVM 中的 PC 寄存器是对物理 PC 寄存器的一种抽象模拟。

# PC 寄存器

## 作用

PC 寄存器用来存储指向下一条指令的地址，也就是即将要执行的指令代码。由执行引擎读取下一条指令。

<img src=" https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20221216121438.png" width = "50%" />


## 介绍

- PC 寄存器是一块很小的内存空间，几乎可以忽略不计。也是运行速度最快的存储区域
- 在 JVM 规范中，每个线程都有它自己的程序计数器，是线程私有的，生命周期和线程的生命周期保持一致
- 任何时间一个线程都只有一个方法在执行，也就是所谓的当前方法。程序计数器会存储当前线程正在执行的 Java 方法的 JVM 指令地址；若是在执行 native 方法（也就是 C 语言的方法，不是 Java 方法），则是未指定值（undefined）
- 它是程序控制流的指示器，分支、循环、跳转、异常处理、线程回复等基础功能都需要依赖这个计数器来完成
- 字节码解释器工作时就是通过改变这个计数器的值来选取下一条需要执行的字节码指令
- 它是唯一一个在 Java 虚拟机规范中没有规定任何 OutOfMemoryError 情况的区域

## PC 寄存器实例

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

<img src=" https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/%E7%A8%8B%E5%BA%8F%E5%91%98/%E5%B7%A5%E5%85%B7/git/20221204052612.png" width = "50%" />

## PC 寄存器图解

还是看我们上面的例子中的部分：

<img src="https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20211223100353.png" width = "50%" />

从图中可以看到，左边一排的数字就是 PC 寄存器中存储的地址，右边一排就是操作指令，操作引擎会根据 PC 寄存器的地址去找到对应的操作指令，将其翻译成机器指令，让 CPU 进行具体的操作。

## PC 寄存器面试题

1. 使用 PC 寄存器存储字节码指令地址有什么作用？

因为 CPU 在不停切换各个线程，这时候切换回来以后，就得知道接着从哪开始继续执行。
JVM 的字节码解释器就需要通过改变 PC 寄存器的值来明确下一条应该执行什么样的字节码指令。

2. PC 寄存器为什么是线程私有的？

为了能够准确地记录各个线程正在执行的当前字节码指令地址，最好的办法自然是为每一个线程都分配一个 PC 寄存器，这样一来各个线程之间便可以进行独立计算，从而不会出现相互干扰的情况。

