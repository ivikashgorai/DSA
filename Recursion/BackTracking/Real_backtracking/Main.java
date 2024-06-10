package backtracking.real_backtracking;

public class Main {
    static int moves = 0;
    public static void main(String[] args) {
        moves = 0;
        int n = 3;  
        // char[][] board = new char[n][n];
        boolean[][] board = new boolean[n][n];
        NQueen(board,n,0,0);
        System.out.println(moves);
    }
    static void NQueen(boolean[][] board,int knight,int r,int c){
        if(knight==0){
            moves+=1;
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]){
                        System.out.print("K ");
                    }
                    else{
                        System.out.print("X ");
                    } 
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        if(r == board.length-1 && c == board.length){
            return;
        }
        if(c==board[0].length){
            NQueen(board, knight, r+1, 0);
            return;
        }
                if(isSafe(board, r,c)){
                    board[r][c] = true;
                    NQueen(board, knight-1,r,c+1);
                    board[r][c] = false;
        }
        NQueen(board, knight,r,c+1);
    }
    static boolean isSafe(boolean[][] board,int row,int col){
       if(col+2<board[0].length && row-1>=0){
        if(board[row-1][col+2]){
            return false;
        }
       }
       if(col-2>=0 && row-1>=0){
       if( board[row-1][col-2]){
        return false;
       }
       }
       if(row-2>=0 && col+1<board[0].length){
        if(board[row-2][col+1]){
            return false;
        }
       }
       if(row-2>=0 && col-1>=0){
        if(board[row-2][col-1]){
            return false;
        }
       }
       if(board[row][col]){
        return false;
       }
        return true;
    }
}
