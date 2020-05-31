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

public class TreeNode {
    
    private int data; // node's value
    private TreeNode leftChild; // left child node
    private TreeNode rightChild; // right child node

    /**
     * constructor to set the node's data to the value passed in
     */
    public TreeNode(int value){
        this.data = value;
    }

    // below are the setters and gettters for the TreeNode's fields
    
    public void setLeft(TreeNode left){
        this.leftChild = left;
    }
    public TreeNode getLeft(){
        return this.leftChild;
    }

    public void setRight(TreeNode right){
        this.rightChild = right;
    }
    
    public TreeNode getRight(){
        return this.rightChild;
    }

    public int getData(){
        return this.data;
    }
}