package DP;

public class minimum_cost_path {
    
    // recursive approch 
    public static int minCost(int arr[][] ){

        return minCost(arr , 0 , 0);
    }
    public static int minCost(int arr[][] , int i , int j){

        int m = arr.length;
        int n = arr[0].length;

        if(i == m-1 && j == n-1)
        return arr[i][j];

        if(i >= m || j >= n)
        return Integer.MAX_VALUE;

        int opt1 = minCost(arr , i+1 , j);
        int opt2 = minCost( arr , i , j+1);
        int opt3 = minCost(arr, i+1, j+1);

        return arr[i][j]+ Math.min(opt1, Math.min(opt2, opt3));
    }

    // memoization approch...
    public static int minCostM(int arr[][]){
         int m = arr.length;
        int n = arr[0].length;
        int dp[][] = new int[m][n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                dp[i][j] = -1;
            }
        }
        return minCostM(arr , 0 , 0 , dp);
    }
    public static int minCostM(int arr[][] , int i , int j , int dp[][]){
        int m = arr.length;
        int n = arr[0].length;

        if(i == m-1 && j == n-1){
        dp[i][j] = arr[i][j];
        return arr[i][j];
        }

        if(i >= m || j >= n)
        return Integer.MAX_VALUE;

         if(dp[i][j] != -1)
        return dp[i][j];

        int opt1 = minCostM(arr , i+1 , j , dp);
        int opt2 = minCostM( arr , i , j+1 , dp);
        int opt3 = minCostM(arr, i+1, j+1 , dp);

        dp[i][j] = arr[i][j]+ Math.min(opt1, Math.min(opt2, opt3));

        return dp[i][j];
    }

    // DP approch...
    public static int minCostDP(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int dp[][] = new int[m][n];

        dp[m-1][n-1] = arr[m-1][n-1];

        // last row
        for(int i = n-2 ; i >=0 ; i--){
            dp[m-1][i] = arr[m-1][i]+dp[m-1][i+1];
        }
        //last column
        for(int j = m-2 ; j >= 0 ; j--){
            dp[j][n-1] = arr[j][n-1]+dp[j+1][n-1];
        }
        for(int i = m-2 ; i >= 0 ; i--){
            for(int j = n-2 ; j >= 0 ; j--){
                dp[i][j] = arr[i][j] + Math.min(dp[i][j+1], Math.min(dp[i+1][j], dp[i+1][j+1]));
            }
        }
        return dp[0][0];
    }
    public static void main(String args[]){
        int arr[][] = {{1 , 1 , 1} ,{4 , 5 , 2} , {7 , 8 , 9} };
        System.out.println(minCostDP(arr));
        System.out.println(minCostM(arr));
        System.out.println(minCost(arr));
    }
}
