package dynamic_programming.Striver.NinjaTraining;

public class Recursion {
    public static void main(String[] args) {
        int[][] arr = { { 10,40,70 },
        { 20, 50, 80 },
    {30,60,90}};
        int n = arr.length;
        System.out.println(Ninja2(arr, n , -1));
    }

    static int Ninja2(int[][] arr, int row, int prevCol) {
        if (row == 0) { // empty array
            return 0;
        }
        int a = Integer.MIN_VALUE;
        // int b = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for (int col = 0; col < arr[0].length; col++) {
            if (prevCol != col) {
                a = Ninja2(arr, row - 1, col) + arr[row-1][col];
                // b = Ninja2(arr, row-1, -1);
                ans = Math.max(ans,a);

            }
        } 
        // System.out.print(Math.max(a, b) + " ");
        return ans;
    }
}
