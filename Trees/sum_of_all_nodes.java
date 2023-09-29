/*Given a generic tree, count and return the sum of all nodes present in the given tree.

For the above tree , total sum of all nodes is 10 + 30 + 50 + 25 + 5 + 45 + 56 + 34 = 225
 */

package Trees;

public class sum_of_all_nodes {
    public static int sumOfAllNode(TreeNode<Integer> root){

		if(root == null){
			return 0;
		}

		int ans = root.data;

		for(int i = 0 ; i < root.children.size() ; i++){
			ans += sumOfAllNode(root.children.get(i));
		}
	return ans;
	}
}
