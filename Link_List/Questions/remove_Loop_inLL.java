package Link_List.Questions;

public class remove_Loop_inLL {
    public static Node intersection(Node head){
        if(head == null)
        return head;
        
        Node fast = head;
        Node slow = head;
        
        while(fast != null && slow != null){
            fast = fast.next;
            
            if(fast != null)
            fast = fast.next;
            
            slow = slow.next;
            
            if(fast == slow)
            return slow;
            
        }
        return null;
    }
    public static Node startingNode(Node head){
        
        if(head == null)
        return head;
        
        Node inter = intersection(head);
        
        if(inter == null)
        return null;
        
        Node slow = head;
        Node fast = inter;
        
        while(slow  != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void removeLoop(Node head){
        
        
        
        Node start = startingNode(head);
        
        Node temp = start;
        
        while(temp != null){
            
            if(temp.next == start){
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
        
    }
}
