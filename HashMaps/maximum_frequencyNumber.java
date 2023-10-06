/*You are given an array of integers that contain numbers in random order.
 Write a program to find and return the number which occurs the maximum times 
 in the given input.
If two or more elements are having the maximum frequency, return the element
 which occurs in the array first.
 
 Sample Input 1 :
13
2 12 2 11 12 2 1 2 2 11 12 2 6 
Sample Output 1 :
2
Sample Input 2 :
3
1 4 5
Sample Output 2 :
1
*/

package HashMaps;

import java.util.HashMap;

public class maximum_frequencyNumber {
     public static int maxFrequencyNumber(int[] arr){ 
	
	HashMap<Integer , Integer>  temp = new HashMap<>();

	for(int i = 0 ; i < arr.length ; i++){
		if(temp.containsKey(arr[i])){
		temp.put(arr[i] , temp.get(arr[i])+1);
		}
		else{
		temp.put(arr[i] , 1);
	}
	}
    int num = Integer.MIN_VALUE;
	int max = 0;

	for(int i = 0 ; i < arr.length ; i++){

		if(temp.get(arr[i]) > max){
		max = temp.get(arr[i]);
		num = arr[i];
		}
	}
	return num;
	
    }
}
