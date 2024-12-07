public class KadaneAlgo2 {
    public static int minSumSubarray(int[] arr) {
        int currentMin = arr[0];
        int globalMin = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            currentMin = Math.min(arr[i], currentMin + arr[i]);
            globalMin = Math.min(globalMin, currentMin);
        }
        
        return globalMin;
    }

    public static void main(String[] args) {
        int[] arr = {3, -4, 2, -3, -1, 7, -5};
        int result = minSumSubarray(arr);
        System.out.println("Minimum Sum Subarray: " + result);
    }
}
