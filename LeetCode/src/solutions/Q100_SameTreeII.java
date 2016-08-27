package solutions;

import java.util.Stack;

/**
Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical 
and the nodes have the same value. 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Q100_SameTreeII {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q == null && p == null)return true;
        if(q == null || p == null)return false;
        Stack<TreeNode> p1 = new Stack<>();
        Stack<TreeNode> q1 = new Stack<>();
        p1.push(p);
        q1.push(q);
        while(!p1.isEmpty() && !q1.isEmpty()){
            TreeNode rootp = p1.pop();
            TreeNode rootq = q1.pop();
            if(rootp.val != rootq.val)return false;
            if(rootp.left != null && rootq.left != null){
                p1.push(rootp.left);
                q1.push(rootq.left);
            }else{
                if(rootp.left != null && rootq.left == null)return false;
                if(rootp.left == null && rootq.left != null)return false;
            }
            if(rootp.right != null && rootq.right != null){
                p1.push(rootp.right);
                q1.push(rootq.right);
            }else{
                if(rootp.right != null && rootq.right == null)return false;
                if(rootp.right == null && rootq.right != null)return false;
            }
        }
        if(!p1.isEmpty() && q1.isEmpty())return false;
        if(p1.isEmpty() && !q1.isEmpty())return false;
        return true;
    }
}
