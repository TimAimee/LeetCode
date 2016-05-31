package com.timaimee.oneHundred;

/**
 * @author timaimee
 * @date 2016-05-29 20:57
 * @des Same Tree
 *
 */
public class LeetCode100 {
	public static void main(String[] args) {
		TreeNode one = creatTreeOne();
		TreeNode two = creatTreeTwo();
		isSameTree(one, two);
	}

	private static TreeNode creatTreeOne() {
		TreeNode one = new TreeNode(0);
		TreeNode one1 = new TreeNode(1);
		TreeNode one2 = new TreeNode(2);

		one.left = one1;
		one.right = one2;

		return one;
	}

	private static TreeNode creatTreeTwo() {
		TreeNode two = new TreeNode(0);
		TreeNode two1 = new TreeNode(1);
		TreeNode two2 = new TreeNode(2);

		two.left = two1;
		two.right = two2;

		return two;
	}

	//the deep is one
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null || q == null)
			return p == q; // if they are null at the same time
		if (p.val != q.val)
			return false;
		return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
