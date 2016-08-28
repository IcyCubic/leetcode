package solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its bottom-up level order traversal as:

[
  [15,7],
  [9,20],
  [3]
]
*/
public class Q107_BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> next = new LinkedList<TreeNode>();
        Queue<TreeNode> current = new LinkedList<TreeNode>();
        if (root != null)
        	current.offer(root);
        while(!current.isEmpty()){
        	TreeNode node = current.poll();
        	list.add(node.val);
        	if (node.left != null)
        		next.offer(node.left);
    		if (node.right != null)
    			next.offer(node.right);
    		if (current.isEmpty()){
    			result.add(0, list);
    			list = new ArrayList<Integer>();
    			current = next;
    			next = new LinkedList<TreeNode>();
    		}
        }        
        return result;
    }
}
