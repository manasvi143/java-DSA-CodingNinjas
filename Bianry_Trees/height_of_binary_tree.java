package Bianry_Trees;

public class height_of_binary_tree {
    public static int height(BinaryTreeNode<Integer> root) {
		if(root == null){
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		if(leftHeight > rightHeight){
			return leftHeight+1;
		}
		return rightHeight+1;
	}
}
