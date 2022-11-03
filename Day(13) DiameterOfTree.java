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
     public int height(TreeNode root){
        if(root ==  null){
            return 0;
        }
        int leftHt = height(root.left);
        int rightHt = height(root.right);
        return Math.max(leftHt,rightHt)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root ==  null){
            return 0;
        }
        int ldiameter = diameterOfBinaryTree(root.left);
        int rdiameter = diameterOfBinaryTree(root.right);
        //case 1 dia go through the root
        int totalHt = height(root.left) + height(root.right);
        // case 2 
        int maxDia = Math.max(ldiameter , rdiameter);
        return Math.max(totalHt,maxDia);

    }
}
