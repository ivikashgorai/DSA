package LinkedList.custom_linkedlist.doubly;

import java.security.PublicKey;

public class LL {

    private Node head;

    public void insertAtFirst(int value){
        Node one = new Node(value); // visualize as adding at first of some linkedlist
        one.next = head;
        one.prev = null;
         if(head!=null){
        head.prev = one;
        } // if there is no element and only beacuse what if head itself is null
        head = one;
    }

    public void display(){ // can also print this rev beacuse it has prev pointer(belo)
        Node temp;
        temp = head;
        while(temp!=null){
            System.out.print(temp.value+" --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayreverse(){
        Node temp;
        temp = head;
        while(temp.next!=null){ // last element mein pahuche
            temp = temp.next;
        }
        while(temp!=null){
            System.out.print(temp.value+" --> ");
            temp = temp.prev;
        }
        System.out.println("Start");
    }

    public void insertAtLast(int value){
        if(head==null){
            insertAtFirst(value);
            return;
        }
        Node temp;
        temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node last = new Node(value);
       temp.next = last;
       last.prev = temp;
       last.next = null;
    }

    public void insertAtPositon(int index,int value){
        if(index==0){
            insertAtFirst(value);
            return;
        }
        Node temp;
        temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        if(temp.next==null){
            insertAtLast(value);
            return;
        }
        Node temp2;
        temp2 = temp.next;
        Node node = new Node(value);
        temp2.prev = node;
        node.next = temp2;
        temp.next = node;
        node.prev = temp;
    }




    private class Node{
      private  int value;
       private Node next;
       private Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
