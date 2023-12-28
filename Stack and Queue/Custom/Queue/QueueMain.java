package Custom.Queue;

public class QueueMain {
public static void main(String[] args) {
    CustomQueue queue = new CustomQueue();
    queue.add(2);
    queue.add(6);
    queue.add(5);
    queue.add(4);
    queue.add(3);
    queue.add(7);
    queue.add(9);
    System.out.println(queue.remove());
    queue.display();

}  
}