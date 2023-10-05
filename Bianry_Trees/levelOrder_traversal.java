/*For a given a Binary Tree of type integer, print it in a level order
 fashion where each level will be printed on a new line. 

 Elements on every level will be printed in a linear fashion 
 and a single space will separate them. 
 
 For the above-depicted tree, when printed in a level order fashion,
  the output would look like:

10
20 30 
40 50 60
Where each new line denotes the level in the tree.*/

package Bianry_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrder_traversal {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root == null){
			return ;
		}
		Queue<BinaryTreeNode<Integer>> temp = new LinkedList<BinaryTreeNode<Integer>>();

		temp.add(root);
		temp.add(null);

		while(!temp.isEmpty()){
		
		BinaryTreeNode<Integer> front = temp.poll();
		if(front == null){
			if(temp.isEmpty()){
				break;
			}
			else{
				System.out.println();
				temp.add(null);
			}
		}else{
			System.out.print(front.data+ " ");
			if(front.left != null){
				temp.add(front.left);
			}
			if(front.right != null){
				temp.add(front.right);
			}
		}
		
	}
	}
}
