package DP;

public class Lowest_common_SubSequence {
    
    // recursive code 
public static int LCS(String a , String b){

    if(a.length() == 0 || b.length() == 0)
    return 0;

    if(a.charAt(0) == b.charAt(0)){
        return 1+ LCS(a.substring(1), b.substring(1));
    }else{
        int op1 = LCS(a.substring(1), b);
        int op2 = LCS(a , b.substring(1));
        // int op3 = LCS(a.substring(1) , b.substring(1)); --> this case gets handled in op1 & op2 automatically 
        return Math.max(op2, op1 );
    }
}
// memoization code 
public static int LCSm(String a , String b){
    int storage[][] = new int[a.length()+1][b.length()+1];
    for(int i = 0 ; i < a.length()+1 ; i++){
        for(int j = 0 ; j< b.length()+1 ; j++){
            storage[i][j] = -1;
        }
    }
    return LCSm(a , b , storage );
}
public static int LCSm(String a , String b, int storage[][]){
    int m = a.length();
    int n = b.length();

    if(storage[m][n] != -1)
    return storage[m][n];

    if(m == 0 || n ==0){
    storage[m][n] = 0;
    return storage[m][n];
    }

    if(a.charAt(0) == b.charAt(0)){
        storage[m][n] = 1+LCSm(a.substring(1), b.substring(1) , storage);
    }else{
        int op1 = LCSm(a , b.substring(1) , storage);
        int op2 = LCSm(a.substring(1) , b , storage);
        storage[m][n] = Math.max(op1, op2);
    }
    return storage[m][n];
}
// DP approch 
public static int LCSdp(String a , String b){
    int m = a.length();
    int n = b.length();

    int storage[][] = new int[m+1][n+1];

    for(int i = 0 ; i <= m ; i++){
        storage[m][0] = 0;
    }
    for(int i = 0 ; i <= n ; i++){
        storage[0][n] = 0;
    }

    for(int i = 1; i <= m ; i++){
        for(int j = 1 ; j <= n ; j++){

            if(a.charAt(m-i) == b.charAt(n-j)){
            storage[i][j] = 1+ storage[i-1][j-1];
            }else
            {
                storage[i][j] = Math.max(storage[i-1][j] , storage[i][j-1]);
            }
        }
    }
    return storage[m][n];
}
public static void main(String args[]){
    String a = "agih";
    String b = "abegi";

     System.out.println(LCSdp(a , b));
    System.out.println(LCSm(a , b));
    System.out.println(LCS(a, b));
}
}
