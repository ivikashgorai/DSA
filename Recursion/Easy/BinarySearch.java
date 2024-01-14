package easy;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 7, 9, 11, 15 };
        int key = 4;
        int ans = search(arr, key, 0, arr.length - 1);
        System.out.println(ans);
    }

    public static int search(int[] arr, int key, int s, int e) {
        if (s > e) { // not present in array
            return -1;
        }
        int mid = s + ((e - s) / 2);
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] > key) {
             return search(arr, key, s, mid - 1); // yaha agar return nhi lagayrenge toh ye fuction excute hone ke baad jaha se call hua toha waha return nhi hoga blki neeche jo code hai usko excute karne lagega
        }
        return search(arr, key, mid + 1, e);
    }
}
