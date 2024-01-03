package trees.avl;

public class Main {
    public static void main(String[] args) {
        AvlTree tree = new AvlTree();
       tree.insert(10);
       tree.insert(20);
       tree.insert(12);
       tree.insert(15);
       tree.insert(13);
       tree.insert(8);
       tree.insert(9);
       tree.insert(7);
      System.out.println(tree.height());
 
    }
}

