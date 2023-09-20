package oops2.Exception_handling;

import oops2.Exception_handling.fraction.fractions;

public class try_catch {
    public static void main(String args[]){
        fractions f1 = new fractions();

        try{ f1.setDenominator(0);
        }catch(zeroDenominatorException e){
            System.out.println("denominator cannot be 0");
        }finally{
            System.out.println("finally is called");
        }
        /*in finally the code will always run whether it will get exception or not */
        
    } 
}
