/*You have been given a singly linked list of integers along with two integers, 
'M,' and 'N.' Traverse the linked list such that you retain the 'M' nodes,
 then delete the next 'N' nodes. Continue the same until the end of the linked list.
To put it in other words, in the given linked list, 
you need to delete N nodes after every M nodes.

Sample Input 1 :
1
1 2 3 4 5 6 7 8 -1
2 2
Sample Output 1 :
1 2 5 6
Sample Input 2 :
2
10 20 30 40 50 60 -1
0 1
1 2 3 4 5 6 7 8 -1
2 3
Sample Output 2 :
1 2 6 7

Explanation of Sample Input 2 :
For the first query, we delete one node after every zero elements hence removing
 all the items of the list. Therefore, nothing got printed.

For the second query, we delete three nodes after every two nodes, 
resulting in the final list, 1 -> 2 -> 6 -> 7.*/

package Link_List.Questions;

public class delete_every_N_Nodes {
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		
        if(head == null || N == 0){
            return head;
        }
        if(M == 0 ){
            return null;
        }
        Node<Integer> temp = head;
        Node<Integer> t = null;

        int  c ;

        while(temp != null){
            for(c =1 ; c != M ; c++){
                if(temp != null){
                temp = temp.next;
                }
            }
            if(temp != null){
            t = temp;
            for(c = 0 ; c != N ; c++){
                if( t != null){
                t = t.next;
                }
            }
            if( t != null && t.next != null){
                t = t.next;
                temp.next = t;
                temp = t;
            }else{
                temp.next = null;
                temp = temp.next;
            }
        }
        }
       return head;
	}
}
