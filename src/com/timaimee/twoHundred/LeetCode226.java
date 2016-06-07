package com.timaimee.twoHundred;

/**
 * @date 2016-06-07
 * @author timaimee
 * @des Invert Binary Tree
 */
public class LeetCode226 {
	public static void main(String[] args) {
		NodeTree root = creatNodeTree();
	}

	public NodeTree invertTree(NodeTree root) {
		if (root == null)   return null;
			NodeTree tmp = root.left;
			root.left = invertTree(tmp);
			root.right = invertTree(root.left);
			return root;
		 
	}

	private static NodeTree creatNodeTree() {
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

		return nodeTree0;
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
