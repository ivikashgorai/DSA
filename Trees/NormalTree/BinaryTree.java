package Trees.NormalTree;

import java.util.*;

public class BinaryTree {
    private Node rootNode;

    public BinaryTree() {
    }

    public void populate(Scanner sc) {
        System.out.println("Enter the root node value");
        int value = sc.nextInt();
        rootNode = new Node(value);
        populate(sc, rootNode);
    }

    public void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value + " (1 for Yes, 0 for No)  ");
        int leftBool = sc.nextInt();
        if (leftBool == 1) {
            System.out.println("enter the value of left node of " + node.value);
            int leftValue = sc.nextInt();
            node.left = new Node(leftValue);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter right of " + node.value + " (1 for yes 0 for no)");
        int rightBool = sc.nextInt();
        if (rightBool == 1) {
            System.out.println("enter the value of right node of " + node.value);
            int rightValue = sc.nextInt();
            node.right = new Node(rightValue);
            populate(sc, node.right);
        }
    }

    public void display() {
        display(rootNode, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(rootNode, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.println("|\t\t");
            }
            System.out.println("---------> " + node.value);
        }
        else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1 );
    }

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
