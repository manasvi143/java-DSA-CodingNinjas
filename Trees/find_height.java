/*Given a generic tree, find and return the height of given tree. 
The height of a tree is defined as the longest distance from root node
 to any of the leaf node. Assume the height of a tree with a single node is 1. 
 */

package Trees;

public class find_height {
    public static int getHeight(TreeNode<Integer> root){
		
        if(root == null){
            return 0;
        }

        int hight = 1; 

        for(int i= 0 ; i< root.children.size() ; i++){
            int ans = 1+getHeight(root.children.get(i));
           if(hight < ans)
           hight = ans;
        }
        return hight;
   }
}
