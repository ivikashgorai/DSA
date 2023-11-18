package BackTracking.Basic;

public class Maze_obstacle {
    public static void main(String[] args) {
        int row = 0; // matrix is 3X3
        int col = 0;
        path("", row, col); // obstacle in centre see in copy
    }

    static void path(String empty, int row, int col) {
        if (row == 2 && col == 2) {
            System.out.println(empty);
            return;
        }
        if(row==1 && col ==1){
            return;
        }
        if (row <=2) {
            path(empty + "D", row + 1, col);
        }
        if (col <= 2) {
            path(empty + "R", row, col + 1);
        }
        if(row<=2 && col<=2){
        path(empty+"V", row+1, col+1); // in case it can also move digonally
        }
    }
}