package com.coachhe.Section2_重载加号与StringBuilder;

import org.junit.Test;

/**
 * @author CoachHe
 * @date 2022/12/15 02:37
 **/
public class Concatenation {

    // 证明常量拼接之后会通过编译器间优化放入常量池中
    @Test
    public void ConcatenationTest1(){
        String a = "abc";
        String b = "a" + "b" + "c";
        /**
         * 最终，java编译成.class，再执行.class
         * String a = "abc";
         * String b = "abc";
         */
        System.out.println(a == b); //true
        System.out.println(a.equals(b)); //true
    }

    // 证明拼接时只要有一个变量，结果就会放入堆中
    @Test
    public void ConcatenationTest2(){
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4); // true
        System.out.println(s3 == s5); // false
        System.out.println(s3 == s6); // false
        System.out.println(s3 == s7); // false
        System.out.println(s5 == s6); // false
        System.out.println(s5 == s7); // false
        System.out.println(s6 == s7); // false

        String s8 = s6.intern();
        System.out.println(s3 == s8); // true
    }

    public static void main(String[] args) {
        String mango = "mango";
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);
    }

    public static void main_like(String[] args) {
        String mango = "mango";
        StringBuilder s = new StringBuilder();
        s.append("abc");
        s.append(mango);
        s.append("def");
        s.append(47);
        System.out.println(s.toString());
    }
}
