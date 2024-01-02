package Trees.BST;

public class BinarySearchTree {
    private Node rootNode;

    public BinarySearchTree() {

    }

    public int height(Node node) {
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

    public void insert(int value){
        if(rootNode == null){
            Node dummy = new Node(value);
            rootNode = dummy;
            return;
        }
        insert(value,rootNode);
    }
    private void insert(int value,Node node){
        if(value< node.value && node.left==null){
            Node dummy = new Node(value);
            node.left = dummy;
            return;
        }
         if(value > node.value && node.right==null){
            Node dummy = new Node(value);
            node.right = dummy;
            return;
        }

       if(node.left!=null && value < node.value){
        insert(value,node.left);
       }
       else if(node.right!=null &&  value > node.value){
        insert(value,node.right);
       }
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
