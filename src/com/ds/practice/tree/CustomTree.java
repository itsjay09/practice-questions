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


    }

    public void add(TreeNode node, int value){
        if(value > node.data){
            if(node.right == null){
                node.right = new TreeNode(value);
            }else{
                add(node.right, value);
            }
        }else{
            if(node.left == null){
                node.left = new TreeNode(value);
            }else{
                add(node.left, value);
            }
        }
    }

    public void add(int value){
        if(root == null){
            root = new TreeNode(value);
            return;
        }
        add(root, value);
    }




    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }





}
