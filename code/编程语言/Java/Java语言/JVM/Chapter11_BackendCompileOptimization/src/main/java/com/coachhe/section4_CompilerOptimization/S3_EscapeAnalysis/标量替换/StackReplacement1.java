package com.coachhe.section4_CompilerOptimization.S3_EscapeAnalysis.标量替换;

/**
 * @author CoachHe
 * @date 2023/1/2 13:37
 * 标量替换的过程，1 2 3分别是优化分析的步骤
 **/
public class StackReplacement1 {
    // 1. 完全未优化的代码
    public int test(int x) {
        int xx = x + 1;
        Point p = new Point(xx, 42);
        return p.getX();
    }

    // 2. 标量替换后的样子
//    public int test(int x) {
//        int xx = x + 1;
//        int px = xx;
//        int py = 42;
//        return px;
//    }

    // 3. 做无效代码消除后的样子
//    public int test(int x) {
//        return x + 1;
//    }

    class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        int getX() {
            return this.x;
        }
    }
}
