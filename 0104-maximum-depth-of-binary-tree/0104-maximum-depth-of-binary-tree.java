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
    public int maxDepth(TreeNode root) {
        int res = maximumDepth(root);
        return res;
    }
    int maximumDepth(TreeNode node){
        if(node==null)
            return 0;
        
        int leftHeight = maximumDepth(node.left);
        int rightHeight = maximumDepth(node.right);
       
        if(leftHeight>rightHeight)
           return leftHeight+1;
        
        else
           return rightHeight+1;
    }
}