/*You have been given a random integer array/list(ARR) of size N. 
Write a function that rotates the given array/list by D elements(towards the left).
Sample Input 1:
1
7
1 2 3 4 5 6 7
2
Sample Output 1:
3 4 5 6 7 1 2
Sample Input 2:
2
7
1 2 3 4 5 6 7
0
4
1 2 3 4
2
Sample Output 2:
1 2 3 4 5 6 7
3 4 1 2 */

package Time_and_space_complexity;

public class rotate_array {
    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        if(d<=0)
    return;
        if(d>arr.length)
            d=d-arr.length;
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,arr.length-1-d);
        reverseArray(arr,arr.length-d,arr.length-1);

    }
    private static void reverseArray(int[] arr,int start,int end)
    {
        int temp;
        while(start<end){
            temp = arr[start];  
            arr[start++] = arr[end]; 
            arr[end--] = temp; 
            
        }
    }
}
