package Bianry_Trees;

public class replace_node_with_depth {
    public static void helper(BinaryTreeNode<Integer> root , int depth){
		if(root == null){
			return;
		}
		root.data = depth;
		helper(root.left, depth +1);
		helper(root.right, depth +1);
	}

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
		helper(root, 0);
	}

}
