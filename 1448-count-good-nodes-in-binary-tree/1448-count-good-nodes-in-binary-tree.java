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
    int count = 0;
    public int goodNodes(TreeNode root) {
        int maxVal = Integer.MIN_VALUE;
         countGoodNodes(root, maxVal);
        return count;
    }
    
    void countGoodNodes(TreeNode node, int maxVal){
        if(node==null)
            return;
        
        if(node.val>=maxVal){
            maxVal = node.val;
            count++;
        }
        
        countGoodNodes(node.left, maxVal);
        countGoodNodes(node.right, maxVal);
        
    }
}