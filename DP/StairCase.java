package DP;

public class StairCase {
    
    // recursive approch
    public static int count(int n){

        if(n <= 1)
        return 1;

        int opt1 = count(n-1);
        int sum = opt1;
        if(n-2 >=0){
        int opt2 = count(n-2);
        sum += opt2;
        }
        if(n-3 >= 0){
        int opt3 = count(n-3);
        sum += opt3;
        }
        
        return sum;
    }
    public static int countDP(int n ){
        int storage[] = new int[n+1];
        storage[0] = 1;
        storage[1] = 1;

        for(int i = 2 ; i <= n ; i++){

            int sum = storage[i-1];
            if(i >=2)
            sum += storage[i-2];
            if(i >=3)
            sum += storage[i-3];

            storage[i] = sum;
        }
        return storage[n];
    }

    public static void main(String args[]){
        int n = 2;
         System.out.println(countDP(n));
        System.out.println(count(n));
    }
}
