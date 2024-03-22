package MST;

import java.util.*;

class Disjoint {
    int[] rank;
    int[] parent;
    int[] size;

    public Disjoint(int numOfNodes) {
        rank = new int[numOfNodes + 1]; // in case 2 base indexing that why adding 1 for safe case
        parent = new int[numOfNodes + 1];
        size = new int[numOfNodes + 1];

        for (int i = 0; i <= numOfNodes; i++) {
            rank[i] = 0;
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int findParent(int node) {
        if(node == parent[node]){
            return node;
        }
        int a = findParent(parent[node]);
        parent[node] = a;
        return a;
    }

    public void unionByRank(int u,int v){
        int parentU = findParent(u);
        int parentV = findParent(v);
        if(parentU==parentV){ // jab ultimate parent same hai pehle se hi yani wo ek hi component mein hai
            return;
        }
        int rankPU = rank[parentU];
        int rankPV = rank[parentV];
        if(rankPU==rankPV){
            parent[parentV] = parentU;
            rank[parentU]+=1;
        }
        else if(rankPU>rankPV){
            parent[parentV] = parentU; 
        }
        else if(rankPV>rankPU){
            parent[parentU] = parentV; 
        }
    }


    public void unionBySize(int u,int v){
        int parentU = findParent(u);
        int parentV = findParent(v);
        if(parentU==parentV){
            return;
        }
        int sizePU = size[parentU];
        int sizePV = size[parentV];
        if(sizePU==sizePV){
           parent[parentV] = parentU;
           size[parentU] += size[parentV];
        }
        else if(sizePU>sizePV){
             parent[parentV] = parentU;
             size[parentU] += size[parentV];
        }
        else if(sizePU<sizePV){
            parent[parentU] = parentV;
            size[parentV] += size[parentU];
       }
    }

}


public class Krushkal {
    public static void main(String[] args) {
        Disjoint ds = new Disjoint(6);
        int numOfNodes = 6;
        int[][] graph = {{1,4,1},{1,2,2},{2,4,3},{2,3,3},{1,5,4},{4,3,5},{2,6,7},{6,3,8},{5,4,9}}; //{u,v,wt}
        int numOfEdges = graph.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        for(int i=0;i<graph.length;i++){
            pq.add(graph[i]);
        }
        int mstWeight = 0;

        int[][] mst = new int[numOfNodes-1][3];
        int k =0;
        for(int i=0;i<graph.length;i++){
            int[] arr = pq.poll();
            if(ds.findParent(arr[1])!=ds.findParent(arr[0])){
                mstWeight+=arr[2];
                mst[k] = arr;
                k+=1;
                ds.unionByRank(arr[0],arr[1]);
            }
        }
        System.out.println(mstWeight);
        for(int i=0;i<mst.length;i++){
            System.out.println(Arrays.toString(mst[i]));
        }
        }
    }


