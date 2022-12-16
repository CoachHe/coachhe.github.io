package com.coachhe.section2_运行时栈帧结构.局部变量表;


import org.junit.Test;

/**
 * @Author: CoachHe
 * @Date: 2022/11/8 14:11
 * @apiNote 局部变量槽复用对垃圾收集的影响
 */
public class LocalVariables {

    /**
     * 输出：
     * [GC (System.gc())  69468K->66136K(251392K), 0.0012436 secs]
     * [Full GC (System.gc())  66136K->65931K(251392K), 0.0052158 secs]
     */
    @Test
    public void localVariableTest1() {
        byte[] placeholder = new byte[64 * 1024 * 1024];
        System.gc();
    }

    /**
     * 输出：
     * [GC (System.gc())  69468K->66136K(251392K), 0.0011595 secs]
     * [Full GC (System.gc())  66136K->65931K(251392K), 0.0051033 secs]
     */
//    public static void main(String[] args) {
//        {
//            byte[] placeholder = new byte[64 * 1024 * 1024];
//        }
//        System.gc();
//    }

    /**
     * 输出：
     * [GC (System.gc())  69468K->66152K(251392K), 0.0011148 secs]
     * [Full GC (System.gc())  66152K->395K(251392K), 0.0047107 secs]
     */
//    public static void main(String[] args) {
//        {
//            byte[] placeholder = new byte[64 * 1024 * 1024];
//        }
//        int a = 0;
//        System.gc();
//    }

    /**
     * 输出：会报错
     */
    public static void main(String[] args) {
        LocalVariables l = new LocalVariables();
        int a = 0;
        System.out.println(a);
    }

}
