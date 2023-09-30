package Bianry_Trees;

import java.util.Scanner;

public class BinaryTreeUse {

    public static void printAtDepthK(BinaryTreeNode<Integer> root , int k){
        if(root == null){
            return;
        }
        if(k == 0){
            System.out.println(root.data);
            return;
        }
        printAtDepthK(root.left, k-1);
        printAtDepthK(root.right, k-1);
    }
    public static int numLeaf(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        } 
        return (numLeaf(root.left) + numLeaf(root.right));
    }
    public static int largest(BinaryTreeNode<Integer> root){
        if(root == null){
            return -1;
        }
        int leftLargest = largest(root.left);
        int rightLargest = largest(root.right);

        return Math.max(  root.data, Math.max(leftLargest, rightLargest));
    }
    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        int rootdata;
        System.out.println("Enter root node data ");
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNode = new QueueUsingLL<>();
        rootdata = sc.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
        pendingNode.enqueue(root);

        while(!pendingNode.isEmpty()){
            BinaryTreeNode<Integer> front;
            try {
                front = pendingNode.dequeue();
               
            } catch (QueueEmptyException e) {
                return null;
            }
             System.out.println("Enter Left node of " + front.data);
                int left = sc.nextInt();
                if(left != -1){
                    BinaryTreeNode<Integer> LeftNode = new BinaryTreeNode<Integer>(left);
                    front.left = LeftNode;
                    pendingNode.enqueue(LeftNode);
                }
                 System.out.println("Enter Right node of " + front.data);
                int right = sc.nextInt();
                if(right != -1){
                    BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<Integer>(right);
                    front.right = rightNode;
                    pendingNode.enqueue(rightNode);
                }
        }
        return root;
    }
    public static void print(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        String toBePrinted = root.data + "->";
        if(root.left != null){
            toBePrinted += "L:" + root.left.data + ",";
        }
        if(root.right != null){
            toBePrinted += "R:" + root.right.data + ",";
        }
        System.out.println(toBePrinted);
        print(root.left);
        print(root.right);
    }
    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        int rootdata;
        System.out.println("Enter root Data");
        rootdata = sc.nextInt();
        if(rootdata == -1){
            return null;
        }
        BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rootdata);
        child.left = takeInput(sc);
        child.right = takeInput(sc);

        return child;
    }
    public static int countNodes(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int ans = 1;
        ans += countNodes(root.left);
        ans += countNodes(root.right);

        return ans;
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);

        BinaryTreeNode<Integer> root = takeInputLevelWise();
        print(root);
        System.out.println(countNodes(root));
    }
}

