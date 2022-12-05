//给你二叉树的根节点 root ，返回它节点值的 前序 遍历。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [1,null,2,3]
//输出：[1,2,3]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 示例 4： 
// 
// 
//输入：root = [1,2]
//输出：[1,2]
// 
//
// 示例 5： 
// 
// 
//输入：root = [1,null,2]
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：递归算法很简单，你可以通过迭代算法完成吗？ 
//
// Related Topics 栈 树 深度优先搜索 二叉树 👍 889 👎 0


package com.coachhe.leetcode.editor.cn.二叉树.遍历.P144_二叉树的前序遍历;

import com.coachhe.leetcode.editor.cn.二叉树.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的前序遍历
 * @author CoachHe
 * @date 2022-08-18 01:06:13
 */
public class P144_BinaryTreePreorderTraversal{
	 @Test
	 public void test() {
	 	 //测试代码
	 	 Solution solution = new P144_BinaryTreePreorderTraversal().new Solution();
		 TreeNode node = new TreeNode(1);
		 node.right = new TreeNode(2);
		 node.right.left = new TreeNode(3);
		 List<Integer> list = solution.preorderTraversal(node);
		 System.out.println(list);
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> resList = new ArrayList<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode tmpNode = stack.pop();
			resList.add(tmpNode.val);
			if (tmpNode.right != null) {
				stack.push(tmpNode.right);
			}
			if (tmpNode.left != null) {
				stack.push(tmpNode.left);
			}
		}
		return resList;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
