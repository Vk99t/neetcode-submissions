/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameValue(p,q);
    }

    public boolean isSameValue(TreeNode tree1,TreeNode tree2){
        if(tree1==null&&tree2==null)
           return true;
        if(tree1==null||tree2==null)
          return false; 
        if(tree1.val!=tree2.val){
            return false;
        }
        return isSameValue(tree1.left,tree2.left)&&isSameValue(tree1.right,tree2.right);

    }
}
