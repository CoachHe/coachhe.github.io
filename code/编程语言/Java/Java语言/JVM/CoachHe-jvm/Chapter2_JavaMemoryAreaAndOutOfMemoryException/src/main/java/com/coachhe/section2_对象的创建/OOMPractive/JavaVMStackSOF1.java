package com.coachhe.section2_对象的创建.OOMPractive;

/**
 * @Author: CoachHe
 * @Date: 2022/11/16 14:53
 */
public class JavaVMStackSOF1 {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF1 oom = new JavaVMStackSOF1();
        try {
            oom.stackLeak();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
