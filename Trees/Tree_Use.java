package Trees;

import java.util.Scanner;

public class Tree_Use {
    public static void preOrder(TreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data);
        for(int i = 0 ; i< root.children.size() ; i++){
            preOrder(root.children.get(i));
        }
    }
    public static void printAtK(TreeNode<Integer> root , int K){

        if(K < 0){
            return ;
        }
        if(K == 0){
        System.out.println(root.data);
        return;
    }

        for(int i = 0 ; i < root.children.size() ; i++){
            printAtK(root.children.get(i), K -1);
        }
    }
    public static int largest(TreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for(int i = 0 ; i< root.children.size(); i++){
            int childLargest = largest(root.children.get(i));
            if(childLargest > ans)
            ans = childLargest;
        }
        return ans;
    }
    public static TreeNode<Integer> takeInput(){
        int n ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the root data : ");
        n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);

        System.out.println("Enter number of child for " + n +" :");
        int childCount = sc.nextInt();

        for(int i = 0 ; i < childCount ; i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }
    public static void print(TreeNode<Integer> root){

        String s = root.data + ": ";

        for(int i = 0 ; i < root.children.size() ; i++){
            s= s + root.children.get(i).data + ","; 
        }
        System.out.println(s);
        for(int i = 0 ; i < root.children.size() ; i++){
            print(root.children.get(i));
        }
        
    }
    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root node data ");
        int n = sc.nextInt();
        QueueUsingLL<TreeNode<Integer>> pendingNode = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        pendingNode.enqueue(root);

        while (!pendingNode.isEmpty()) {
            try {
                TreeNode<Integer> frontNode = pendingNode.dequeue();
                System.out.println("Enter the number of children of " + frontNode.data);
                int childCount = sc.nextInt();
                for(int i = 0 ; i<childCount ; i++){
                    System.out.println("Enter the " + (i+1) +"th child of " + frontNode.data);
                    int child = sc.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                    frontNode.children.add(childNode);
                    pendingNode.enqueue(childNode);
                }
            } catch (QueueEmptyException e) {
                // never reach this condition
               return null;
            }
            
        }
        return root;
    }
    public static int numNodes(TreeNode<Integer> root){
        if(root == null){
            return 0;
            // this is not a base case , this condition will only run once if,
            // root is null.
        }

        int count = 1; 
        /* no need for base case because of the for loop  */

        for(int i = 0 ; i < root.children.size() ; i++){
            count += numNodes(root.children.get(i));
        }
        return count;
    }
    public static int numNodeGreater(TreeNode<Integer> root,int x){

		if(root == null){
		return 0;
        }
        int ans = root.data , j = 0 ;
		for(int i = 0 ; i < root.children.size() ; i++){
		 int greater = numNodeGreater(root.children.get(i), x);
             
			if( ans > x){
			j++;
			}
		}
		return j;
	}

    public static void main(String args[]){

        TreeNode<Integer> root = takeInputLevelWise();
        // int ans = numNodes(root);
        // System.out.println(ans);
        // System.out.println(largest(root));
        // System.out.println(numNodeGreater(root, 1));
        // printAtK(root, 1);
        preOrder(root);
    }
}

