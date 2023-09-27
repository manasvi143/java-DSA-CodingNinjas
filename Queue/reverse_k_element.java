/*For a given queue containing all integer data, reverse the first K elements.
You have been required to make the desired change in the input queue itself.

Sample Input 1:
5 3
1 2 3 4 5
Sample Output 1:
3 2 1 4 5
Sample Input 2:
7 7
3 4 2 5 6 7 8
Sample Output 2:
8 7 6 5 2 4 3*/

package Queue;

import java.util.Queue;

public class reverse_k_element {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
			//Your code goes here
        if (input.size()>k)
        {
            k=k%input.size();
        }
        if (k==0 || k==1)
        {
            return input;
        }
        
        reverseQueue(input,k);
        
        for (int i=0;i<input.size()-k;i++)
        {
            input.add(input.remove());
        }
        
        return input;
        
	}
    
    public static void reverseQueue(Queue<Integer> input, int k) 
    {
		//Your code goes here
        if (input.size()==0 || input.size()==1 || k==0)
        {
            return;
        }
        
        int temp=input.remove();
        reverseQueue(input,k-1);
        input.add(temp);
	}

}
