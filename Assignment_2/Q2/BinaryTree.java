/*
Course: COMP 272
Assignment: 2 - Q2
Name: Youssef Girgeis
Student ID : 3396678
Date: May 31, 2020

Problem:
Design a recursive linear-time algorithm that tests whether a binary tree satisfies the
search tree order property at every node.
*/

public class BinaryTree {
    private TreeNode root; // root of the BST
    
    // minValue is used to make sure the left child is not bigger than parent
    // this value could be set any small value as long as it is smaller than
    // any value in the tree. No node is smaller than zero in my tree
    private  int min_value = 0; 

    // max_value is used to make sure the right child is not smaller than parent
    // this value could be set any large value as long as it is larger than
    // any value in the tree. No node is larger than 100 in my tree
    private  int max_value = 100;

    /**
     * set the root node
     * @param node to be the root
     */
    public void setRoot(TreeNode root){
        this.root = root;
    }

    /**
     * get the root node
     * @return root node
     */
    public TreeNode getRoot() {
        return this.root;
    }

    /**
     * calls isBST() method
     * @return 
     */
    public boolean isBinarySearchTree(){
        return isBST(root, min_value, max_value);
    }

    /**
     * checks if a binary tree is a BST
     * @param node starts at the root, then moves down to children
     * @param min starts at 0, then changes as the node changes
     * @param max starts at 100, then changes as the node changes
     * @return true if the tree is BST
     */
    private boolean isBST(TreeNode node, int min, int max){
        
        if (node == null){ return true; }
        if(node.getData() < min || node.getData() > max){ return false; }
        return (isBST(node.getLeft(), min, node.getData()-1) && isBST(node.getRight(), node.getData()+1, max));
    }


}