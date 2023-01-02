package com.coachhe.section4_CompilerOptimization.S3_EscapeAnalysis.标量替换;

/**
 * @author CoachHe
 * @date 2023/1/2 13:37
 **/
public class StackReplacement1 {
    // 完全未优化的代码
    public int test(int x) {
        int xx = x + 1;
        Point p = new Point(xx, 42);
        return p.getX();
    }

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
