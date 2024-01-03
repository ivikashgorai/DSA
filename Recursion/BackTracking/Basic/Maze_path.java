package backtracking.basic;

class Maze_path {
public static void main(String[] args) {
    int row = 2; // index
    int col =2;
    path( "", row, col);
}
     static void path(String empty,int row,int col){
        if(row==0 && col ==0){ // so when both become 0 then my complete path will come
            System.out.println(empty);
            return;
        }
        if(row>=1){
            path(empty+"D",row-1,col);
        }
        if(col>=1){
            path(empty+"R",row,col-1);
        }
        // if(row>=1 && col>=1){
        //     path(empty+"C", row-1, col-1); // in case it can also move digonally
        // }
     }
}