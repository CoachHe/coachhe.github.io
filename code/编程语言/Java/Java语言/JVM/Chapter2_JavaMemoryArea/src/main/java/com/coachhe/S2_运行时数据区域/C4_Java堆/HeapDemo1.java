package com.coachhe.S2_运行时数据区域.C4_Java堆;

/**
 * @author CoachHe
 * @date 2022/12/30 00:45
 **/
public class HeapDemo1 {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
