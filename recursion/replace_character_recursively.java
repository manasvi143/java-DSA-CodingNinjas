package recursion;

public class replace_character_recursively {
    public static String replaceCharacter(String input, char c1, char c2) {
	
        if(input.length() == 0){
            return "";
        }
        if(input.length() == 1 && input.charAt(0) == c1){
            return c2 +"";
        }
        if(input.length() == 1 && input.charAt(0) != c1){
            return input.charAt(0) + "";
        }
        String smallAns = replaceCharacter(input.substring(1), c1, c2);
            if(input.charAt(0) == c1){
                return c2+smallAns;
            }else{
                return input.charAt(0) + smallAns;
            }
    
        }
}
