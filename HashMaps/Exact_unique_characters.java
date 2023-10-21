/*Given a string S, you need to remove all the duplicates.
 That means, the output string should contain each character

only once. The respective order of characters should remain
same, as in the input string. 
   
Sample Input 1 :
ababacd
Sample Output 1 :
abcd
Sample Input 2 :
abcde
Sample Output 2 :
abcde
*/

package HashMaps;

import java.util.HashMap;

public class Exact_unique_characters {
    public static String uniqueChar(String str){
		
		HashMap<Character,Integer> MJ = new HashMap<>();

		for(int i = 0 ; i< str.length() ; i++){

			if(MJ.containsKey(str.charAt(i)))
			MJ.put(str.charAt(i),str.charAt(i)+1);
			else
			MJ.put(str.charAt(i), 1);
		}

		String s = " ";

		for(int j = 0 ; j < str.length() ; j++){

			if(MJ.get(str.charAt(j)) != 0){
				s += str.charAt(j);
				MJ.put(str.charAt(j),0);
			}
		}

		return s.substring(1);
	}
}
