/*Given a singly linked list of integers and position 'i',
 delete the node present at the 'i-th' position in the linked list recursively.
 
 Sample Input 2 :
2
30 -1
0
10 20 30 50 60 -1
4
Sample Output 2 :
10 20 30 50 
*/
package Link_List.Questions;

public class delete_node_recursively {
    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
    	//Your code goes here
        if(pos == 0 && head != null){
            return head.next;
        }
        if(head == null){
            return head;
        }

        Node<Integer> smallAns = deleteNodeRec(head.next, pos-1);
        head.next = smallAns;
        return head;
    
	}
}
