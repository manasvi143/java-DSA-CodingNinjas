package Queue;

import java.util.Queue;

public class reverse_queues {
    	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
		if(input.isEmpty() || input.size() == 1){
			return ;
		}
		int temp = input.remove();
		reverseQueue(input);
		input.add(temp);
	}
}
