/*Given a generic tree and an integer x, 
check if x is present in the given tree or not. 
Return true if x is present, return false otherwise. */

package Trees;

public class find_element_x_in_tree {
    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		// Write your code here
		if(root.data == x){
			return true;
		}
		for(int i = 0 ; i< root.children.size() ; i++){
			boolean ans =checkIfContainsX(root.children.get(i), x);
			if(ans == true){
				return true;
			}
		}
		return false;
	}
}
