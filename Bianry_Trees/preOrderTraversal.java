package Bianry_Trees;

public class preOrderTraversal {
    public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root == null){
			return ;
		}

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

}
