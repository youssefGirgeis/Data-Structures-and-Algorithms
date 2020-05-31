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

public class SubBinaryTree extends BinaryTree {
    
    private int preOrder;
    private int postOrder;
    private int inOrder;


    public void inOrderNumber(){
        if (root != null){
            root.traverseInOrder();
        }
    }

    public void preOrderNumber(){
        if (root != null){
            System.out.print(root.getData() + " ");
            root.preOrderNumber();
        }
    }

    public void postOrderNumber(){
        if (root != null){
            root.postOrderNumber();
        }
    }

    public TreeNode getRoot(){
        return this.root;
    }

}