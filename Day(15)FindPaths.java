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
    private void findPaths(TreeNode root,String path,List<String> list){
        if(root.left == null && root.right == null){
            list.add(path + Integer.toString(root.val));
        }
        if(root.left != null){
            findPaths(root.left,path+root.val+"->",list);
        }
        if(root.right != null){
            findPaths(root.right,path+root.val+"->",list);
        }
    }
  //  System.out.println(list[0]);
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if(root != null) findPaths(root,"",list);
         
        return list;
        
    }
}
