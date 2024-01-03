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
    
        node.height = Math.max(height(node.left), height(node.right) )+ 1;
        return rotate(node); // latly it will go to rootnode from node which is added in this process it will checked that if node is balanced or not 
      }

      private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
          // left heavy
          if(height(node.left.left) - height(node.left.right) > 0) {
            // left left case
            return rightRotate(node);
          }
          if(height(node.left.left) - height(node.left.right) < 0) {
            // left right case
            node.left = leftRotate(node.left);
            return rightRotate(node);
          }
        }
    
        if (height(node.left) - height(node.right) < -1) {
          // right heavy
          if(height(node.right.left) - height(node.right.right) < 0) {
            // right right case
            return leftRotate(node);
          }
          if(height(node.right.left) - height(node.right.right) > 0) {
            // left right case
            node.right = rightRotate(node.right);
            return leftRotate(node);
          }
        }
    
        return node;
      }
    
      public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;
    
        c.right = p;
        p.left = t;
        
        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;
    
        return c;
      }
    
      public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;
    
        p.left = c;
        c.right = t;
        
        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right) )+1;
    
        return p;

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

        public Node(){}

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
