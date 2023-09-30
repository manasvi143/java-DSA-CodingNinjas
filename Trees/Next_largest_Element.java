/*Given a generic tree and an integer n. Find and return the 
node with next larger element in the Tree i.e. 
find a node with value just greater than n. 
*/

package Trees;

public class Next_largest_Element {
    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		if(root == null){
			return null;
		}
		TreeNode<Integer> ans = null;
		if(root.data > n){
			ans = root;
		}

		for(int i = 0 ; i < root.children.size() ; i++){
			TreeNode<Integer> temp = findNextLargerNode(root.children.get(i), n);

			if(temp == null){
				continue;
			}else{
				if(ans == null){
					ans = temp;
				}else{
					if(temp.data > n && temp.data< ans.data){
						ans = temp;
					}
				}
			}

		}
		return ans;
	}
}
