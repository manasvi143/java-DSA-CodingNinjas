/*For a given a Binary Tree of type integer, duplicate every node
 of the tree and attach it to the left of itself.

The root will remain the same. So you just need to insert nodes in 
the given Binary Tree. 
*/

package Binary_Search_Trees;

import Bianry_Trees.BinaryTreeNode;

public class create_ans_insert_duplicate_node {
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		
		if(root == null)
		return;

		BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer> (root.data);
		BinaryTreeNode<Integer> temp1 = root.left;
		root.left = temp;
		temp.left = temp1;

		insertDuplicateNode(temp1);
		insertDuplicateNode(root.right);


	}
}
