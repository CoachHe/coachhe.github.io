package com.coachhe.Section2_重载加号与StringBuilder;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: coachhe
 * Date: 2022/12/15
 * Time: 20:09
 * Description:
 */
public class Intern {

    // 测试随着jdk版本变化，字符串常量池由只会存放实际字符串对象变成会存放堆的引用
    @Test
    public void internTest1(){
        String s = new String("1");
        s.intern(); // 调用此方法之前字符串常量池中已经存在1
        String s2 = "1";
        System.out.println(s == s2); // false

        String s3 = new String("1") + new String("8"); // 执行完之后字符串常量池中不存在"18"，和jdk版本无关
        s3.intern(); // jdk6： 在字符串常量池中生成新对象"18"， jdk7：在字符串常量池中生成堆中对象的引用
        String s4 = "18"; // s4变量记录的地址：使用的上一行代码执行时，在常量池中生成的"18"的地址
        System.out.println(s3 == s4); // jdk6及以前:false, jdk7及以后:true
    }

    // 何时执行intern方法的影响
    @Test
    public void internTest2(){
        String s3 = new String("1") + new String("8");
        String s4 = "18";
        s3.intern();
        System.out.println(s3 == s4); // false
    }

    public static void main(String[] args) {
    }
}
