package trees.avl;

public class Main {
    public static void main(String[] args) {
      AvlTree tree = new AvlTree();
      for(int i=1;i<=4;i++){
        tree.insert(i);
      }
      System.out.println(tree.height());  // height will be 3 which is log1000
    }
}

