package solutions;

import java.util.LinkedList;
import java.util.List;

/*
 Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5

All root-to-leaf paths are:

["1->2->5", "1->3"]

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and 
creating all test cases.
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
public class Q257_BinaryTreePaths {
	List<String> list = new LinkedList<>();
	public List<String> binaryTreePaths(TreeNode root) {
    	if (root == null) return list;
    	explore(root,null);        
        return list;
    }
	private void explore(TreeNode root, String path){
		path = path==null ? String.valueOf(root.val) : path+"->"+root.val;
		if (root.left == null && root.right == null){
    		list.add(path);
    		return;
    	}
		if (root.left != null) explore(root.left, path);
		if (root.right != null) explore(root.right, path);
	}
}
