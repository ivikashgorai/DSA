package linkelist.custom_linkedlist.doubly;

public class Main {
    public static void main(String[] args) {
        LL one = new LL();
        one.insertAtFirst(2);
        one.insertAtFirst(6);
        one.insertAtFirst(8);
        one.insertAtFirst(14);
        one.insertAtFirst(33);
        one.insertAtLast(1);
        one.insertAtPositon(6, 0);
        one.display();
        one.displayreverse();
    }
}
