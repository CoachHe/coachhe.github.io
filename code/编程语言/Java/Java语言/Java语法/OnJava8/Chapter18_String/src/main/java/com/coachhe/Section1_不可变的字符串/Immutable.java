package com.coachhe.Section1_不可变的字符串;

/**
 * @author CoachHe
 * @date 2022/12/15 01:00
 * 这里是为了展示Java字符串的不可变性，传入的其实是q对象引用的副本
 **/
public class Immutable {

    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q); //howdy
        String qq = upcase(q);
        System.out.println(qq); // HOWDY
        System.out.println(q); // howdy
    }

}
