//中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。 
//
// 例如， 
//
// [2,3,4] 的中位数是 3 
//
// [2,3] 的中位数是 (2 + 3) / 2 = 2.5 
//
// 设计一个支持以下两种操作的数据结构： 
//
// 
// void addNum(int num) - 从数据流中添加一个整数到数据结构中。 
// double findMedian() - 返回目前所有元素的中位数。 
// 
//
// 示例： 
//
// addNum(1)
//addNum(2)
//findMedian() -> 1.5
//addNum(3) 
//findMedian() -> 2 
//
// 进阶: 
//
// 
// 如果数据流中所有整数都在 0 到 100 范围内，你将如何优化你的算法？ 
// 如果数据流中 99% 的整数都在 0 到 100 范围内，你将如何优化你的算法？ 
// 
//
// Related Topics 设计 双指针 数据流 排序 堆（优先队列） 👍 731 👎 0


package com.coachhe.leetcode.editor.cn.排序.堆排序.P295_数据流的中位数_困难;

import org.testng.annotations.Test;

/**
 * 数据流的中位数
 * @author CoachHe
 * @date 2022-08-10 22:59:22
 */
public class P295_FindMedianFromDataStream{
	 @Test
	 public void test() {
	 	 //测试代码
	 	 Solution solution = new P295_FindMedianFromDataStream().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public Solution() {

    }
    
    public void addNum(int num) {

    }
    
    public double findMedian() {
        return 0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
