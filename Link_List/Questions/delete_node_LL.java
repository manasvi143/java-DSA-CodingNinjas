package Link_List.Questions;

public class delete_node_LL {
    public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// Write your code here.
		if(head == null){
			return head;
		}
		if(pos == 0 && head.next != null ){
			return head.next;
		}
		
		Node<Integer> temp = head;

		while(pos != 1 && temp != null){
				temp = temp.next;
				pos--;
		}
		if(temp == null){
			return head;
		}if(temp.next == null && pos == 1){
			return head;
		}else{
			temp.next = temp.next.next;
		}
		return head;

	}
}
