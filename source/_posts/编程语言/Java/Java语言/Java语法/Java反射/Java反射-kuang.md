---
categories:
  - 编程语言
  - Java
  - Java语言
  - Java语法
  - Java反射
---
# 动态语言和静态语言
## 动态语言
动态语言是一类运行时可以改变其结构的语言：例如新的函数、对象、甚至代码可以被引进，已有的函数可以被删除或是其他结构上的变化。通俗点说，就是在运行时代码可以根据某些条件改变自身结构
主要动态语言：Object-C、C#、JavaScript、PHP、Python等。

## 静态语言
与动态语言相对应的，运行时结构不可变的语言就是静态语言。
## Java
Java不是动态语言，但Java可以称之为“准动态语言”。即Java有一定的动态性，我们可以利用反射机制获得类似动态语言的特性。Java的动态性让编程的时候更加灵活。

## 理解
对于Cpp或者c，被编译成.c文件之后，就没有办法再改变了，也就是说，这个文件如何执行，已经被预先设置好了，没办法改了。
但是对于Java，被编译成.class文件之后，可以通过反射得到.class文件的内部信息。并且可以进行修改，所以可以被称为动态语言。


# 反射
Reflection（反射）是Java被视为动态语言的关键，反射机制允许程序在执行期间借助于Reflection API取得任何类的内部信息，并能直接操作任意对象的内部属性及方法。
```java
Class c = Class.forName("java.lang.String")
```
加载完类之后，在堆内存的方法区中就产生了一个Class类型的对象（一个类只有一个Class对象），这个对象就包含了完整的类的结构信息。我们可以通过这个对象看到类的结构。这个对象就像一面镜子，透过这个镜子可以看到类的结构，所以，我们称之为反射。

<img src=https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/%E7%A8%8B%E5%BA%8F%E5%91%98/%E5%B7%A5%E5%85%B7/git/20210808155324.png width = 500 heigh = 100>

# Class类
在Object类中定义了以下的方法，此方法将被所有子类继承。
```java
public final Class getClass()
```
以上方法的返回类型是一个Class类，此类是Java反射的源头，实际上所谓反射从程序的运行结果来看也很好理解，即：可以通过对象反射求出类的名称
<img src=https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/%E7%A8%8B%E5%BA%8F%E5%91%98/%E5%B7%A5%E5%85%B7/git/20210808161638.png width=500 heigh=500>

## 关于Class类
- Class本身也是一个类
- Class对象只能由系统建立对象
- 一个加载的类在JVM中只会有一个Class实例
- 一个Class对象对应的是一个加载到JVM中的一个.class文件
- 每个类的实例都会记得自己是由哪个Class实例所生成
- 通过Class可以完整地得到一个类中所有被加载的结构
- Class类是Reflection的根源，针对任何你想动态加载、运行的类，唯有先获得相应的Class对象。

## 获得Class对象的三种方式
```java

package com.coachhe.reflect.kuang;

// 测试class类的创建方式有哪些
public class test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是：" + person.name);

        // 1. 通过对象获得
        Class<?> c1 = person.getClass();

        // 2. forname获得
        Class<?> c2 = Class.forName("com.coachhe.reflect.kuang.Student");

        // 3. 通过类型.class获得
        Class<Student> c3 = Student.class;

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }
}

class Person{
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}
```

结果：
<img src=https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/%E7%A8%8B%E5%BA%8F%E5%91%98/%E5%B7%A5%E5%85%B7/git/20210808162833.png height=200>
可以看到，通过三种方式获得的Class对象都有相同的hashcode，所以是同一个。

