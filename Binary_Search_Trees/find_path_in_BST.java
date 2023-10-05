/*Given a BST and an integer k. Find and return the path
 from the node with data k and root (if a node with data k
  is present in given BST) in a list. Return empty list otherwise.

Note: Assume that BST contains all unique elements.
 */

package Binary_Search_Trees;

import java.util.ArrayList;

import Bianry_Trees.BinaryTreeNode;

public class find_path_in_BST {
    	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		
		if(root == null)
		return null;
	
	if(root.data == data){
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(root.data);
		return ans;
	}

	if(root.data > data){
	 ArrayList<Integer> L = getPath( root.left,  data);

	if(L != null)
	L.add(root.data);

	return L;
	}

	if(root.data < data){
	ArrayList<Integer>  R = getPath( root.right,  data); 

	if(R != null)
	R.add(root.data);

	return R;
	}

	return null;
}
}
