package LinkedList.custom_linkedlist.single;

public class Main {
    public static void main(String[] args) {
        LL one = new LL();
        one.insertAtFirst(2);
        one.insertAtFirst(6);
        one.insertAtFirst(8);
        one.insertAtFirst(14);
        one.insertAtLast(22);
        one.insertAtLast(33);
        one.insertAtPosition(3, 5);
        int a = one.deleteFirst(); // 14 deleted
        System.out.println(a);
        one.deletelast(); //33 deleted
        one.deleteAtPosition(1);
        System.out.println(one.findValue(22)); // prints 3(index)
        one.display();
    }
}
