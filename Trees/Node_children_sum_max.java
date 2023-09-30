/*Given a tree, find and return the node for which sum of data of all 
children and the node itself is maximum. In the sum, data of node itself 
and data of immediate children is to be taken. 
*/

package Trees;

public class Node_children_sum_max {
    public static int sum(TreeNode<Integer> root){
		int total = root.data;
		for(int i = 0 ; i < root.children.size() ; i++){
			total = total + root.children.get(i).data;
		}
		return total;
	}
	
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
		if(root == null){
			return null;
		}

	int max = 0 ; 
	TreeNode<Integer> ans = null;

		for(int j = 0 ; j < root.children.size() ; j++){
			TreeNode<Integer> ans1 = maxSumNode(root.children.get(j));
			if(sum(ans1) > max){
				max = sum(ans1);
				ans = ans1;
			}
		}
			if(sum(root) > max){
				return root;
			}
			return ans;
	}
}
