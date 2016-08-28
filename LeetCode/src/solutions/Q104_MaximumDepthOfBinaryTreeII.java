package solutions;

import java.util.LinkedList;
import java.util.Queue;

/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

---
Count the number of 'tiers' in the tree
-int result
-return 0 if root is null
-determine if node.left or node.right is null
--if not, go down a tier and add 1 to result
--use Queue<TreeNode> "current" to step through all nodes in a tier
--create second Queue<TreeNode> "next" to capture all nodes in the next tier, if any
--when next is empty, return result

*/
public class Q104_MaximumDepthOfBinaryTreeII {
    public int maxDepth(TreeNode root) {
    	return root==null?0:1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
