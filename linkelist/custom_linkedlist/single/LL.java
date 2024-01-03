package linkelist.custom_linkedlist.single;

/**
 * LinkedList
 */
public class LL { // private isliye rake hai kyuki bahar se access na kar sake
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void reverse(){
       head = recRev(head);
    }
 private Node recRev(Node head){
    if (head == null || head.next == null) {
        return head;
    }
    Node reversedList = recRev(head.next);


    head.next.next = head;
    head.next = null;
    
    return reversedList;
    }

   
    public void insertRec(int value, int index) { // recursion use karke ek value ko ek index pe daalna hai
    insertRec1(value, index, head);
    }
    private void insertRec1(int value,int index,Node temp){ // ise private kar diya taki main file mein na call ho 
        if(index==1){
            Node one = new Node(value);
            one.next = temp.next;
            temp.next = one;
            return;
        }
        insertRec1(value, index-1, temp.next);
        return;
    }
    public void bubbleSort(){
     head = bubble(head);

    }
    private Node bubble(Node head){
         if(head==null || head.next==null){
            return head;
        }
        Node length = head;
        Node first = head;
        int len = 0;
        Node temp = new Node(0);
        while(length!=null){
            len+=1;
            length = length.next;
        }
        for(int i=1;i<=len-1;i++){
            for(int j=1;j<=len-1-i;j++){
                if(first.value>first.next.value){   
                    first.next = first.next.next;
                    first.next.next = first;                 
                }
                temp.next = first;
                first = first.next;
            }
            first = temp;
        }
        return first;
    }
    public void insertAtFirst(int value) {
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
        size += 1;
        if (tail == null) {
            tail = head;
        }
    }

    public void display() {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -->  ");
            temp = temp.next;
        }
        System.out.println("End");

    }

    public void insertAtLast(int value) {
        if (tail == null) {
            insertAtFirst(value);
            size += 1;
        } else {
            Node temp = new Node(value);
            tail.next = temp; // if tail is given
            tail = temp;
            size += 1;
        }
    }

    public void insertAtPosition(int index, int value) {
        if (index == 0) {
            insertAtFirst(value);
            size += 1;
            return;
        }
        if (index == size) {
            insertAtLast(value);
            size += 1;
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node add = new Node(value);
        add.next = temp.next;
        temp.next = add;
        size += 1;
    }

    public int deleteFirst() {
        int removedValue = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size -= 1;
        return removedValue;
    }

    public void deletelast() {
        Node temp = head;
        if (size == 1) {
            deleteFirst();
            size -= 1;
            return;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size -= 1;
    }

    public void deleteAtPosition(int index) {
        if (index == 0) {
            deleteFirst();
            size -= 1;
            return;
        }
        if (index == size - 1) {
            deletelast();
            size -= 1;
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node temp1 = temp.next.next;
        temp.next = temp1;
        size -= 1;
    }

    public int findValue(int element) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == element) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}