package solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
]

unknown # of nodes
-store values from left to right, order matters - FIFO
--requires a queue of nodes to iterate through nodes on a tier "Queue<TreeNode> current"
--create a second queue of nodes as the next queue when you traverse the first queue of nodes "Queue<TreeNode> next"
--iterate when current queue is empty by setting current = next;
--create new Queue<TreeNode> to prep for future tiers

result is a list of lists
-require a List<List<Integers>> result
-require a List<Integers> to hold values from each tier
-add tier list to result list
-create new tier list to hold next tier values

*/
public class Q102_BinaryTreeOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> current = new LinkedList<TreeNode>(); // current tier's queue
        if (null != root)
        	current.offer(root); // adds root to queue if not null
        List<Integer> list = new ArrayList<Integer>(); // container for results of each tier
        Queue<TreeNode> next = new LinkedList<TreeNode>(); // next tier's queue
        while (!current.isEmpty()) { // as long as there are nodes to process...
        	TreeNode node = current.poll(); // pops item out of queue
        	list.add(node.val); // add the item's value to this tier's result set
        	if (node.left != null) // if the left leg is not null
        		next.offer(node.left); //add the left leg to the next queue
        	if (node.right != null) // if the right leg is not null
        		next.offer(node.right); //add the right leg to the next queue
        	if (current.isEmpty()){
        		result.add(list); // add last tier's result list to the result list
        		list = new ArrayList<Integer>(); //create new arraylist for next tier (can't use list.clear() because it would wipe the existing data. reference!)
        		current = next; // move the current tier to the next tier;
        		next = new LinkedList<TreeNode>(); // create new container for the next tier;
        	}    		
        }        
        return result;
    }
}
