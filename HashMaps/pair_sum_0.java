/*Given a random integer array A of size N. Find and print the count 
of pair of elements in the array which sum up to 0.

Sample Input 1:
5
2 1 -2 2 3
Sample Output 1:
2
*/

package HashMaps;

import java.util.HashMap;

public class pair_sum_0 {
    public static int PairSum(int[] input, int size) {
		
		HashMap<Integer , Integer> ans = new HashMap<>();

		for(int temp : input){
			if(ans.containsKey(temp))
			ans.put(temp, ans.get(temp)+1);
			else
			ans.put(temp, 1);
			
		}

		int sol = 0;
		for(int i : ans.keySet()){

		if(ans.containsKey(-i) && i != 0){
			sol = sol + (ans.get(i)*ans.get(-i));
		}
		}
		sol = sol>>1;

		if(ans.containsKey(0)){
			int val = (ans.get(0)*(ans.get(0)-1) )>>1;
			sol += val;
		}

		return sol;
	}
}
