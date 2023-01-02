package com.coachhe.section4_CompilerOptimization.S3_EscapeAnalysis.标量替换;

/**
 * @author CoachHe
 * @date 2023/1/2 03:14
 * 标量替换
 **/
public class ScalarReplacement {

    public static void main(String[] args) {
        ScalarReplacement sr = new ScalarReplacement();
        sr.alloc();
    }

    private void alloc() {
        Point point = new Point(1, 2);
        System.out.println("point.x=" + point.x + "; point.y=" + point.y);
    }


    class Point{
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
