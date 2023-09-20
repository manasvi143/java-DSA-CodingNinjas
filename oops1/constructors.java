package oops1;

public class constructors {
    class student{
        int rollNum;
        String name;

        public student(int rn , String nam){
            rollNum = rn;
            name = nam;
        }
    }
}

 /* final keyword is used to make the variable unchangable, 
 means you can only able to initialise the variable once,
 we can initialize variable in two ways 
 1. at the time of creation of variable(private final int rollnum = 12;)
 2. inside the constructors.*/
