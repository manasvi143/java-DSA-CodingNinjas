package recursion;

public class check_number_array {
    public static boolean checkNumber(int input[], int x) {
		
		if(input.length == 1 && input[0] == x){
			return true;
		}
		if(input.length == 1 && input[0] != x){
			return false;
		}
		int smallinput[] = new int[input.length - 1];
		for(int i = 1 ; i < input.length ; i++){
			smallinput[i-1] = input[i];
		}
		boolean ans = checkNumber(smallinput, x);
		if(ans == true){
			return true;
		}else{
			if(input[0] == x){
				return true;
			}else{
				return false;
			}
		}
	}
}
