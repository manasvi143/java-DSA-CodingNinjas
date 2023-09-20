package oops1;


public class static_keyword_and_function {
    static class Student{
        int rollnum;
        String name;
        private static int studentCount;
        /*use of static keyword for variable,
        studentCount is not different for every object of student class,
         * every object have access to studentCount,
         * iam using student count to count the total number of student object created,
         */

         public static int getStudentCount(){
            return studentCount;
         }
         /*static functions can be called on all the objects of local class and 
          * it will work same for every object,
          eg- print() function is non sattic and have diffferent value for every object,
              but getStudentCount() function is static so have same value for every object, 
              as we are using it to show no. of objects of local class,
           */

        public Student(int rollNum , String name ){
            this.rollnum = rollNum;
            this.name = name;
            studentCount++;
        }
    }
    public  static void main(String args[]){
        // Student s1 = new Student(12, null);
        //  Student s2 = new Student(12, null);
        //   Student s3 = new Student(12, null);

          System.out.println(Student.studentCount);
    }
}
