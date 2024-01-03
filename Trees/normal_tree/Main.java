package trees.normal_tree;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(sc);
        bt.prettyDisplay();
    }
}
