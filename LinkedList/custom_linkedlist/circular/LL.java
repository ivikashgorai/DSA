package LinkedList.custom_linkedlist.circular;

public class LL {
    private Node head;
    private Node tail;

    LL(){
        this.head = null;
        this.tail =null;
    }

    public void insertAtFirst(int value){
       Node node = new Node(value);
       if(head==null){
        head = node;
        tail = node;
        return;
       }
       else{
        node.next = head;
        tail.next = node;
       tail = node;
       }

    }

        public void display(){
            if(head==null){
                System.out.println("No element add");
                return;
            }
         Node temp;
         temp = head;
        do{ // its runs atleast once so to 
            System.out.print(temp.value+" --> ");
            temp  = temp.next;
        }while(temp!=head);
        System.out.print("Head");

    }

    public void deleteValue(int element){
          if(head==null){
                System.out.println("No element added");
                return;
            }
         Node temp;
         temp = head;
         if(head.value==element){
            // tail.next = head.next;
            head = head.next;
            return;
         }
            while(temp.next.value!=element){
                temp = temp.next;
            }
            temp.next = temp.next.next;
       
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
