package com.timaimee.oneHundred;

/**
 * @author timaimee
 * @date 2016-06-06 00:12
 * @des Maximum Depth of Binary Tree
 */
public class LeetCode104 {
	public static void main(String[] args) {
		NodeTree nodeTree0 = new NodeTree(0);
		NodeTree nodeTree1 = new NodeTree(1);
		NodeTree nodeTree2 = new NodeTree(2);
		NodeTree nodeTree3 = new NodeTree(3);
		NodeTree nodeTree4 = new NodeTree(4);
		NodeTree nodeTree5 = new NodeTree(5);
		NodeTree nodeTree6 = new NodeTree(6);

		nodeTree0.left = nodeTree1;
		nodeTree0.right = nodeTree2;
		nodeTree1.left = nodeTree3;
		nodeTree1.right = nodeTree4;
		nodeTree2.left = nodeTree5;
		nodeTree2.right = nodeTree6;
		travle(nodeTree0);
		getMaxDepth(nodeTree0);
	}

	/**
	 * travle thte binear tree
	 * 
	 * @param root
	 */
	private static void travle(NodeTree root) {
		if (root != null) {
			travle(root.left);
			travle(root.right);
		}

	}

	private static int getMaxDepth(NodeTree root) {
		if (root == null) {
			return 0;
		} else {
			int left = getMaxDepth(root.left);
			int right = getMaxDepth(root.right);
			return 1 + Math.max(left, right);
		}
	}

}

class NodeTree {
	int val;
	NodeTree left;
	NodeTree right;

	public NodeTree(int val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "NodeTree [val=" + val + "]";
	}

}
