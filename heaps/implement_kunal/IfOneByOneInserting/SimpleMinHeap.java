package heaps.implement_kunal.IfOneByOneInserting;
import java.util.*;

public class SimpleMinHeap {
    public static void main(String[] args) {
        // List<Integer> minHeap = new ArrayList<>();
        // insert(minHeap, 2);
        // System.out.println(minHeap);
        // insert(minHeap, 1);
        // System.out.println(minHeap);
        // insert(minHeap, 5);
        // System.out.println(minHeap);
        // insert(minHeap, 3);
        // System.out.println(minHeap);
        // insert(minHeap, 9);
        // System.out.println(minHeap);
        // insert(minHeap, 4);
        // System.out.println(minHeap);
        // pop(minHeap);
        // System.out.println(minHeap);
        // insert(minHeap, 11);
        // System.out.println(minHeap);
        // insert(minHeap, 8);
        // System.out.println(minHeap);
        // System.out.println();
        // while (!minHeap.isEmpty()) {
        //     pop(minHeap);
        //     System.out.println(minHeap);
        // }

        List<Integer> list = new ArrayList<>(Arrays.asList(2,4,3,1,7,11,9,14,12));
        buildHeap(list);
        System.out.println(list);

    }

    static void insert(List<Integer> minHeap, int num) {
        minHeap.addLast(num);
        int insertIndex = minHeap.size() - 1;
        int parentIndex = insertIndex / 2;
        while (parentIndex >= 0 && minHeap.get(insertIndex) < minHeap.get(parentIndex)) { // upheap
            int temp = minHeap.get(parentIndex);
            minHeap.set(parentIndex, minHeap.get(insertIndex));
            minHeap.set(insertIndex, temp);
            insertIndex = parentIndex;
            parentIndex = insertIndex / 2;
        }
    }

    static int pop(List<Integer> minHeap) {
        int smallest = minHeap.get(0);
            minHeap.set(0, minHeap.get(minHeap.size() - 1));
        minHeap.remove(minHeap.size() - 1);

        int parentIndex = 0;

        if(!minHeap.isEmpty()){
        while (true) { // downHeap
            int leftIndex = parentIndex * 2 + 1;
            int rightIndex = parentIndex * 2 + 2;
            int smallestIndex = parentIndex;

            if (leftIndex < minHeap.size() && minHeap.get(parentIndex) > minHeap.get(leftIndex)) {
                smallestIndex = leftIndex;
            }

            if (rightIndex < minHeap.size() && minHeap.get(rightIndex) < minHeap.get(smallestIndex)) {
                smallestIndex = rightIndex;
            }

            if (smallestIndex == parentIndex) {
                break;
            }

            int temp = minHeap.get(smallestIndex);
            minHeap.set(smallestIndex, minHeap.get(parentIndex));
            minHeap.set(parentIndex, temp);
            parentIndex = smallestIndex;
        }
    }

        return smallest;
    }

    static void buildHeap(List<Integer> arr){
        int startIndex = (arr.size()/2) -1;

        for(int i=startIndex;i>=0;i--){
            downHeap(arr,i);
        }
    }
    static void downHeap(List<Integer> arr,int parentIndex){

            while (true) { // downHeap
            int leftIndex = parentIndex * 2 + 1;
            int rightIndex = parentIndex * 2 + 2;
            int smallestIndex = parentIndex;

            if (leftIndex < arr.size() && arr.get(parentIndex) > arr.get(leftIndex)) {
                smallestIndex = leftIndex;
            }

            if (rightIndex < arr.size() && arr.get(rightIndex) < arr.get(smallestIndex)) {
                smallestIndex = rightIndex;
            }

            if (smallestIndex == parentIndex) {
                break;
            }

            int temp = arr.get(smallestIndex);
            arr.set(smallestIndex, arr.get(parentIndex));
            arr.set(parentIndex, temp);
            parentIndex = smallestIndex;
        }
    }
}
