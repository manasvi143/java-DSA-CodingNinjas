package DP;

public class Edit_Distance {
    // recursive approch....
    public static int ed(String s , String t){
         
        if(s.length() == 0 )
        return t.length();

        else if(t.length() == 0)
        return s.length();

        if(s.charAt(0) == t.charAt(0)){
            return ed(s.substring(1) , t.substring(1));
        }
        
            int op1 = ed(s, t.substring(1));
            int op2 = ed(s.substring(1) , t);
            int op3 = ed(s.substring(1) , t.substring(1));
            return  1+ Math.min(op1, Math.min(op2, op3));
        
    }
    // memoization approch....
    public static int edM(String s , String t){
        int m = s.length();
        int n = t.length();
        int Storage[][] = new int[m+1][n+1];
        for(int i = 0 ; i<= m ; i++){
            for(int j = 0 ; j <= n ; j++){
                Storage[i][j] = -1;
            }
        }
        return edM(s , t , Storage);
    }
    public static int edM(String s , String t , int Storage[][]){
        int m = s.length();
        int n = t.length();

        if(Storage[m][n] != -1)
        return Storage[m][n];

         if(m == 0 ){
            Storage[m][n] = n;
            return n;
         }
        else if(n == 0){
             Storage[m][n] = m;
             return m;
        }
        if(s.charAt(0) == t.charAt(0)){
            Storage[m][n] = edM(s.substring(1) , t.substring(1) , Storage);
        }
        else{
            // insert
            int op1 = edM(s, t.substring(1) , Storage);
            // delete 
            int op2 = edM(s.substring(1) , t , Storage);
            // suibstitute
            int op3 = edM(s.substring(1) , t.substring(1) , Storage);
            Storage[m][n] = 1+ Math.min(op1, Math.min(op2, op3));
        }
            return  Storage[m][n];
    }
    public static int edDP(String s , String t){
        int m = s.length();
        int n = t.length();
        int Storage[][] = new int[m+1][n+1];

        for(int i = 0 ; i <= n ; i++){
            Storage[0][i] = i;
        }
        for(int i = 0 ;i <= m ; i++){
            Storage[i][0] = i;
        }
        for(int i = 1 ; i <= m ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(s.charAt(m-i) == t.charAt(n-j)){
                    Storage[i][j] = Storage[i-1][j-1];
                }else{
                    int op1 = Storage[i-1][j];
                    int op2 = Storage[i][j-1];
                    int op3 = Storage[i-1][j-1];

                    Storage[i][j] = 1 + Math.min(op1 , Math.min(op2, op3));
                }
            }
        }
        return Storage[m][n];
    }

    public static void main(String args[]){
        String s = "adef";
        String t = "gbde";
        System.out.println(edDP(s, t));
        System.out.println(edM(s, t));
        System.out.println(ed(s, t));
    }
}
