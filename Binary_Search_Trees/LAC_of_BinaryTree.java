/*Given a binary tree and data of two nodes, 
find 'LCA' (Lowest Common Ancestor) of the given two nodes in the binary tree. 

Sample Input 1:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
2 10
Sample Output 1:
10

Sample Input 2:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
2 6
Sample Output 2:
5

Sample Input 3:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
12 78
Sample Output 3:
-1

*/

package Binary_Search_Trees;

import Bianry_Trees.BinaryTreeNode;

public class LAC_of_BinaryTree {
    	public static boolean isFound(BinaryTreeNode<Integer> root , int x , int y){

		if(root == null)
		return false;

		if(root.data == x || root.data == y)
		return true;

	 boolean L = isFound(root.left, x, y);
	 boolean R = isFound(root.right, x, y);

	 return(L||R);
	}

	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

		if(root == null)
			return -1;

		if(root.data == a || root.data == b)
		return root.data;	
		
		if(isFound(root.left, a , b) && isFound(root.right, b , a))
		return root.data;

		if(isFound(root.left, a , b) == true &&  isFound(root.right, a , b) == false ){
		int L = getLCA(root.left, a, b);
		return L;
		} 

		if(isFound(root.left, a , b) == false &&  isFound(root.right, a , b) == true ){
		int R = getLCA(root.right, a, b);
		return R;
		}

		return -1;
	}
}
