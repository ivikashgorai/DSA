package BackTracking.Basic;


public class Maze {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;
        int sum = 0;
        System.out.println(rightDown(endRow, endCol, sum));

    }

    static int rightDown(int endRow, int endCol, int sum) {
        if (endRow == 0 || endCol == 0) {
            return 1;
        }
        int left = rightDown(endRow - 1, endCol, sum);
        int right = rightDown(endRow, endCol - 1, sum);
        return right + left; // it is giving number of ways but now we will find the paths
    }
}
