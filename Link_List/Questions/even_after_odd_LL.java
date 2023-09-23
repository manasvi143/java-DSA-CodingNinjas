/*For a given singly linked list of integers, 
arrange the elements such that all the even numbers are placed after the odd numbers. 
The relative order of the odd and even terms should remain unchanged.

Sample Input 1 :
1
1 4 5 2 -1
Sample Output 1 :
1 5 4 2 
Sample Input 2 :
2
1 11 3 6 8 0 9 -1
10 20 30 40 -1
Sample Output 2 :
1 11 3 9 6 8 0
10 20 30 40
*/
package Link_List.Questions;

public class even_after_odd_LL {
    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        // If the list is empty or has only one element, return it as is.
     if( head == null || head.next == null){
            return head;
        }

        Node<Integer> smallAns = evenAfterOdd(head.next);
        if(head.data%2 != 0){
            head.next = smallAns;
            return head;
        }else{
            if(smallAns.data%2 == 0){
                head.next = smallAns;
                return head;
            }
            Node<Integer> temp = smallAns;
            Node<Integer> nxt = null;

            if(smallAns.next != null){
            while(temp.next.data%2 != 0 && temp.next != null){
                temp = temp.next;
            }
            }
            nxt = temp.next;
            temp.next = head;
            head.next = nxt;
            return smallAns;
        }
    }
}
