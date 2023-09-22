/*Sample Input 1 :
2
6
2 6 8 5 4 3
4
2 3 4 7 
2
10 10
1
10
Sample Output 1 :
2 3 4
10
Sample Input 2 :
1
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
1 2 2 */

package Time_and_space_complexity;

import java.util.Arrays;

public class Array_intersecton {
    public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		 Arrays.sort(arr1);
        Arrays.sort(arr2);
        merge(arr1,arr2);

        }
     private static void merge(int arr1[] ,int arr2[]){
        int i=0,j=0;
        
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
}
}
