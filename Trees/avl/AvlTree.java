package trees.avl;


public class AvlTree {
    private Node rootNode;

    public AvlTree() {

    }

    public int height() { // height of rootNode
        return height(rootNode);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        if (rootNode == null) {
            return true;
        }
        return false;
    }

    public void display() {
        display(rootNode, "RootNode : ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left node of " + node.value + " : ");
        display(node.right, "Right node of " + node.value + " : ");
    }

    public void insert(int value) {
        if (rootNode == null) {
            Node dummy = new Node(value);
            rootNode = dummy;
            return;
        }
        insert(value, rootNode);
    }

    private void insert(int value, Node node) {
        if (value < node.value && node.left == null) {
            Node dummy = new Node(value);
            node.left = dummy;
            node.height = Math.max(height(node.left), height(node.right)) + 1;
            return;
        }
        if (value > node.value && node.right == null) {
            Node dummy = new Node(value);
            node.right = dummy;
            node.height = Math.max(height(node.left), height(node.right)) + 1;
            return;
        }

        if (node.left != null && value < node.value) {
            insert(value, node.left);
        } else if (node.right != null && value > node.value) {
            insert(value, node.right);
        }
        return;
    }

    public boolean balanced() {
        return balanced(rootNode);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void displayPreOrder() {
        if (rootNode == null) {
            return;
        }
        displayPreOrder(rootNode);
    }

    private void displayPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        displayPreOrder(node.left);
        displayPreOrder(node.right);
        return;
    }

    public void displayInOrder() {
        if (rootNode == null) {
            return;
        }
        displayInOrder(rootNode);
    }

    private void displayInOrder(Node node) {
        if (node == null) {
            return;
        }
        displayInOrder(node.left);
        System.out.println(node.value);
        displayInOrder(node.right);
        return;
    }

    public void displayPostOrder() {
        if (rootNode == null) {
            return;
        }
        displayPostOrder(rootNode);
    }

    private void displayPostOrder(Node node) {
        if (node == null) {
            return;
        }
        displayPostOrder(node.left);
        displayPostOrder(node.right);
        System.out.println(node.value);
        return;
    }

    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
