package recursion;

public class sum_of_digits {
    public static int sumOfDigits(int input){
		// Write your code here
		if(input < 10){
			return input;
		}
		int smallans = sumOfDigits(input/10);
		return smallans + (input%10);
	}
}
