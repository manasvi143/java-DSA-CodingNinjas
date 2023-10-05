/*For a given a Binary Tree of type integer, find and return the minimum and 
the maximum data values.

Return the output as an object of Pair class, which is already created. 
*/

package Bianry_Trees;

public class Minimun_and_Maximum_in_BinaryTree {

	public static class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}




	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {

		if(root == null){
			 Pair<Integer, Integer> ans = new  Pair<Integer, Integer>( Integer.MAX_VALUE ,0);
			return ans;
		}
		// if(root.left == null || root.right == null){
		// 	 Pair<Integer, Integer> ans = new  Pair<Integer, Integer>(root.data,root.data);
		// 	return ans;
		// }

		if(root.right == null && root.left == null){
			 Pair<Integer, Integer> ans = new  Pair<Integer, Integer>(root.data, root.data);
			return ans;
		}
		
		 Pair<Integer, Integer> TL = getMinAndMax(root.left);
		 Pair<Integer, Integer> TR = getMinAndMax(root.right);

		 int Max  = Math.max(TL.maximum, Math.max(TR.maximum, root.data));
		 int Min  = Math.min(TL.minimum, Math.min(TR.minimum, root.data));

		 Pair<Integer, Integer> ans1 = new  Pair<Integer, Integer>(Min, Max);
		 return ans1;

	}
	
}

