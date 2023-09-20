package recursion;

public class calculate_power {
    public static int power(int x, int n) {
        
		if(n == 0){
			return 1;
		}

		int p = power ( x , n-1);
			return p*x;
		
	}
}
