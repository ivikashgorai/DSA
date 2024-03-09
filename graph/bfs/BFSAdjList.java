package bfs;

import java.util.*;
public class BFSAdjList {
    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.AddEdge(1, 2);
        g.AddEdge(1, 3);
        g.AddEdge(2, 5);
        g.AddEdge(5, 7);
        g.AddEdge(7,6);
        g.AddEdge(6, 3);
        g.AddEdge(3, 4);
        bfs(g);
    }
    public static void bfs(Graph g){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[g.num_nodes];

        q.add(5);
        vis[5] = true;
            while(!q.isEmpty()){
                int a = q.poll();
                System.out.print(a+" ");
                for(int i=0;i<g.list.get(a).size();i++){
                    if(vis[g.list.get(a).get(i)] == false){
                    q.add(g.list.get(a).get(i));
                    vis[g.list.get(a).get(i)] = true;
                    }
                }
            }
    }
}
class Graph{
    int num_nodes;
    ArrayList<ArrayList<Integer>> list;
    
    public Graph(int num_nodes){
        this.num_nodes = num_nodes+1;
        list = new ArrayList<>();
        for(int i=0;i<this.num_nodes;i++){
            list.add(new ArrayList<>());
        }
    }
    public void AddEdge(int src,int dst){
        list.get(src).add(dst);
        list.get(dst).add(src);
    }
}
