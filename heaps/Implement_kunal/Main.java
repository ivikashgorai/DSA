package heaps.implement_kunal;

public class Main {
   public static void main(String[] args) throws Exception {

      MaxHeap heap = new MaxHeap();
      heap.insert(1);
      heap.insert(9);
      heap.insert(10);
      heap.insert(15);
      heap.insert(2);
      heap.insert(7);
      heap.insert(6);
      heap.insert(13);
      for(int i=0;i<8;i++){
         System.out.println(heap.delete());
      }
      // System.out.println(heap.delete());
      // System.out.println(heap.delete());


      
   //  MinHeap<Integer> heap = new MinHeap<>();
   //  heap.insert(1);
   //  heap.insert(9);
   //  heap.insert(10);
   //  heap.insert(15);
   //  heap.insert(2);
   //  heap.insert(7);
   //  heap.insert(6);
   //  heap.insert(13);
   // System.out.println(heap.heapSort());
   } 
}