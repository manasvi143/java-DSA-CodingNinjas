package recursion;

public class multiplication {
    public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(m == 1){
			return n;
		}
		if(m == 0){
			return 0;
		}
		int smallAns = multiplyTwoIntegers(m-1, n);
		if(m == 0){
			return 0;
		}else{
		return smallAns+n;
		}
	}
}
