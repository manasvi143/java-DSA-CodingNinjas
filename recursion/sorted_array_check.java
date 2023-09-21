package recursion;

public class sorted_array_check {
    public static boolean checkSort(int[] arr){

        if(arr.length ==1){
            return true;
        }
        int smallarr[] = new int[arr.length -1];
        for(int i = 1 ; i < arr.length; i++){
            smallarr[i-1] = arr[i];
        } 

        boolean smallAns = checkSort(smallarr);

        if(!smallAns){
            return false;
        }
        if(arr[0] <= arr[1]){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String []args){
        int array[] = {7,4,5,6};
        System.out.println(checkSort(array));
    }
}
