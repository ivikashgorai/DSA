package recursion.pattern;

public class One {
    public static void main(String[] args) {
        // for(int i=1;i<=row;i++){
        // for(int j=1;j<=6-i;j++){
        // System.out.print("*");
        // }
        // System.out.println(); 
        // }
        // }
        pattern(5, 0);
        pattern2(5, 0);
    }

    public static void pattern(int row, int col) {
        if (row == 0) {
            return;
        } 
        if (row > col) {
            System.out.print("*");
            pattern(row, col += 1);
        } else {
            System.out.println();
            pattern(row -= 1, 0);
        } 
    }
    public static void pattern2(int row, int col) {
        if (row == 0) {
            return;
        }// remain in stack until the base condition is met we know then execute
        if (row > col) {
            pattern2(row, col+1);
             System.out.print("*");
        } else {
            pattern2(row-1, 0);
             System.out.println();
        }
    }
}
