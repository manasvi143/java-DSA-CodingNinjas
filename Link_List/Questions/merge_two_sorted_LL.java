/*You have been given two sorted(in ascending order) singly linked lists of integers.
Write a function to merge them in such a way that the resulting singly 
linked list is also sorted(in ascending order) and return the new head to the list.

Sample input :
2
2 5 8 12 -1
3 6 9 -1
10 40 60 60 80 -1
10 20 30 40 50 60 90 100 -1

Sample Output  :
2 3 5 6 8 9 12 
10 10 20 30 40 40 50 60 60 60 80 90 100
*/
package Link_List.Questions;

public class merge_two_sorted_LL {
    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        Node<Integer> temp = null;
        Node<Integer> head = null;

         Node<Integer> t1 = head1;
          Node<Integer> t2 = head2;

        if(t1.data >= t2.data){
            head = t2;
            t2 = t2.next;
        }else{
            head = t1;
            t1 = t1.next;
        }
        temp = head;
        while(t1 != null && t2 != null){
            if(t1.data >= t2.data){
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
                
            }else{
                temp.next = t1;
                temp= t1 ; 
                t1 = t1.next;
            }
        }
        if(t1 == null && t2 != null){
            temp.next = t2;
        }
         if(t2 == null && t1 != null){
            temp.next = t1;
        }
        return head;
    }
}
