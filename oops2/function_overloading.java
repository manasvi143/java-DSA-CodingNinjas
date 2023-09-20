package oops2;

public class function_overloading {
    static class vehicle{
        int name;

        void print(){
            System.out.println("vehicle class");
        }
    }
    static class car extends vehicle {
       void print(){
        System.out.println("car class");
       }

    }
    public static void main(String args[]){
        vehicle v = new vehicle();
        car c = new car();

        v.print();
        c.print();

        /*car class is the inherited class of of vehicle,
         * and both car and vehicle have the print function this is called function overloading,
         * and always first compiler check for the function in the class, if not present then go to parent class,
         * 
         */

    }
}
