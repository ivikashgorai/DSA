package dynamic_programming.AdityaVerma.Knapsack_problems.Knapsack_original;


import java.util.*;

public class Knapsack_recursive {
    static int prof = 0;

    public static void main(String[] args) {
        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 3, 6, 8 };
        int W = 7;
        int n = wt.length;
        System.out.println(Knapsack(wt, val, W, n));
    }

    public static int Knapsack(int[] wt, int[] val, int W, int n) {
      if(n==0 || W==0){
        return 0;
      }
     if(W-wt[n-1]>=0){
      int a = val[n-1]+Knapsack(wt, val, W-wt[n-1], n-1);
      int b = Knapsack(wt, val, W, n-1);
      return Math.max(a,b);
     }
     else{
     int a = Knapsack(wt, val, W, n-1);
     return a;
     }

    }
}