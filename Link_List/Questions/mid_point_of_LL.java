package Link_List.Questions;

public class mid_point_of_LL {
    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast .next.next;
        }
        return slow;
    }
}
