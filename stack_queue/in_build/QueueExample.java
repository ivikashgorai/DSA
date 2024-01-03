package stack_queue.in_build;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(1);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.poll()); //prints and remove the first element
        System.out.println(queue.remove(1)); // removes first match from left
        System.out.println(queue.remove()); // remove first from left
        System.out.println(queue.add(7)); //adds from right
        System.out.println(queue.peek()); // print first element
        System.out.println(queue); // print the queue
    }
}
