package Stacks.StackUsingArray;

public class Stack_Using_Array {
    private int data[];
    private int top;

    public Stack_Using_Array(int capacity){

        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty(){

        return (top == -1);
    }

    public int size(){

        return top+1;
    }

    public int top() throws stackEmptyException{

        if(size() == 0){
            // throw StackEmpty exception 
            stackEmptyException e = new stackEmptyException();
            throw e;
        }
        return data[top];
    }
    public void push(int element) throws stackFullException{

        if(size() == data.length){
            // stackFullException e = new stackFullException();
            // throw e;
        }

        top++;
        data[top] = element;
    }

    private void doubleCapacity(){
        int temp[] = data;
        data = new int[temp.length << 1];

        for(int i = 0 ; i <=top ; i++){
            data[i] = temp[i];
        }
    }

    public int pop() throws stackEmptyException{

        if(size() == 0){
            stackEmptyException e = new stackEmptyException();
            throw e;
        }

        int temp = data[top];
        top--;
        return temp;
    }
}
