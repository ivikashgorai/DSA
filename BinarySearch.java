public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 8, 9, 11, 15 };
        System.out.println(arr[binarySearch(arr, 11)]);

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else{ // just greater number than target // upper bound
                //number greater than equal to target // lower bound
                start = mid+1;
            }
        }
        return start;
    }
}
