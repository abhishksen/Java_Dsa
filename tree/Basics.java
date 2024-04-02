package tree;

public class Basics {
    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        root.preOrder(root);
        System.out.println();
        root.inOrder(root);
        System.out.println();
        root.postOrder(root);
    }
}
