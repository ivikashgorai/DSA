package disjoint_set;

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


public class UnionRank {
    public static void main(String[] args) {
        Disjoint ds = new Disjoint(7);
        ds.unionByRank(1, 2); 
        ds.unionByRank(2, 3); 
        ds.unionByRank(4, 5); 
        ds.unionByRank(6, 7); 
        ds.unionByRank(5, 6); 

        if(ds.findParent(3) == ds.findParent(7)) {
            System.out.println("Same"); 
        }
        else {
            System.out.println("Not Same");
        }
        ds.unionByRank(3, 7);
        if(ds.findParent(3) == ds.findParent(7)) {
            System.out.println("Same"); 
        }
        else {
            System.out.println("Not Same");
        }
    }

}

