package Trees;

import java.util.Scanner;

public class Tree_Use {
    
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

    

    public static void main(String args[]){

        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
    }
}

