package Bianry_Trees;

public class construct_tree_using_preOrder_and_inorder {
    public static BinaryTreeNode<Integer> helper(int[] preOrder, int[] inOrder , int siPE , int eiPE , int siIN, int eiIN){
		
		if(siPE > eiPE){
			return null;
		}
		int rootData = preOrder[siPE];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		int rootLocation = -1;

		for(int i = siIN ; i <= eiIN ; i++){

			if(inOrder[i] == rootData){
				rootLocation = i;
				break;
			}
		}
		// left sub tree in InOrder array
		int siINleft = siIN;
		int eiINleft = rootLocation-1;

		//left sub tree in PreOrder array
		int siPEleft = siPE +1;
		int leftLength = (eiINleft - siINleft)+1;
		int eiPEleft = (siPEleft + leftLength -1);

		//right subTree in Inorder array
		int siINright = rootLocation +1;
		int eiINright = eiIN;

		//right subTree in PreOrder array
		int siPEright = eiPEleft +1;
		int eiPEright = eiPE;

		BinaryTreeNode<Integer>  leftChild = helper(preOrder, inOrder, siPEleft, eiPEleft, siINleft, eiINleft);
		BinaryTreeNode<Integer>  rightChild = helper(preOrder, inOrder, siPEright, eiPEright, siINright, eiINright);

		root.left = leftChild;
		root.right = rightChild;

		return root;

	}

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
		BinaryTreeNode<Integer> root = helper(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
		return root;
	}
}
