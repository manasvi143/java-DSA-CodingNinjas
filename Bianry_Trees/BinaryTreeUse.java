package Bianry_Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeUse {

    public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root , int target){
        if(root == null)
        return null;

        if( root.data == target){
            ArrayList<Integer> ans = new ArrayList<>(root.data);
            return ans;
        }
        ArrayList<Integer> L =  rootToNodePath(root.left, target);
        if(L!= null){
            L.add(root.data);
            return L;
        }
        ArrayList<Integer> R = rootToNodePath(root.right, target);
        if(R != null){
            R.add(root.data);
            return R;
        }else{
            return null;
        }
    } 
    public static void inorder(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }
    public static pair<Integer,Integer> diameterBetter(BinaryTreeNode<Integer> root){
        if(root == null){
            pair<Integer, Integer> ans = new pair<>();
            ans.first = 0 ;
            ans.second = 0;
            return ans;
        }
        pair<Integer,Integer> Lo = diameterBetter(root.left);
        pair<Integer,Integer> Ro = diameterBetter(root.right);

        int height = (1+ Math.max(Lo.first , Ro.first));
        int option1 = Lo.first + Ro.first;
        int option2 = Lo.second;
        int option3 = Ro.second;

        int diameter = Math.max(Math.max(option2, option3) , option1);

         pair<Integer, Integer> ans = new pair<>();
            ans.first = height ;
            ans.second = diameter;
            return ans;
        }
    public static int diameter(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0 ;
        }

        int option1 = height(root.left) + height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);

        return Math.max(option1, Math.max(option2, option3));
    }
    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){

        if(root == null){
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = 0;
            ans.isBal = true;
            return ans;
        }
        BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput = isBalancedBetter(root.right);

        boolean isBal = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        if(Math.abs(leftOutput.height - rightOutput.height) > 1){
            isBal =false;
        }
        if(!leftOutput.isBal || !rightOutput.isBal){
            isBal = false;
        }
        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isBal = isBal;

        return ans;
    }
    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs( rightHeight - leftHeight) > 1){
            return false;
        }

        boolean isleftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isleftBalanced && isRightBalanced;
    }
    public static int height(BinaryTreeNode<Integer> root) {
		if(root == null){
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		if(leftHeight > rightHeight){
			return leftHeight+1;
		}
		return rightHeight+1;
	}
    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){

        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            return null;
        }
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }
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
        System.out.println("Diameter: " + diameterBetter(root).second);
         System.out.println("Height: " + diameterBetter(root).first);
    }
}


