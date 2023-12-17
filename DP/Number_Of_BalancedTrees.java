package DP;

/*Given an integer h, find the possible number of balanced binary trees of height h. You just need to return the count of possible binary trees which are balanced.
This number can be huge, so, return output modulus 10^9 + 7.
Time complexity should be O(h).
Input Format :
The first and only line of input contains an integer, that denotes the value of h. Here, h is the height of the tree.
Output Format :
The first and only line of output contains the count of balanced binary trees modulus 10^9 + 7.
 */
public class Number_Of_BalancedTrees {
    // recursive Approch
    private static long balancedBTs(long n,int mod){
        if(n==0||n==1){
            return 1;
        }
        long x=balancedBTs(n-1);
        long y=balancedBTs(n-2);
        return (x*x +2*x*y)%mod;
    }
	public static long balancedBTs(long n){

		int mod=(int)Math.pow(10,9)+7;
        return balancedBTs(n,mod);
	}

    // Dp approch 
    public static int balancedBTs(int height){

		int storage[] = new int[height+1];
		storage[0] = 1;
		storage[1] = 1;

		 int mod=(int)Math.pow(10,9)+7;

		for(int i = 2 ; i <= height ; i++){
			int x = storage[i-1];
			int y = storage[i-2];

			long a=(long)x*x;
            long b=(long)x*y*2;
            int value1=(int)(a%mod);
            int value2=(int)(b%mod);
            storage[i]=(value1+value2)%mod;
		}
		return storage[height];
	}
}
