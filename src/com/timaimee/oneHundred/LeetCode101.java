package com.timaimee.oneHundred;

import com.timaimee.oneHundred.LeetCode100.TreeNode;

/**
 * @author timaimee
 * @date 2016-05-29 20:57
 * @des Symmetric Tree
 *
 */
public class LeetCode101 {
	public static void main(String[] args) {

	}

	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return isMirror(root.left, root.right);
	}

	public boolean isMirror(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;
		return (p.val == q.val) && isMirror(p.left, q.right) && isMirror(p.right, q.left);
	}
}
