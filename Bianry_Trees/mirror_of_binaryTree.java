/*For a given Binary Tree of type integer, 
update it with its corresponding mirror image.
 */

package Bianry_Trees;

public class mirror_of_binaryTree {
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		if(root == null){
			return;
		}
		if(root.left == null || root.right == null){
			return ;
		}

		 mirrorBinaryTree(root.right);
		 mirrorBinaryTree(root.left);

		 BinaryTreeNode<Integer> temp = root.right;
		 root.right = root.left;
		 root.left = temp;

		return ;
	}
}
