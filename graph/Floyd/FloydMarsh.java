package Floyd;
import java.util.*;

public class FloydMarsh {
    public static void main(String[] args) {
        long[][] mat =  new long[4][4];

        mat[0][0] = 0;
        mat[1][1] = 0;
        mat[2][2] = 0;
        mat[3][3] = 0;
        mat[0][1] = 3;
        mat[0][2] = (long) 1e9;
        mat[0][3] = 7;
        mat[1][0] = 8;
        mat[1][2] = 2;
        mat[1][3] = (long) 1e9;
        mat[2][0] = 5;
        mat[2][1] = (long) 1e9;
        mat[2][3] = 1;
        mat[3][0] = 2;
        mat[3][1] = (long) 1e9;
        mat[3][2] = (long) 1e9;
        

 
                for(int i=0;i<4;i++){
                    for(int j=0;j<4;j++){
                        for(int k=0;k<4;k++){ // in case below addition is infinity then it will give wrong result as in coding max mein jake phir - se start hoke 0 hota waisa
                            mat[j][k] = Math.min(mat[j][i]+mat[i][k],mat[j][k]);
                        }
                    }
                }

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (mat[i][j] == (long)(1e9)) {
                            mat[i][j] = -1;
                        }
                    }
                }

                for(int j=0;j<4;j++){
                    for(int k=0;k<4;k++){
                    System.out.print(mat[j][k]+" ");
                    }
                    System.out.println();
                }

    }
}
