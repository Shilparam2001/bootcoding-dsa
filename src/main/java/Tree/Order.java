package Tree;



public class Order {
    public static BinaryTree create() {
        BinaryTree root = new BinaryTree(1);
        BinaryTree n1 = new BinaryTree(2);
        BinaryTree n2 = new BinaryTree(3);
        BinaryTree n3 = new BinaryTree(4);
        BinaryTree n4 = new BinaryTree(5);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        return root;
    }

    public static void inOrder(BinaryTree root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void preOrder(BinaryTree root) {
        if (root == null)
            return;
        System.out.println(root.data);
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void postOrder(BinaryTree root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);

    }

    public static void main(String[] args) {
        BinaryTree root = create();
        System.out.println("Inorder");
        inOrder(root);
        System.out.println("preOrder");
        preOrder(root);
        System.out.println("postOrder");
        postOrder(root);

    }

}