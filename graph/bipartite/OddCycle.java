package bipartite;
import java.util.*;
public class OddCycle {
    public static void main(String[] args) {
        Graph g = new Graph(8);
        g.AddEdge(1, 2);
        g.AddEdge(2, 3);
        g.AddEdge(2, 6);
        g.AddEdge(3, 4);
        g.AddEdge(6, 5);
        g.AddEdge(4, 5);
        g.AddEdge(5, 6);
        g.AddEdge(7, 8);
      
        int[] color = new int[g.num_nodes]; // initially 0 therefor not visited as well as not colored // taking two color 1 and 2
        Queue<Integer> q = new LinkedList<>();
        System.out.println(bip(g, color, q,1));


    }
    public static boolean bip(Graph g,int[] color,Queue<Integer> q,int start){
        q.add(start);
        color[start] = 1;
        while(!q.isEmpty()){
            int a = q.poll();

            for(int i=0;i<g.list.get(a).size();i++){
                    if(color[a] == 1){
                        if(color[g.list.get(a).get(i)]==1){
                            return false;
                        } // pehle se 1 hai is adj list mein
                        if(color[g.list.get(a).get(i)]==0){
                        color[g.list.get(a).get(i)] = 2;
                        q.add(g.list.get(a).get(i));
                        }
                    }
                    else if(color[a] == 2){
                        if(color[g.list.get(a).get(i)]==2){
                           return false;
                        } // pehle se 1 hai is adj list mein
                        if(color[g.list.get(a).get(i)]==0){
                        color[g.list.get(a).get(i)] = 1;
                        q.add(g.list.get(a).get(i));
                        }

                }
            }
        }
        return true;
    }
}

class Graph{
    int num_nodes;
    ArrayList<ArrayList<Integer>> list;

    public Graph(int num_nodes){
        this.num_nodes =  num_nodes+1;
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