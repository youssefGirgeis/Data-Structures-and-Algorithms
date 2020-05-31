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

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private int preOrder;
    private int postOrder;
    private int inOrder;


    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder(){

        if(leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.print(data + " ");
        this.inOrder = data;

        if (rightChild != null){
            rightChild.traverseInOrder();
        }
    }


    public void preOrderNumber() {
        if(leftChild != null){
            System.out.print(leftChild.data + " ");
            this.preOrder = data;
            leftChild.preOrderNumber();
        }
        if (rightChild != null){
            System.out.print(rightChild.data + " ");
            this.preOrder = data;
            rightChild.preOrderNumber();
        }
    }

    public void postOrderNumber(){

        if (leftChild != null){
            leftChild.postOrderNumber();
        }

        if(rightChild != null){
            rightChild.postOrderNumber();
        }
        this.postOrder = data;
        System.out.print(data + " ");

    }



    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getInOrder(){
        return this.inOrder;
    }

    public int getPreOrder(){
        return this.preOrder;
    }

    public int getPostOrder(){
        return this.postOrder;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
    
}