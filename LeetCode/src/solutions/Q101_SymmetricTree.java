package solutions;
/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
For example, this binary tree is symmetric:
    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//split root to left and right side, compare if they are symmetrical by
//flipping one tree
public class Q101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
    	if (null == root) return true;
    	return isSymmetricHelper(root.left, root.right); 
    }
    
    private boolean isSymmetricHelper(TreeNode t1, TreeNode t2){
    	if (t1 == null && t2 == null) return true;
    	if (t1 != null && t2 != null && t1.val == t2.val
    		&& isSymmetricHelper(t1.left, t2.right)
    		&& isSymmetricHelper(t1.right, t2.left)) 
    		return true;    	
    	return false;
    }
}
