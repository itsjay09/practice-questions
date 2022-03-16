package com.ds.practice.tree;

public class HeightTree {

    TreeNode root;

    static class TreeNode{
        int data;
        TreeNode leftTree, rightTree;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void insert(int item){
        if(root == null) {
            root = new TreeNode(item);
        }

        insert(root, item);
    }

    private void insert(TreeNode subTree, int item) {
        if (subTree.data == item){
            return;
        }

        if(item > subTree.data){
            if(subTree.rightTree == null){
                subTree.rightTree = new TreeNode(item);
            }else{
                insert(subTree.rightTree, item);
            }
        }else{
            if(subTree.leftTree == null){
                subTree.leftTree = new TreeNode(item);
            }else{
                insert(subTree.leftTree, item);
            }
        }
    }

    public int height(){
        if(root == null) {
            return 0;
        }

        return treeHeight(root);
    }

    public int treeHeight(TreeNode subTree){
        if(subTree == null){
            return 0;
        }

        int leftHeight = treeHeight(subTree.leftTree);
        int rightHeight = treeHeight(subTree.rightTree);
        int maxHeight = (rightHeight > leftHeight) ? rightHeight : leftHeight;
        return 1 + maxHeight;
    }


    public static void main(String[] args) {

        HeightTree tree = new HeightTree();
        tree.insert(15);
        tree.insert(25);
        tree.insert(12);
      //  tree.insert(30);
     //   tree.insert(10);
       // tree.insert(27);

        System.out.println(tree.height());
    }


}
