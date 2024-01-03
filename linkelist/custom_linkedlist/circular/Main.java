package linkelist.custom_linkedlist.circular;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(2);
         list.insertAtFirst(4);
         list.insertAtFirst(9);
         list.insertAtFirst(6);
         list.insertAtFirst(8);
         list.insertAtFirst(14);
         list.insertAtFirst(33);
         list.display();
         System.out.println();
         list.deleteValue(8);
        list.display();
    }
}
