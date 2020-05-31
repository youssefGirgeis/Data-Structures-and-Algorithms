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

public class Main {
    public static void main(String[] args) {
        
        // create a binary tree
        BinaryTree bt = new BinaryTree();
        // set the root
        bt.setRoot(new TreeNode(25));
        // set the children
        bt.getRoot().setLeft(new TreeNode(20));
        bt.getRoot().setRight(new TreeNode(27));
        bt.getRoot().getLeft().setLeft(new TreeNode(14));
        bt.getRoot().getLeft().setRight(new TreeNode(22));
        bt.getRoot().getRight().setLeft(new TreeNode(26));
        bt.getRoot().getRight().setRight(new TreeNode(30));

        // check if the BT we created above is a BST
        if(bt.isBinarySearchTree()){
            System.out.println("This tree is a binary search tree");
        } else{
            System.out.println("This tree is not a binary search tree");
        }
        
    }
}