package BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int startRow=0;
        int endRow=arr.length-1;
        int startCol =0;
        int endCol =arr[0].length-1;
        ArrayList<String> list = new ArrayList<>();
        rightDown(startRow, endRow, startCol, endCol,list);
       
    }
    static void rightDown(int startRow,int endRow,int startCol,int endCol,ArrayList<String> list){
        if(startRow>endRow && startCol>endCol){ 
            System.out.println(list);
            return;
        }
        // if(startRow<endRow && startCol<endCol){
        //      list.add("D");
        // rightDown(startRow+1, endRow, startCol, endCol, list);
        //       list.add("R");
        //   rightDown(startRow, endRow, startCol+1, endCol, list);
        // }
        if(startRow<endRow){
              list.add("D");
            rightDown(startRow+1, endRow, startCol, endCol, list);
        }
        else if(startCol<endCol){
            list.add("R");
           rightDown(startRow, endRow, startCol+1, endCol, list);
        }
           
        
    }
}
