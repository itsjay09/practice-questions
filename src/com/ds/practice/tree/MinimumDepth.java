package com.ds.practice.tree;

import java.util.ArrayDeque;
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
                "binary tree is : " + tree.recursiveMinDepth());
    }

    private int recursiveMinDepth() {
        return recursiveMinDepth(root);
    }

    private int recursiveMinDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int lHeight = recursiveMinDepth(root.left);
        int rHeight = recursiveMinDepth(root.right);

        if (lHeight < rHeight) {
            return lHeight + 1;
        } else if (rHeight < lHeight) {
            return rHeight + 1;
        } else {
            return 0;
        }
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


    int getMaxWidth(Node root) {
        // Your code here
        ArrayDeque<Node> q = new ArrayDeque<>();
        int res = 0;
        Node cur;
        q.offer(root);

        while (!q.isEmpty()) {
            int count = q.size();
            res = Math.max(res, count);

            for (int i = 0; i < count; i++) {
                cur = q.poll();
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
        }
        return res;
    }
}
