/*Sample Input 1 :
1
3 4 5 2 6 1 9 -1
100
Sample Output 1 :
-1
Sample Input 2 :
2
10 20010 30 400 600 -1
20010
100 200 300 400 9000 -34 -1
-34
Sample Output 2 :
1
5 */

package Link_List.Questions;

public class find_a_Node_in_LL_recursively {
    public static int findNodeRec(Node<Integer> head, int n) {
    	
        if(head == null){
            return -1;
        }
        if(head.data == n){
            return 0;
        }
        int smallAns = findNodeRec(head.next, n);
        if(smallAns == -1){
            return -1;
        }
        return smallAns + 1;
	}
}
