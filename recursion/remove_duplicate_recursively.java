package recursion;

public class remove_duplicate_recursively {
    public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		
		if(s.length() == 1){
			return s.charAt(0) + "";
		}

		String smallAns  = removeConsecutiveDuplicates(s.substring(1));
		if(s.charAt(0) == smallAns.charAt(0)){
			return smallAns;

		}else{
			return s.charAt(0) + smallAns;
		}
	}
}
