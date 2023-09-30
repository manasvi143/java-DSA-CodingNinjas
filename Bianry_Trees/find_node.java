/*For a given Binary Tree of type integer and a number X, 
find whether a node exists in the tree with data X or not. 
*/

package Bianry_Trees;

public class find_node {
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
		if(root == null){
			return false;
		}
		boolean ans;
		if(root.data == x){
			 ans = true;
		}else{
			 ans = false;
		}
		boolean leftAns = isNodePresent(root.left, x);
		if(leftAns == true){
			return true;
		}
		boolean rightAns = isNodePresent(root.right, x);
		if(rightAns == true){
			return true;
		}
		return ans;
	}

}
