package heaps.Implement_kunal;


public class Main {
   public static void main(String[] args) throws Exception {
    MinHeap<Integer> heap = new MinHeap<>();
    heap.insert(1);
    heap.insert(9);
    heap.insert(10);
    heap.insert(15);
    heap.insert(2);
    heap.insert(7);
    heap.insert(6);
    heap.insert(13);
   System.out.println(heap.heapSort());
   } 
}
