package com.ds.practice.tree;

public class MaxHeight {

    Node root;

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        MaxHeight tree = new MaxHeight();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The maximum depth of " +
                "binary tree is : " + tree.maxDepth());
    }

    private int maxDepth() {
        return maxDepth(root);
    }

    private int maxDepth(Node root) {
        if(root == null){
            return 0;
        }

        int letHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return 1 + Math.max(letHeight, rightHeight);
    }

}
