package oops2.Exception_handling;

public class fraction {
    static class fractions{
         int numerator;
        private int denominator;

        public void setDenominator(int denominator) throws zeroDenominatorException {
            if(denominator == 0){
                zeroDenominatorException e = new zeroDenominatorException();
                throw e; 
            }
            this.denominator = denominator;

        }
    }
}
