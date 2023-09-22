package Link_List;

import java.util.Scanner;

public class Link_List_use {

    public static Node<Integer> takeInput(){

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }
        Node<Integer> head = null;
        
        while(data != -1){
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null){
            head = newNode;}
            else{
                Node<Integer> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
            data = sc.nextInt();
        
        }
        return head;
    }
    
    public static void print(Node<Integer> head){
        if(head.next  == null){
            System.out.println(head);
        }

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String args[]){
        Node<Integer> head = takeInput();
        print(head);
    }
}
