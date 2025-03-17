// Class representing a Node in the Binary Tree
class Node {
    int data;
    Node left, right;

    // Constructor
    public Node(int value) {
        this.data = value;
        this.left = this.right = null;
    }
}

// Class representing a Binary Tree
class BinaryTree {
    Node root;

    // Constructor to initialize an empty tree
    public BinaryTree() {
        root = null;
    }

    // Preorder Traversal (Root -> Left -> Right)
    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder Traversal (Left -> Root -> Right)
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Manually constructing the following tree:
        //         1
        //       /   \
        //      2     3
        //     / \   / \
        //    4   5 6   7

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        // Testing Traversals
        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);  // Output: 1 2 4 5 3 6 7

        System.out.println("\nInorder Traversal:");
        tree.inorder(tree.root);   // Output: 4 2 5 1 6 3 7

        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root); // Output: 4 5 2 6 7 3 1
    }
}
