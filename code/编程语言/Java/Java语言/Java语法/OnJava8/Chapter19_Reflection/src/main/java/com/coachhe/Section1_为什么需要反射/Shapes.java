package com.coachhe.Section1_为什么需要反射;

/**
 * @author CoachHe
 * @date 2022/12/29 01:40
 **/
public class Shapes {

}

abstract class Shape{
    void draw(){
        System.out.println(this + ".draw()");
    }

    @Override
    public String toString() {
        return "Shape{}";
    }
}
