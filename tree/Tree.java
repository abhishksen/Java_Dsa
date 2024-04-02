package tree;

public class Tree {
    int data;
    Tree left;
    Tree right;

    // ? traversal techniques - DFS
    void preOrder(Tree root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Tree root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    void postOrder(Tree root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // TODO Traverse the tree level by level - BFS using Queue

    public Tree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
