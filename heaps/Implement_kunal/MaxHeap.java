package heaps.implement_kunal;
import java.util.*;

public class MaxHeap {
    private static ArrayList<Integer> list;
    public MaxHeap(){
        list = new ArrayList<>();
    }

    public static void upheap(int childIndex){
        if(childIndex==0){
            return;
        }
        int parentIndex = (childIndex-1) /2;
        if(list.get(parentIndex)<list.get(childIndex)){
            int temp =  list.get(parentIndex);
            list.set(parentIndex,list.get(childIndex));
            list.set(childIndex, temp);
            upheap(parentIndex);
        }
    }

    public void insert(int value){
        list.add(value);
        upheap(list.size()-1);
    }

    public static void downheap(int parentIndex){
        int leftChild = (parentIndex*2)+1;
        int rightChild = (parentIndex*2)+2;
        if(parentIndex>=list.size() || leftChild>=list.size() || rightChild>=list.size()){
            return;
        }

        if(list.get(leftChild)>list.get(rightChild)){
            if(list.get(parentIndex)<list.get(leftChild)){
                int temp = list.get(parentIndex);
                list.set(parentIndex,list.get(leftChild));
                list.set(leftChild,temp);
                downheap(leftChild);
            }
        }
        else{
            if(list.get(parentIndex)<list.get(rightChild)){
                int temp = list.get(parentIndex);
                list.set(parentIndex,list.get(rightChild));
                list.set(rightChild,temp);
                downheap(rightChild);
            }
        }
    }


    public int delete(){
        if(list.isEmpty()){
            return -1;
        }
        int first = list.get(0);
        list.set(0, list.get(list.size()-1));
        list.remove(list.size()-1);
        if(!list.isEmpty()){
            downheap(0);
        }
        return first;
    }
}
