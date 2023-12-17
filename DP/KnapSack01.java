package DP;

public class KnapSack01 {
    // Recursive approch...
    public static int KnapSack(int weight[] , int value[] , int maxWeight){

        return KnapSack(weight , value , maxWeight , 0);
    }
    public static int KnapSack(int weight[] , int value[] , int maxWeight , int i){

        if(i == weight.length || maxWeight == 0)
        return 0;

        if(weight[i] > maxWeight){
            return KnapSack(weight , value , maxWeight , i+1);
        }else{
            // include this ith item...
            int op1 = value[i] + KnapSack(weight , value , maxWeight - weight[i] , i+1);
            // dont include...
            int op2 = KnapSack(weight , value , maxWeight , i+1);
            return Math.max(op1 , op2);
        }
    }
    // DP approch...
    public static int KnapSackDP(int weight[] , int value[] , int maxWeight){
        int n = value.length;
        int w = maxWeight;
        int storage[][] = new int[n+1][w+1];

        for(int i = n-1 ; i >= 0 ; i--){
            for(int j = 0 ; j <= w ; j++){
                int ans = 0;
                if(weight[i] <= j ){
                    int ans1 = value[i]+ storage[i+1][j-weight[i]];
                    int ans2 = storage[i+1][j];
                    ans = Math.max(ans1, ans2);
                }else{
                    ans = storage[i+1][j];
                }
                storage[i][j] = ans;
            }
            
        }
        return storage[0][w];
    }
    public static void main(String args[]){
        int weight[] ={6 , 1 , 2 , 4 , 5};
        int value[] = {10 , 5 , 4 , 8 , 6};
        int maxWeight = 5;
        System.out.println(KnapSackDP(weight , value , maxWeight));
        System.out.println(KnapSack(weight , value , maxWeight));
    }
}
