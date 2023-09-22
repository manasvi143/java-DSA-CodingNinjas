package Link_List.Questions;

public class print_ith_node {
    public static void printIthNode(Node<Integer> head, int i){
		
		while(i != 0 && head != null){
			head = head.next;
			i--;
		}
		if(head == null){
			System.out.println();
		}else{
			System.out.println(head.data);
		}
    }
}
