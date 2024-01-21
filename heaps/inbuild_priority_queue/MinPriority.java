package heaps.inbuild_priority_queue;

import java.util.*;

public class MinPriority { // this is inbuild heap
   public static void main(String[] args) {
    PriorityQueue<Integer> MinHeap = new PriorityQueue<>(); // for MaxPriorityQueue just write
    //PriorityQueue<Integer> MinHeap = new PriorityQueue<>(Collections.reverseOrder());
    MinHeap.add(10);
    MinHeap.add(22);
    MinHeap.add(9);
    MinHeap.add(14);
    MinHeap.add(4);
    MinHeap.add(8);
    MinHeap.add(15);
    MinHeap.add(1);
    System.out.println(MinHeap); // sorted print(asending)
    System.out.println(MinHeap.peek()); // samllest
    System.out.println(MinHeap);
    System.out.println(MinHeap.comparator());
    System.out.println(MinHeap.contains(Integer.valueOf(1)));
    MinHeap.add(null);



   } 
}
