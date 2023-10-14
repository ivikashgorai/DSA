package recursion.arrayques;

import java.util.ArrayList;

public class LinearSearchImportant {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 3, 7, 4, 4, 5, 4, 3 };
        int n = arr.length;
        int target = 4;
        int index = 0;
        // ArrayList<Integer> list = new ArrayList<>(); // creating a arraylist
        // System.out.println(linear(arr, n, target, index));
        // taking all element on that array list
         // humlog yaha se list wala arraylist ko bheje hai aur isi mein changes hoga
        // System.out.println(linearlist(arr, n, target, index, list));
        // without arraylist in parameter
         System.out.println(linearlist2(arr, n, target, index));
    }
      // simple one
    public static int linear(int[] arr, int n, int target, int index) { 
        if (index == n) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            index += 1;
            linear(arr, n, target, index);
        }
        return linear(arr, n, target, index);
    }



    //list in parameter
    public static ArrayList<Integer> linearlist(int[] arr, int n, int target, int index, ArrayList<Integer> ans) { // jahir sa baat hai formal parameter ka name mein changes ho hai
        if (index == n) {
            return ans;
        } else if (arr[index] == target) {
            ans.add(index);
        }
        return linearlist(arr, n, target, index + 1, ans);
    } 



        // list not in parameter
       public static ArrayList<Integer> linearlist2(int[] arr, int n, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == n) {
            return list;
        } else if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> AnsWeGettingFromBelow = linearlist2(arr, n, target, index + 1);
        list.addAll(AnsWeGettingFromBelow);
        return (list);
    }
}
