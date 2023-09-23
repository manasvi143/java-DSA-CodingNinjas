/*1
1 2 3 3 3 3 4 4 4 5 5 7 -1
Sample Output 1 :
1 2 3 4 5 7 
Sample Input 2 :
2
10 20 30 40 50 -1
10 10 10 10 -1
Sample Output 2 :
10 20 30 40 50
10 */
package Link_List.Questions;

public class remove_duplicate_LL {
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
if(head==null)
            return head;
        if(head.next==null)
            return head;
        Node<Integer> t1=head,t2=head.next;
        Node<Integer> finalhead=head;
        while(t2!=null){
            if(t1.data.equals(t2.data))
            {
                t2=t2.next; 
            }
            else{
                t1.next=t2;
                t1=t2;
            }
        }

        t1.next=null;
        return finalhead;
}
}
