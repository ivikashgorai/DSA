package toposort.dfs;

import java.util.*;
public class TopoSort {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.AddEdge(5,0);
        g.AddEdge(4,0);
        g.AddEdge(5,2);
        g.AddEdge(2,3);
        g.AddEdge(3,1);
        g.AddEdge(4,1);
        Stack<Integer> stack = new Stack<Integer>();
        // stack.push(7);
        boolean vis[] = new boolean[g.num_nodes];
        for(int i=0;i<=5;i++){
            if(!vis[i]){
                topo(g,stack, vis, i);
            }
        }
        int[] arr = new int[6];
        for(int i=0;i<6;i++){
            arr[i] = stack.peek();
            stack.pop();
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void topo(Graph g,Stack<Integer> stack,boolean[] vis,int start) {
        vis[start] = true;
        
        for(int i=0;i<g.list.get(start).size();i++){
            if(vis[g.list.get(start).get(i)]== false){
                topo(g,stack,vis,g.list.get(start).get(i));
            }
        }
        stack.push(start); // pushing in stack during recursion going back
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
    }
}
