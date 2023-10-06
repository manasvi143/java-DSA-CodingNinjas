/*Given a binary search tree, you have to replace each node's data with the 
sum of all nodes which are greater or equal than it. You need to include the
 current node's data also.

That is, if in given BST there is a node with data 5,
 you need to replace it with sum of its data (i.e. 5)
 and all nodes whose data is greater than or equal to 5.
Note: You don't need to return or print, just change the data of each node.

Sample Input 1 :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
Sample Output 1 :
18 
36 10 
38 31 
25 

*/

package Binary_Search_Trees.Assignment;

import Bianry_Trees.BinaryTreeNode;

public class Replace_with_sum_of_greater_node {
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
			if(root == null){
            return;
        }
         replace(root ,0);
        
		
	}
    public static int replace(BinaryTreeNode<Integer> root ,int sum){
        if(root == null){
            return 0;
        }
        
        int right = replace(root.right ,sum);
        int rootdata = root.data;
        root.data = root.data + right + sum;
        int left = replace(root.left ,root.data);
        
        return rootdata + right + left;
        

	}
}
