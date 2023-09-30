/*For a given Binary Tree of type integer and a number X, 
find whether a node exists in the tree with data X or not. 
*/

package Bianry_Trees;

public class is_node_present {
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
		if(root == null){
			return false;
		}
		if(root.data == x){
			return true;
		}
		boolean left = isNodePresent(root.left, x);
		boolean right = isNodePresent(root.right, x);

		if(left == true || right == true){
			return true;
		}
		return false;
	}
}
