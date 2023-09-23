package Link_List.Questions;

public class reverse_LL_recursively {
    public static Node<Integer> reverseRec(Node<Integer> head) {
		//Your code goes here
        if( head == null || head.next == null ){
            return head;
        }

        Node<Integer> smallAns = reverseRec(head.next);
        Node<Integer> temp = smallAns;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return smallAns;
	}
}
