package recursion;

public class factorial {
    public static int fac(int n){
        if(n == 0  ){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        int smallAns = fac(n-1);
        return smallAns*n;
    }

    public static void main(String args[]){
        int a = fac(-1);
        System.out.println(a);
    }
}
