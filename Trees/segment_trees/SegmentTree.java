package trees.segment_trees;

public class SegmentTree {
    private Node rootNode;

    public SegmentTree(){}

    public SegmentTree(int[] arr){
        this.rootNode = constructTree(arr,0,arr.length-1);
    }

  private Node constructTree(int[] arr,int start,int end){ // O(N)
       if(start==end){
        Node newNode = new Node(start, end);
        newNode.data = arr[start];
        return newNode;
       }

       Node newNode = new Node(start,end);
       // jaisacopy mein dikhra waisi code likho
       int mid = start + (end-start)/2;
       newNode.left= this.constructTree(arr, start, mid);
       newNode.right = this.constructTree(arr, mid+1, end);
       newNode.data = newNode.left.data + newNode.right.data;

       return newNode;
    }

    public int findInRange(int start,int end){
      return this.findInRange(rootNode,start, end,0);

    }
    private int findInRange(Node node,int start,int end,int sum){
          if(node.endInterval<start || node.startInterval>end){
            return 0;
        }     
        else if(node.startInterval>=start && node.endInterval<=end){
            return node.data;
        }
       else{
        sum+=findInRange(node.left,start, end,sum) + findInRange(node.right,start, end,sum);
        }
        return sum;
    }

    public void update(int index,int value){ // jo copy mein dikhra wo code karo simple
       rootNode.data = update(rootNode,index,value);
    }
    private int update(Node node,int index,int data){
        if(index==node.startInterval && index==node.endInterval){
            node.data = data;
            return node.data;
        }
        else if(node.endInterval<index || node.startInterval>index){
            return node.data;
        }
         else{
           int node1 = update(node.left, index, data);
            int node2 = update(node.right, index, data);
            node.data = node1+node2;
            return node.data;
        }
    }


    public void display(){
        display("Rootnode : ",rootNode);
    }
    public void display(String detail,Node node){
        if(node == null){
            return;
        }
        System.out.println(detail+node.data);
        display("leftNode of node.data : " , node.left);
        display("Rigth  node of node.data : ",node.right);
    }



    private class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

    public Node(){}

    public Node(int startInterval,int endInterval){
        this.startInterval = startInterval;
        this.endInterval = endInterval;
    }
}
}
