package trees.segment_trees;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,8,7,6,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
       
    //    System.out.println(tree.findInRange(2,6));
    tree.update(3, 14);
     tree.display();

    }
}
