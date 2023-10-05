package Binary_Search_Trees;

import Bianry_Trees.BinaryTreeNode;

public class Check_BST {

    public static int minimum(BinaryTreeNode<Integer> root){

        if(root == null){
            return Integer.MAX_VALUE;
        }

        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }
     public static int maximum(BinaryTreeNode<Integer> root){

        if(root == null){
            return Integer.MIN_VALUE;
        }

        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }
    
    public static boolean isBST(BinaryTreeNode<Integer> root){

        if(root == null){
            return false;
        }

        int leftMax = maximum(root.left);
        int rightMin = minimum(root.right);

        if(root.data <= leftMax){
            return false;
        }
        if(root.data > rightMin){
            return false;
        }

        boolean isLeftBST = isBST(root.left);
        boolean isrightBST = isBST(root.right);

        if(isLeftBST && isrightBST){
            return true;
        }
        return false;
    }
}
