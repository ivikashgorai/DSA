package dynamic_programming.AdityaVerma.MCM;

public class BasicMAC {
    public static void main(String[] args) {
        int[] arr = { 40, 20, 30, 10, 30 };
        System.out.println(MinimumCost(arr, 1, arr.length - 1));
    }

    static int MinimumCost(int[] arr, int i, int j) { // Memoize when necessary
        if (i >= j) {
            return 0;
        } // memoize here
        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) { 
            // do memoize also here 
            int a = MinimumCost(arr, i, k);
            int b = MinimumCost(arr, k + 1, j);
            int c = arr[i - 1] * arr[k] * arr[j];
            int tempAns = a + b + c;
            min = Math.min(tempAns, min);
        }
        return min;
    }
}
