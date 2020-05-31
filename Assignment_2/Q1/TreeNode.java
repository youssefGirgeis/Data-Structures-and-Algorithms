
/*
Course: COMP 272
Assignment: 2 - Q1
Name: Youssef Girgeis
Student ID : 3396678
Date: May 31, 2020

Problem:
Design an algorithm for the following operations for a binary tree BT, and show the
worst-case running times for each implementation:
preorderNext(x): return the node visited after node x in a pre-order traversal of BT.
postorderNext(x): return the node visited after node x in a post-order traversal of BT.
inorderNext(x): return the node visited after node x in an in-order traversal of BT
*/


public class TreeNode {
    
    private int data; // value stored in the node
    private TreeNode parent; // parent of node
    private TreeNode leftChild; // left child node
    private TreeNode rightChild; // right child node

    /**
     * creates new node and sets the left child and
     * right child to null
     * @param value new node's value
     * @return the new node
     */
    public TreeNode insert(int value){
        TreeNode node = new TreeNode();
        node.leftChild = null; 
        node.rightChild = null;
        node.parent = null;
        node.data = value;
        return node;
    }

    /**
     * return the node visited after node in a pre-order traversal of BT
     * @param node the node before target in a pre-order traversal of BT
     * @return the target node
     */
    public TreeNode preOrderNext(TreeNode node){

        if (node.leftChild != null) 
            return node.leftChild; 

        TreeNode current = node;
        parent = current.parent; 
        while (parent != null && parent.rightChild == current)  
        { 
            current = current.parent; 
            parent = parent.parent; 
        } 

        // if root then no next and return null
        if (parent == null) 
            return null; 

        return parent.rightChild; 
    }

    /**
     * returns the node visited after node in a post-order traversal of BT
     * @param node node before target in a post-order traversal of BT
     * @return the target node
     */
    public TreeNode postOrderNext(TreeNode node){

        // if root, then no next node and return null.
        if (node.parent == null)  
            return null;  

        // root is the target if node is the right child
        //or root's right is empty
        TreeNode parent = node.parent;  
        if (parent.rightChild == null || parent.rightChild == node)  
            return parent;  

        
        // return leftmost child in right sub-tree
        TreeNode current = parent.rightChild;  
        while (current.leftChild != null)  
        current = current.leftChild;  

        return current; 
    }

    /**
     * returns the node visited after node in an in-order traversal of BT
     * @param node node before target in an in-order traversal of BT
     * @return target node
     */
    public TreeNode inOrderNext(TreeNode node){

        if (node.rightChild != null){
            TreeNode current = node;
            while(current.leftChild != null){
                current = current.leftChild;
            }
            return current;
        }

        TreeNode p = node.parent;
        while(p != null && node == p.rightChild){
            node = p;
            p = p.parent;
        }
        return p;
    }

    // below are the setters and getters for the TreeNode's fields
    
    public void setParent(TreeNode parent){
        this.parent = parent;
    }

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