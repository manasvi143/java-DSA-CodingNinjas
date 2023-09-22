/*You have been given an integer array/list(ARR) and a number 'num'. 
 Find and return the total number of pairs in the array/list which sum to 'num'. */
 
package Time_and_space_complexity;

public class pair_sum_in_array {
    public static int pairSum(int[] arr, int num) {
		int k = 0;
		//Your code goes here
	    for(int i=0;i<arr.length;i++)
{ 
    for(int j=i+1;j<arr.length;j++)
    {
     
      
        if(arr[i]+arr[j]==num)
        {
         k++;
        }
    }
}
	
	return k;
	}
}
