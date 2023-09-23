package Link_List.Questions;

public class length_of_LL {
    public static int length(Node<Integer> head){
        //Your code goes here
        if(head == null){
            return 0;
        }
        int i = 0 ;
        while(head != null){
            i++;
            head = head.next;            
        }
        return i;
    }
}
