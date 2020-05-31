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

public class Main {
    public static void main(String[] args) {
        
        SubBinaryTree sbt = new SubBinaryTree();
        sbt.insert(25);
        sbt.insert(20);
        sbt.insert(14);
        sbt.insert(27);
        sbt.insert(30);
        sbt.insert(29);
        sbt.insert(26);
        sbt.insert(22);
        sbt.insert(32); 

        System.out.print("Inorder Traversal: ");
        sbt.inOrderNumber();
        System.out.print("\nPreorder Traversal: ");
        sbt.preOrderNumber();
        System.out.print("\nPostorder Traversal: ");
        sbt.postOrderNumber();
        System.out.println();

    }
}