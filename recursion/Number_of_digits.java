package recursion;

public class Number_of_digits {
    public class Solution {
        public static int countDigits(int n){
            // Write your code here.
            if(n == 0){
                return 0;
            }
            
           int sample = countDigits(n/10);
           return sample +1;
            
           
        }
    }
}
