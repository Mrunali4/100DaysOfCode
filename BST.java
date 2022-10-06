import javax.lang.model.util.ElementScanner14;

public class BST {
    public static class TreeNode{
        int data;
        TreeNode right,left;
        public TreeNode(int data) 
        {
            this.data= data;
            left=right=null;
        }
    }

public static TreeNode buildBst(int value,TreeNode root){
        if(root==null){
        root=  new TreeNode(value);
        return root;
        }
        if(root.data < value){
            root.right = buildBst(value, root.right);
        }
        else{
            root.left = buildBst(value,root.left);
        }
        return root;
}
    public static void printTree(TreeNode root){
        if(root==null){
            return;
        }
        printTree(root.left);
        System.out.print(root.data+" ");
        printTree(root.right);
        //System.out.println(root.data + " ");
    }
    public static boolean search(int key,TreeNode root){
        if(root == null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(root.data<key){
            return search(key, root.right);
        }
        else{
            return search(key, root.left);
        }
    }
    public static TreeNode delete(int key,TreeNode root){
        if(root.data <key){
            root.right = delete(key , root.right);
        }
        else if(root.data > key){
            root.left = delete(key , root.left);
        }
        else{ // we found key we are in location of trees
            //case 1- if leaf node 
            if(root.right == null && root.left ==null){
                return null; // return null to its parents rather then root
            }
            //case 2- for left child
            else if(root.right == null) { // left child is present
                return root.left;
            } 
            else if(root.left == null) { // rigth child is present
                return root.right;
            } 
            // case -3 if both child is present
                     // approch is to find smallest ele in left subtree and swap with root data
            else{ 
                TreeNode IS = findInorderSucessor(root.right); // inorder sucessor is leftmost child of right tres
                root.data = IS.data;
                root.right = delete(IS.data, root.right);              
            }
        }
        return root;
    }
    public static TreeNode findInorderSucessor(TreeNode root)
    {
        if(root.left == null){
            return root;
        }
        return findInorderSucessor(root.left);
    }

    public static void main(String[] args) {
        int values[] = {5,4,32,3,12,8,9,10};
        TreeNode root=null;
        for(int i=0;i<values.length;i++){
            root = buildBst(values[i], root);
        }
        // print BST
        printTree(root);
        System.out.println();
        //search key in BST
        if(search(4, root)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
        //Delete element 
        delete(3,root);
        printTree(root);
    }
}
