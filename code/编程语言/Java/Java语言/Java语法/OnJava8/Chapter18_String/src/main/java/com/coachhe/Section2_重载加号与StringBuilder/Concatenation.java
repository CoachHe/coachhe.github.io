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

    public static void main(String[] args) {
        String mango = "mango";
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);
    }
}
