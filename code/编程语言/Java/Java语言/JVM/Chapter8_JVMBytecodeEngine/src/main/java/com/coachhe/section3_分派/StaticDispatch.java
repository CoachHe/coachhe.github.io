package com.coachhe.section3_分派;

/**
 * Created with IntelliJ IDEA.
 * User: coachhe
 * Date: 2022/12/13
 * Time: 16:17
 * Description: 方法静态分派演示
 */
public class StaticDispatch {

    static abstract class Human {}

    static class Man extends Human {}

    static class Woman extends Human {}

    public void sayHello(Human guy) {
        System.out.println("Hello, guy");
    }

    public void sayHello(Man guy) {
        System.out.println("Hello, gentleman");
    }

    public void sayHello(Woman guy) {
        System.out.println("Hello, lady");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Man();
        StaticDispatch sr = new StaticDispatch();
        sr.sayHello(man);
        sr.sayHello(woman);
    }


}
