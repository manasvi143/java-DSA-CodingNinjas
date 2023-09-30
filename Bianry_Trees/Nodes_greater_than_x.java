/*For a given a binary tree of integers and an integer X,
 find and return the total number of nodes of the given binary
  tree which are having data greater than X.
   */

package Bianry_Trees;

public class Nodes_greater_than_x {
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
		if(root == null){
			return 0;
		}
		

		int leftNodes = countNodesGreaterThanX(root.left, x);
		int rightNodes = countNodesGreaterThanX(root.right, x);

		
		if(root.data > x){
			return (leftNodes+rightNodes+1);
		}

		return leftNodes+rightNodes;
	}
}
