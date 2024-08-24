package trees.bst;

public class BinarySearchTree {
    private Node rootNode;
    public String value;

    public BinarySearchTree() {

    }

    public int height(Node node) { // not require
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
        rootNode = insert(value, rootNode);
      }
    
      private Node insert(int value, Node node) {
        if (node == null) {
          node = new Node(value);
          return node;
        }
    
        if (value < node.value) {
          node.left = insert(value, node.left);
        }
    
        if (value > node.value) {
          node.right = insert(value, node.right);
        }
    
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return (node);
      }

    public boolean balanced() { // not require
        return balanced(rootNode);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
      }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
          return;
        }
    
        int mid = (start + end) / 2;
    
        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
      }

    public void displayPreOrder(){
        if(rootNode==null){
            return;
        }
        displayPreOrder(rootNode);
    }
    private void displayPreOrder(Node node){
        if(node ==null){
            return;
        }
        System.out.println(node.value);
        displayPreOrder(node.left);
        displayPreOrder(node.right);
        return;
    }
    public void displayInOrder(){
        if(rootNode==null){
            return;
        }
        displayInOrder(rootNode);
    }
    private void displayInOrder(Node node){
        if(node ==null){
            return;
        }
        displayInOrder(node.left);
        System.out.println(node.value);
        displayInOrder(node.right);
        return;
    }

     public void displayPostOrder(){
        if(rootNode==null){
            return;
        }
        displayPostOrder(rootNode);
    }
    private void displayPostOrder(Node node){
        if(node ==null){
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
