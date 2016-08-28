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
public class Q104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
       int tiers = 0; //depth counter       
//       if (root.left == null && root.right == null) return 1;
       Queue<TreeNode> current = new LinkedList<>();
       if (root != null)
    	   current.offer(root);
       Queue<TreeNode> next = new LinkedList<>();
       while (!current.isEmpty()){
    	   TreeNode node = current.poll();    	  
    	   if (node.left != null)
    		   next.offer(node.left);
    	   if (node.right != null)
    		   next.offer(node.right);
    	   if (current.isEmpty()){
    		   tiers++;
    		   current = next;
    		   next = new LinkedList<TreeNode>();
    	   }	   
       }
       return tiers;
    }
}
