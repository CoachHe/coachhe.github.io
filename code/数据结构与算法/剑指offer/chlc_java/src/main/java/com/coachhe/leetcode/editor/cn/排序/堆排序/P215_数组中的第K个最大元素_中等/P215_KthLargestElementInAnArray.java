//给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。 
//
// 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。 
//
// 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。 
//
// 
//
// 示例 1: 
//
// 
//输入: [3,2,1,5,6,4], k = 2
//输出: 5
// 
//
// 示例 2: 
//
// 
//输入: [3,2,3,1,2,4,5,5,6], k = 4
//输出: 4 
//
// 
//
// 提示： 
//
// 
// 1 <= k <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 
//
// Related Topics 数组 分治 快速选择 排序 堆（优先队列） 👍 1795 👎 0


package com.coachhe.leetcode.editor.cn.排序.堆排序.P215_数组中的第K个最大元素_中等;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 数组中的第K个最大元素
 *
 * @author CoachHe
 * @date 2022-08-07 19:54:16
 */
public class P215_KthLargestElementInAnArray {
    @Test
    public void test() {
        //测试代码
        Solution solution = new P215_KthLargestElementInAnArray().new Solution();
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println(solution.findKthLargest(nums, 4));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            for (int i = 0; i < nums.length; i++) {
                heapinsert(nums, i);
            }
            int[] helpArr = new int[nums.length];
            int heapSize = nums.length - 1;
            while (heapSize >= 0) {
                helpArr[heapSize] = nums[0];
                swap(nums, 0, heapSize);
                heapify(nums, 0, heapSize);
                heapSize--;
            }
            System.out.println(Arrays.toString(helpArr));
            return helpArr[nums.length - k];
        }

        public void heapify(int[] nums, int index, int heapSize) {
            int leftChild = index * 2 + 1;
            while (leftChild < heapSize) {
                int largestIndex = leftChild + 1 < heapSize && nums[leftChild] < nums[leftChild + 1] ?
                        leftChild + 1 : leftChild;
                int largestValue = nums[largestIndex];
                if (largestValue < nums[index]) {
                    break;
                }
                swap(nums, index, largestIndex);
                index = largestIndex;
                leftChild = index * 2 + 1;
            }
        }

        public void heapinsert(int[] nums, int heapSize) {
            int index = heapSize;
            while (nums[index] > nums[(index - 1) / 2]) {
                swap(nums, index, (index - 1) / 2);
                index = (index - 1) / 2;
            }

        }

        public void swap(int[] nums, int left, int right) {
            if (left == right) {
                return;
            }
            nums[left] = nums[left] ^ nums[right];
            nums[right] = nums[left] ^ nums[right];
            nums[left] = nums[left] ^ nums[right];
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
