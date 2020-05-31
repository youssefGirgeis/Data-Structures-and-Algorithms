/*
Course: COMP 272
Assignment: 2 - Q5
Name: Youssef Girgeis
Student ID : 3396678
Date: May 31, 2020

Problem:
Create a subclass of BinaryTree whose nodes have fields for storing
preorder, post-order, and in-order numbers. Write methods preOrderNumber(),
inOrderNumber(), and postOrderNumbers() that assign these numbers correctly. These
methods should each run in O(n) time.
*/

public class BinaryTree {
    
    protected TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }
}