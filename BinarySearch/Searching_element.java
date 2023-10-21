package BinarySearch;

public class Searching_element {

    public static int binarySearch(int[]a , int k){

        int low = 0;
        int high = a.length -1;

        while(low <= high){
            int mid = low + ((high -  low)>>1);

            if(a[mid] == k){
            return mid;
        }
        else{
            if(a[mid] < k)
            low = mid +1;
            else
            high = mid-1;
        }

        }
        return -1;
    }
    public static void main(String Args[]){

        int arr[] = {1 , 2 ,3, 4, 5 ,6 };

        int ans = binarySearch(arr, 5);
        System.out.println(ans);

    }
}
