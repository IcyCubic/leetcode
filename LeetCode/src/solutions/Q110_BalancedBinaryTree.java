package solutions;
/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary 
tree in which the depth of the two subtrees of every node never differ 
by more than 1. 

---
traverse the tree
compare the left node and right node's leaves
-if both leaves are not null, enqueue and keep going
-if one leaf is null, check other leaf
*/
public class Q110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
    	if (root == null) return true;
    	if(Math.abs(depth(root.left) - depth(root.right)) > 1) return false;
    	return isBalanced(root.left) && isBalanced(root.right);
    }
    private int depth(TreeNode node){
    	return node==null?0:1+Math.max(depth(node.left), depth(node.right));
    }
}
