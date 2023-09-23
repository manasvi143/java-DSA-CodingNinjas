package Link_List.Questions;

public class reverser_LL_iterative {
    public static Node<Integer> reverse_I(Node<Integer> head){
        
        if(head == null || head.next == null){
            return head;
        }
         Node<Integer> temp = head;
         Node<Integer> prev = null;
         Node<Integer> nxt = null;
 
         while(temp != null){
             nxt = temp.next;
             temp.next = prev;
             prev = temp;
             temp = nxt;
         }
         return prev;
     }
 }


