package Tree;

public class IsFull {
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

   public static boolean isFull(BinaryTree root) {
       if (root == null)
           return true;
       if (root.left == null && root.right == null)
           return true;

       return ((root.left != null && root.right != null) && isFull(root.left) && isFull(root.right));
   }

    public static void main(String[] args) {
        BinaryTree root = create();
        System.out.println("Tree is full" + "---> " + isFull(root));
    }



}
