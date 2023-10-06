package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class Hashmap_test {
    

    public static void main(String args[]){

        HashMap< String, Integer> temp = new HashMap<>();

        //insert
        temp.put("abc", 1);
        temp.put("def", 2);

        // size of map
        System.out.println("size->" + temp.size());

        //check availablity 
        if(temp.containsKey("abc"))
        System.out.println("abc is present");

        if(temp.containsKey("abc1"))
        System.out.println("abc1 is present");

        // get value
        int v = 0;
        if(temp.containsKey("abc1"))
        v = temp.get("abc1");
        System.out.println(v);

        // check availablity of value 
        if(temp.containsValue(2)) // this function is exprensive function timecomplexity of O(n) 
        System.out.println("2 is present");

        // remove
        int s = temp.remove("abc");
        System.out.println(s);

        //iterate all the keys
        Set<String> keys = temp.keySet(); // this do not maintain the order of keys
        for(String str : keys)
        System.out.println(str);

        //every operation on key is O(1) but operation on value is O(n)

    }
}
