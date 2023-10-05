/*Given a sorted integer array A of size n, which contains all unique elements. 
You need to construct a balanced BST from this input array. Return the root of 
constructed BST.

Note: If array size is even, take first mid as root. */


package Binary_Search_Trees;

import Bianry_Trees.BinaryTreeNode;

public class construct_BST_from_sortedArray {
    	public static  BinaryTreeNode<Integer> helper(int[] arr , int si , int ei){
			if(si>ei)
			return null;

			int mid = (si+ei) >>1;
			BinaryTreeNode<Integer> root = new  BinaryTreeNode<Integer>(arr[mid]);

			root.left = helper(arr, si, mid-1);
			root.right = helper(arr,mid+1 , ei);

			return root;

		}
	 
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			return helper(arr, 0, n-1);
		}
}
