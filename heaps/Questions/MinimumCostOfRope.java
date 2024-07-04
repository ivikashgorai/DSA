package heaps.Questions;
import java.util.*;

public class MinimumCostOfRope {
    public static void main(String[] args) {
        Solutionrope s = new Solutionrope();
       System.out.println( s.minCost(new long[] {4,2,7,6,9}, 5));
    }
}
class Solutionrope
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        if(n==1){
            return 0;
        }
         PriorityQueue<Long> pq = new PriorityQueue<>();
         for(int i=0;i<n;i++){
             pq.add(arr[i]);
         }
         long cost  =0;
         while(pq.size()!=1){
             long a  = pq.poll();
             long b = pq.poll();
             long sum = a+b;
             pq.add(sum);
             cost+=sum;
         }
         return cost;
    }
}
