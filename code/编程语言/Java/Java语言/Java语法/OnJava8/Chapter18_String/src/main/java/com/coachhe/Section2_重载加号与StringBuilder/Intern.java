package com.coachhe.Section2_重载加号与StringBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: coachhe
 * Date: 2022/12/15
 * Time: 20:09
 * Description:
 */
public class Intern {
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2); // false

        String s3 = new String("1") + new String("2");
        s3.intern();
        String s4 = "12";
        System.out.println(s3 == s4); // true
    }
}
