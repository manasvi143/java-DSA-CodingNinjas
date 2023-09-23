/*You have been given a singly linked list of integers along with an integer 'N'.
 Write a function to append the last 'N' nodes towards the front of the 
 singly linked list and returns the new head to the list.
 
 Sample Input 1 :
2
1 2 3 4 5 -1
3
10 20 30 40 50 60 -1
5
Sample Output 1 :
3 4 5 1 2
20 30 40 50 60 10
Sample Input 2 :
1
10 6 77 90 61 67 100 -1
4
Sample Output 2 :
90 61 67 100 10 6 77  */

package Link_List.Questions;

public class append_last_end_to_first {
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
		if(head == null || head.next == null || n == 0){
			return head;
		}
		Node<Integer> temp = head;
		Node<Integer> newHead = null;
		int length = 1 ;

		while(temp.next != null){
				length++;
				temp = temp.next;
		}
		if(length <= n ){
			return head;
		}else{
			
			length = length-n;
			Node<Integer> temp1 = head;

			while(length != 1){
				temp1 = temp1.next;
				length--;
			}
			newHead = temp1.next;
			temp1.next = null;
			temp.next = head;

		}
		return newHead;

	}
}
