package DP;

public class minimum_count_of_Squares {

    //recursive...
    public static int minCount(int n){

        if(n == 0)
        return 0;
        if(n == 1)
        return 1;

        int opt1 = minCount(n-1);
        int min = opt1;

        if(n > 3){
        for(int i = 2 ; i*i <= n ; i++){
            int opt2 = minCount(n -(i*i));
            if(opt2 < min)
            min = opt2;
        }
    }
        return min+1;
    }

    public static int minCountDP(int n ){
        // if(n <4)
        // return n;
		// int storage[] = new int[n+1];
        // storage[0] = 0;
        // storage[1] = 1;
        // storage[2] = 2;
        // storage[3] = 3;

        // if(n <4)
        // return storage[n];

        // for(int i = 4 ; i <= n ; i++ ){
        //     int min = storage[i-1]+1;
        //     for(int j = 2 ; j <= Math.pow(i, 0.5) ; j++){
        //     int opt2 = storage[Math.abs(i -(int)Math.pow(j, 2))];
        //     opt2 += 1;
        //     if(opt2 < min)
        //     min = opt2;
        // }
        //     storage[i] = min;
            
        // }
       
        // return storage[n];

        int [] dp = new int[n+1];
        dp[0] = 0;

        for(int i = 1 ; i <= n ; i++){
            int minans = Integer.MAX_VALUE;
            for(int j = 1 ; j*j <= i ; j++ ){
                int currans = dp[i - (j*j)];
                if(minans > currans)
                minans = currans;
            }
            dp[i] = minans+1;
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n = 8;
        System.out.println(minCountDP(n));
        System.out.println(minCount(n));
    }
}
