package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class remove_duplicates {

    public static ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer,Boolean> temp = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){

            if(temp.containsKey(arr[i]))
            continue;

            output.add(arr[i]);
            temp.put(arr[i], true);
        }
        return output;
    }
    

    public static void main(String args[]){

        int arr[] = {1, 2 ,3 ,4 ,5 ,1 ,3 ,6 ,7 , 1 ,100};
        ArrayList<Integer> ans = removeDuplicates(arr);

        ans.forEach( n-> System.out.println(n));
    }
}
