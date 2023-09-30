package Bianry_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class print_BinaryTree_LevelWise {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null){
			return;
		}

		Queue<BinaryTreeNode<Integer>> pendingNode = new LinkedList<BinaryTreeNode<Integer>>();
		
		pendingNode.add(root);

		while(!pendingNode.isEmpty()){
			BinaryTreeNode<Integer> front = pendingNode.remove();
			String s = front.data + ":" + "";
			if(front.left != null){
				s = s+ "L:" + front.left.data +",";
				pendingNode.add(front.left);

			}else{
				s = s+ "L:" + "-1" +",";
			}
			
				if(front.right != null){
				s = s+ "R:" + front.right.data ;
					pendingNode.add(front.right);
			}else{
				s = s+ "R:" + "-1" ;
			}
		
			System.out.println(s);
		}
	}
}
