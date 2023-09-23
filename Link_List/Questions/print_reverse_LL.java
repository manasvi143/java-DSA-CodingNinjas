package Link_List.Questions;

public class print_reverse_LL {
    public static void printReverse(Node<Integer> root) {
		//Your code goes here
	if(root == null){
		return;
	}
	printReverse(root.next);
	System.out.print(root.data + " ");
	}
}
