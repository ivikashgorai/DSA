package dynamic_programming;

import java.util.*;

public class Kanpsack_01 {
    static int prof = 0;

    public static void main(String[] args) {
        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 2, 4, 5, 7 };
        int W = 7;
        int n = wt.length-1;
        System.out.println(Knapsack(wt, val, W, n));
    }

    public static int Knapsack(int[] wt, int[] val, int W, int n) {
      if(n==0 || W==0){
        return 0;
      }
      if(wt[n]<=W){
        int a  = val[n]+Knapsack(wt, val, W-wt[n], n-1);
        int b = Knapsack(wt, val, W, n-1);
        return Math.max(a, b);
      }
      else /*f(wt[n]>W)*/{
        return Knapsack(wt, val, W, n-1);
      }

    }
}