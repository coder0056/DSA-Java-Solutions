//Simple Binary Tree Implementation

class BinaryTree {
    Node root;
    
    class Node {
        int data;
        Node left;
        Node right;
        Node(int val) {
            this.data = val;
            left = right = null;
        }
    }
        
    BinaryTree(int val) {
        root = new Node(val);
    }
    
    void insertLeft(Node root,int val) {
        Node newNode = new Node(val);
        root.left = newNode;
    }
    
    void insertRight(Node root,int val) {
        Node newNode = new Node(val);
        root.right = newNode;
    }
    
    void preOrder(Node root) {
        if(root != null) {
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
        }
    }
    
    void inOrder(Node root) {
        if(root != null) {
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
        }
    }
    
    void postOrder(Node root) {
        if(root != null) {
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
        }
    }
    
}
class Main {
    public static void main(String[] args) {
        BinaryTree BT = new BinaryTree(10);
        BT.insertLeft(BT.root, 20);
        BT.insertRight(BT.root, 30);
        System.out.print("Pre order traversal :");
        BT.preOrder(BT.root);
        System.out.println();
        System.out.print("In order traversal :");
        BT.inOrder(BT.root);
        System.out.println();
        System.out.print("Post order traversal :");
        BT.postOrder(BT.root);
        System.out.println();
    }
}
