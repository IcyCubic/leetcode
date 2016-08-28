package solutions;

import java.util.LinkedList;
import java.util.Queue;

/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
---
traverse tree...? don't need to
This is just the max depth problem in reverse, instaed of Math.max, use Math.min? nope
traverse tree until the first leaf node (both child nodes == null) is encountered.

*/
public class Q111_MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
    	int depth = 0;
    	Queue<TreeNode> next = new LinkedList<TreeNode>();
    	Queue<TreeNode> current = new LinkedList<TreeNode>();
    	if (root != null) current.offer(root);
    	while (!current.isEmpty()){
    		TreeNode node = current.poll();
    		if (node.left != null)
    			next.offer(node.left);
			if (node.right != null)
				next.offer(node.right);
			if (node.left == null && node.right == null){
				depth++;
				break;
			}				
			if (current.isEmpty()){
				depth++;
				current = next;
				next = new LinkedList<TreeNode>();
			}
    	}
    	return depth;
    }
}
