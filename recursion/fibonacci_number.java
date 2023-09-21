package recursion;

public class fibonacci_number {
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) +fibonacci(n-2);
    }
    public static void main(String[] args){
        int i = fibonacci(4);
        System.out.println(i);
    }
}
