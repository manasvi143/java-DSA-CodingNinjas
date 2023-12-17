package DP;

import java.util.Scanner;

public class fibonaaciii {
    
    // nieve approch time complexity is 2^n
    public static int  fib(int n){

        if(n == 0 || n == 1)
        return n;

        return fib(n-1)+fib(n-2);
    }
    // meomoization approch time complexity O(n), but space complexity increases
    public static int  fibM(int n){
        int storage[] = new int[n+1];

        for(int i = 0 ; i <= n ; i++){
            storage[i] = -1;
        }
        return fibM(n , storage);
    }
    public static int fibM(int n , int storage[]){
        if(n == 0 || n == 1){
            storage[n] = n;
            return storage[n];
        }
        if(storage[n] != -1)
        return storage[n];

        storage[n] = fibM(n-1 , storage) + fibM(n-2 , storage);
        return storage[n];
    }

    // recursin is eleminated 
    public static int fibDP(int n ){

        int storage[] = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;

        for(int i = 2 ; i <= n ; i++){
            storage[i] = storage[i-1]+storage[i-2];
        }
        return storage[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibDP(n));
        System.out.println(fibM(n));
        System.out.println(fib(n));
        
    }
}
