package Bianry_Trees;

public class TreeUsing_PostOrder_and_Inorder {
    public static BinaryTreeNode<Integer> helper(int[] postOrder, int[] inOrder , int siPost , int eiPost, int siIn , int eiIn){

		if(siPost > eiPost){
			return null;
		}

		int rootdata = postOrder[eiPost];
		BinaryTreeNode<Integer>  root = new BinaryTreeNode<Integer>(rootdata);

		int rootLocation = -1;

		for(int i = siIn ; i<=eiIn ;i++){

			if(rootdata == inOrder[i]){
				rootLocation = i;
				break;
			}
		}

		// left subTree in InOrder array
		int siInleft = siIn;
		int eiInleft = rootLocation-1;

		//right subTree in inOrder array
		int siInright = rootLocation +1;
		int eiInright = eiIn;

		// left subTree in postOrder array
		int siPostleft = siPost;
		int lengthleft = (eiInleft -siInleft) +1;
		int eiPostleft = siPostleft +lengthleft -1;

		//right subtree in postOrder array
		int siPostright = eiPostleft+1;
		int eiPostright = eiPost -1;

		root.left = helper(postOrder, inOrder, siPostleft, eiPostleft, siInleft, eiInleft);
		root.right = helper(postOrder, inOrder, siPostright, eiPostright, siInright, eiInright);

		return root;
	}

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
		BinaryTreeNode<Integer> root = helper(postOrder, inOrder, 0, postOrder.length -1, 0, inOrder.length -1);
		return root;
	}
}
