/*Given a binary search tree and data of two nodes,
 find 'LCA' (Lowest Common Ancestor) of the given two nodes in the BST.
 
 */

package Binary_Search_Trees;

import Bianry_Trees.BinaryTreeNode;

public class LAC_of_BST {
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		
		if(root == null)
		return -1;

		if(root.data == a || root.data == b)
		return root.data;

		if(a < root.data && b > root.data || a > root.data && b < root.data )
		return root.data;

		if(root.data > a && root.data > b)
		return getLCA(root.left, a, b);

		if(root.data < a && root.data < b)
		return getLCA(root.right, a, b);

		return -1;
	}
}
