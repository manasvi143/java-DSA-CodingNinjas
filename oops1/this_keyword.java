package oops1;

public class this_keyword {
    class student{
        int rollnum;
        String name;

        public student(int rollnum ,String name){
            this.rollnum = rollnum;
            this.name = name;

            /*to acess the variable having same name as local variable we use 
             * this keyWord in front of the variable we want access as local variable,
             */
            System.out.println(this); 
            /*above code print the the address/refference of abjects created using
             * the constructor.
             */
        }
    }
}
