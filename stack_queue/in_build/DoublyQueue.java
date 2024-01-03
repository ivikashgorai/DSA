package stack_queue.in_build;

import java.util.*;

public class DoublyQueue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(2); // just all methods have First and Last in it
        deque.addFirst(3);
        deque.addFirst(13);
        deque.remove();
        System.out.println(deque);
        System.out.println(deque.peekFirst());
    }
}
