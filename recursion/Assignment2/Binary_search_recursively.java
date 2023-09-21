package recursion.Assignment2;

public class Binary_search_recursively {
    private static int helper(int input[],int element,int si,int ei)
    { 
        if(si>ei)
            return -1;

        int mid=(si+ei)/2 ;
        if(element==input[mid])
            return mid;
        else if(element<input[mid])
            return helper(input,element,si,mid-1);
        else         
            return helper(input,element,mid+1,ei);



    }
    public static int binarySearch(int []nums, int target) {
        // Write your code here.
        return helper(nums,target,0,nums.length-1);
    }
}
