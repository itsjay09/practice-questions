package com.ds.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepth {

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
        MinimumDepth tree = new MinimumDepth();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The minimum depth of " +
                "binary tree is : " + tree.minimumDepth());
    }

    public int minDepthBfs() {
        return minDepthBfs(root);
    }

    public int minDepthBfs(Node root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        depth++;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Node node = queue.remove();

                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            depth++;
        }

        return 0;
    }


    public int minimumDepth() {
        return minimumDepth(root);
    }

    // TIme Complexity is O(n)
    private int minimumDepth(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        if (node.right == null) {
            return minimumDepth(node.left) + 1;
        }

        if (node.left == null) {
            return minimumDepth(node.right) + 1;
        }

        return Math.min(minimumDepth(node.right), minimumDepth(node.left)) + 1;
    }

}
