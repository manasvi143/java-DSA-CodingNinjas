package Trees;

public class number_of_nodes_greater_than_x {
    public static int numNodeGreater(TreeNode<Integer> root,int x){

		if(root == null)
		return 0;

		int ans = 0 ;

		if(root.data > x){
			ans++;
		}
		for(int i = 0 ; i < root.children.size() ; i++){
			int greater = numNodeGreater(root.children.get(i), x);
		ans = ans+greater;
		}
		return ans;
	}
}
