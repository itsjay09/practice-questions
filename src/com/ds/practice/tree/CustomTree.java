package com.ds.practice.tree;

public class CustomTree {

    TreeNode root;

    class TreeNode {
        int data;
        TreeNode leftNode, rightNode;

        TreeNode(int data) {
            this.data = data;
        }

    }

    public void insert(TreeNode subNode, int item) {
        if (item == subNode.data) {
            System.out.println("Node already present");
            return;
        }

        if (item > subNode.data) {
            if (subNode.rightNode == null) {
                subNode.rightNode = new TreeNode(item);
            } else {
                insert(subNode.rightNode, item);
            }
        } else {
            if (subNode.leftNode == null) {
                subNode.leftNode = new TreeNode(item);
            } else {
                insert(subNode.leftNode, item);
            }
        }
    }

    public void insert(int item) {
        TreeNode newNode = new TreeNode(item);
        if (root == null) {
            root = newNode;
        } else {
            insert(root, item);
        }
    }

    // In Order Traversal
    public void inOrderTraversal() {
        if (root == null) {
            return;
        } else {
            inOrderTraversal(root);
        }
    }

    private void inOrderTraversal(TreeNode subTree) {
        if (subTree == null) {
            return;
        }

        inOrderTraversal(subTree.leftNode);
        System.out.print(subTree.data + ", ");
        inOrderTraversal(subTree.rightNode);
    }


    // Pre Order Traversal
    public void preOrderTraversal() {
        if (root == null) {
            return;
        } else {
            preOrderTraversal(root);
        }
    }

    private void preOrderTraversal(TreeNode subTree) {
        if (subTree == null) {
            return;
        }

        System.out.print(subTree.data + ", ");
        preOrderTraversal(subTree.leftNode);
        preOrderTraversal(subTree.rightNode);
    }

    // Post Order Traversal
    public void postOrderTraversal() {
        if (root == null) {
            return;
        } else {
            postOrderTraversal(root);
        }
    }

    public void postOrderTraversal(TreeNode subTree) {
        if (subTree == null) {
            return;
        }

        postOrderTraversal(subTree.leftNode);
        postOrderTraversal(subTree.rightNode);
        System.out.print(subTree.data + ", ");
    }

    public static void main(String[] args) {
        CustomTree tree = new CustomTree();
        tree.insert(15);
        tree.insert(20);
        tree.insert(12);
        tree.insert(10);
        tree.insert(25);
        tree.insert(17);
        tree.insert(11);

        tree.inOrderTraversal();
        System.out.println();
        tree.preOrderTraversal();
        System.out.println();
        tree.postOrderTraversal();
    }

}
