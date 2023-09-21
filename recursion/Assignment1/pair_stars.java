package recursion.Assignment1;

public class pair_stars {
    public static String addStars(String s) {
		// Write your code here
		if(s.length() == 1){
			return s.charAt(0) + "";
		}

		String ans = addStars(s.substring(1));
		if(ans.charAt(0) == s.charAt(0)){
			return s.charAt(0) + "*" + ans;
		}else{
			return s.charAt(0) + ans;
		}
	}
}
