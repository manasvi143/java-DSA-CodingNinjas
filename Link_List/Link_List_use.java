package Link_List;

import java.util.Scanner;

public class Link_List_use {
    public static Node<Integer> evenList(Node<Integer> head){
        if(head.next == null && head.data%2 == 0){
            return head;
        }
          if(head.next == null && head.data%2 != 0){
            return null;
        }

        Node<Integer> smallAns = evenList(head.next);
        if(head.data%2 == 0){
            head.next = smallAns;
            return head;
        }else{
        return smallAns;
        }
        
    }
    public static Node<Integer> oddList(Node<Integer> head){

        if(head.next == null && head.data%2 == 0){
          return null;
      }
        if(head.next == null && head.data%2 != 0){
          return head;
      }
        

      Node<Integer> smallAns = oddList(head.next);
      if(head.data%2 != 0){
          head.next = smallAns;
          return head;
      }else{
      return smallAns;
      }
    }
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        Node<Integer> t1=head,t2=head.next;
        Node<Integer> finalhead=head;
        while(t2!=null){
            if(t1.data.equals(t2.data))
            {
                t2=t2.next; 
            }
            else{
                t1.next=t2;
                t1=t2;
            }
        }

        t1.next=null;
        return finalhead;
    }
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
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		
        if(head == null || N == 0){
            return head;
        }
        if(M == 0 ){
            return null;
        }
        Node<Integer> temp = head;
        Node<Integer> t = null;

        int  c ;

        while(temp != null){
            for(c =1 ; c != M ; c++){
                if(temp != null){
                temp = temp.next;
                }
            }
            if(temp != null){
            t = temp;
            for(c = 0 ; c != N ; c++){
                if( t != null){
                t = t.next;
                }
            }
            if( t != null && t.next != null){
                t = t.next;
                temp.next = t;
                temp = t;
            }else{
                temp.next = null;
                temp = temp.next;
            }
        }
        }
       return head;
	}

    public static void main(String args[]){
        Node<Integer> head = takeInput();
        // Node<Integer> head1 = evenList(head);
        // Node<Integer> head2 = oddList(head);
        // print(head1);
        Node<Integer>head2 = skipMdeleteN(head, 2, 3);
        System.out.println();
        print(head2);
    }
}
