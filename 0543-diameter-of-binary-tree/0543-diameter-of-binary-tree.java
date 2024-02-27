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
    protected int diameter = 0; 
    public int diameterOfBinaryTree(TreeNode root) {
     
        heightOfTree(root);
        
        return diameter;
    }
    
    public int heightOfTree(TreeNode root){

           // Base case: if the tree is empty, return 0
        if (root == null) {
            return 0;
        }
        // Recursively calculate the heights of the left and right subtrees
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        
        diameter = Math.max(diameter, leftHeight+rightHeight);
        
        // Return the maximum height of the left or right subtree, plus 1 for the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    
    
}