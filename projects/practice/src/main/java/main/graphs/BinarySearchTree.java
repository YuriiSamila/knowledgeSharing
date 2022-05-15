package main.graphs;

import static java.util.Objects.isNull;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(int value) {
        root = new Node(value);
    }

    public BinarySearchTree() {
    }

    public static Node search(Node root, int key) {
        if (isNull(root) || root.getKey() == key) {
            return root;
        }
        if (root.getKey() < key) {
            return search(root.getRight(), key);
        }
        return search(root.getLeft(), key);
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.getKey()) {
            root.setLeft(insert(root.getLeft(), key));
        } else if (key > root.getKey()) {
            root.setRight(insert(root.getRight(), key));
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.println(root.getKey());
            inorderRec(root.getRight());
        }
    }

}
