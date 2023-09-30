/*For a given Binary Tree of integers, 
find and return the sum of all the nodes data. 
*/

package Bianry_Trees;

public class sum_of_nodes {
    public static int getSum(BinaryTreeNode<Integer> root) {

		if(root == null){
			return 0;
		}

		int ans = root.data;

		ans += getSum(root.left);
		ans += getSum(root.right);

		return ans;
		
	}
}
