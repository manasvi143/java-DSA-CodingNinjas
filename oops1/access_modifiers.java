package oops1;

 class access_modifiers{
public static class student{
    private int rollNumber;
     String name;

    public void setRollnumber(int rn){
        rollNumber = rn;
    }
    public int getRollnumber(){
        return rollNumber;
        
    }
}
public static  void main(String []args){
        student s = new student();
        s.setRollnumber(12);
        System.out.println(s.getRollnumber());
}
}