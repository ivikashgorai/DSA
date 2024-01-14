package trees.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
      int[] nums = {1,2,3,4,5,6,7,8,9,10};
    //    tree.display();
     tree.populatedSorted(nums);
     tree.display();

    }
}
