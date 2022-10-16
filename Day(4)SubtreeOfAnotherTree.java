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
    
    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null ) { // if both are reached to the leaf Node 
            return true; 
        }
        if(root== null || subRoot == null){   // if anyone is not null then not match  
            return false;
        }
        if(root.val == subRoot.val){
            return isIdentical(root.left , subRoot.left) && isIdentical(root.right , subRoot.right);
        }
        return false;
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) 
    {
        if(subRoot == null)  // if subroot is null then it ia always present in tree
        {    
          return true;  
        }  
        if(root == null){    // if root is equal to null then no subroot present
            return false;   
        }
        if(root.val == subRoot.val)
        {
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left , subRoot) || isSubtree(root.right ,subRoot);
        
    }
}
