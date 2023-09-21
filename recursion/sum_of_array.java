package recursion;

public class sum_of_array {
    public static int sum(int input[]) {
        
		if(input.length == 1){
			return input[0];
		}
		int smallinput[] = new int[input.length - 1];
		for(int i = 1 ; i< input.length ; i++){
			smallinput[i - 1] = input[i];
		}
		int answer = sum(smallinput);
		return answer+input[0];
	}
}
