package linkelist.dublicate;

public class Main {
    public static void main(String[] args) {
        LL node = new LL();
        node.insertAtFirst(1);
        node.insertAtFirst(1);
        node.insertAtFirst(2);
        node.insertAtFirst(3);
        node.insertAtFirst(3);
         node.display();
         node.deleteDub1();
         node.display();
    }
}
