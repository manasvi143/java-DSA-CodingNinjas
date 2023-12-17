package DP;

import java.util.Scanner;

public class countSteps {
    
    // knieve approch time complexity is high
    public static int countSteps(int n){

        if(n == 1)
        return 0;

        int opt1 = countSteps(n-1);
        int minSteps = opt1;

        if(n % 2 == 0){
            int opt2 = countSteps(n/2);
            if(opt2 < minSteps)
            minSteps = opt2;
        }

        if(n % 3 == 0){
            int opt3 = countSteps(n/3);
            if(opt3 < minSteps)
            minSteps = opt3;
        }
        return 1+minSteps;
    }

    // memoization approch is used in this :-
    public static int countStepsM(int n){
        int storage[] = new int[n+1]; 
        return countStepsM(n , storage);
    }
    public static int countStepsM(int n , int storage[]){

        if(n == 1){
            storage[n] = 0;
            return storage[n];
        }
        if(storage[n] != 0)
        return storage[n];

        int opt1 = countStepsM(n-1 , storage);
        int minSteps = opt1;

        if(n % 2 == 0){
            int opt2 = countStepsM(n/2 , storage);
            if(opt2 < minSteps)
            minSteps = opt2;
        }

        if(n % 3 == 0){
            int opt3 = countStepsM(n/3 , storage);
            if(opt3 < minSteps)
            minSteps = opt3;
        }
        storage[n] = 1+minSteps;
        return storage[n];
    }
    public static int countStepsDP(int n){
        int storage[] = new int[n+1];
        storage[1] = 0;

        for(int i = 2 ; i <= n ; i++){
            int min = storage[i-1];

            if(i % 3 == 0){
                if(storage[i/3] < min)
                min = storage[i/3];
            }

            if(i % 2 == 0){
                if(storage[i/2] < min)
                min = storage[i/2];
            }
            storage[i] = 1+min;
        }
        return storage[n];
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countStepsDP(n));
        System.out.println(countStepsM(n));
        System.out.println(countSteps(n));
    }
}
