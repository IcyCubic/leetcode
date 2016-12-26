package solutions;

import java.util.LinkedList;
import java.util.Queue;

/*
Given a binary tree and a sum, determine if the tree has a root-to-leaf 
path such that adding up all the values along the path equals the given 
sum.

For example:
Given the below binary tree and sum = 22,

              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1

return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
---
traverse list
keep tabs on values
sum values when arriving at leaf node
-or if running tally exceeds sum, abort line

*/
public class Q112_PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
    	Queue<Integer> path = new LinkedList<Integer>();    	
    	Queue<TreeNode> next = new LinkedList<TreeNode>();
    	Queue<TreeNode> current = new LinkedList<TreeNode>();    	
    	if (root != null){
    		current.offer(root);
    		path.offer(root.val);
    	}
    	while (!current.isEmpty()){
    		TreeNode node = current.poll();
    		int currentSum = path.poll();
    		if (node.left != null){
    			next.offer(node.left);
    			path.offer(node.left.val + currentSum);
    		}
			if (node.right != null){
				next.offer(node.right);
    			path.offer(node.right.val + currentSum);
			}
			if (node.left == null && node.right == null && currentSum == sum){
				return true;
			}
			if (current.isEmpty()){
				current = next;
				next = new LinkedList<TreeNode>();
			}
    	}
    	return false;
    }
}
