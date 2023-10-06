/*Given a Binary tree, find the largest BST subtree. 
That is, you need to find the BST with maximum height 
in the given binary tree. You have to return the height 
of largest BST. 

*/

package Binary_Search_Trees.Assignment;

import Bianry_Trees.BinaryTreeNode;

public class Largest_bst {
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
        if (root==null)
            return 0;
        
        if (isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            return findHeight(root);
       
        	return Math.max(largestBSTSubtree(root.left),largestBSTSubtree(root.right));
     
            
	}
    
    private static int findHeight(BinaryTreeNode<Integer> root)
    {
        if (root==null)
            return 0;
        
        if (root.left==null && root.right==null)
            return 1;
        
        return Math.max(findHeight(root.left),findHeight(root.right))+1;
    }
    
    private static boolean isBST(BinaryTreeNode<Integer> root, int min, int max)
    {
        if(root == null)
			return true;
		
        if(root.data < min || root.data > max)
			return false;
		else
			return isBST(root.left,min,root.data -1) && isBST(root.right,root.data +1,max);
    }
}
