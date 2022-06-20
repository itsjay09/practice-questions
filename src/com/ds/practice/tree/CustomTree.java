package com.ds.practice.tree;

import java.util.TreeSet;

public class CustomTree {

    TreeNode root;

    public static void main(String[] args) {
        CustomTree tree = new CustomTree();
        tree.add(22);
        tree.add(15);
        tree.add(25);
        tree.add(9);
        tree.add(8);
        tree.add(10);
        tree.add(23);
        tree.add(28);

        tree.inOrderPrint();
        System.out.println();
        tree.preOrderPrint();
        System.out.println();
        tree.postOrderPrint();

    }

    public void inOrderPrint(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderPrint(node.left);
        System.out.print(node.data + " ");
        inOrderPrint(node.right);

    }

    public void inOrderPrint() {
        if (root == null) {
            System.out.println("Empty list");
            return;
        }
        inOrderPrint(root);
    }

    public void preOrderPrint() {
        if (root == null) {
            System.out.println("Empty list");
            return;
        }
        preOrderPrint(root);
    }

    public void preOrderPrint(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        inOrderPrint(node.left);
        inOrderPrint(node.right);
    }

    public void postOrderPrint() {
        if (root == null) {
            System.out.println("Empty list");
            return;
        }
        postOrderPrint(root);
    }

    public void postOrderPrint(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderPrint(node.left);
        inOrderPrint(node.right);
        System.out.print(node.data + " ");
    }

    public void add(TreeNode node, int value) {
        if (value > node.data) {
            if (node.right == null) {
                node.right = new TreeNode(value);
            } else {
                add(node.right, value);
            }
        } else {
            if (node.left == null) {
                node.left = new TreeNode(value);
            } else {
                add(node.left, value);
            }
        }
    }

    public void add(int value) {
        if (root == null) {
            root = new TreeNode(value);
            return;
        }
        add(root, value);
    }

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }





}
