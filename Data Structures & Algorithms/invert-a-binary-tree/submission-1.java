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
    public TreeNode invertTree(TreeNode root) {
        
        if(root==null){
            return null;
        }
        reverseTree(root,root.left,root.right);
        return root;
        
    }

    public void reverseTree(TreeNode parent,TreeNode child1,TreeNode child2){
        if(child1==null&&child2==null)
        {
            return;
        }
        parent.left=child2;
        parent.right=child1;
        if(child1!=null){
            reverseTree(child1,child1.left,child1.right);
        }
        if(child2!=null){
            reverseTree(child2,child2.left,child2.right);
        }
    }
}
