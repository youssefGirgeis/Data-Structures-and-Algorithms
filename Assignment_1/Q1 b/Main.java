/*
Course: COMP 272
Assignment: 1 - Q1 b
Name: Youssef Girgeis
Student ID : 3396678
Date: May 17, 2020
*/

public class Main{
    public static void main(String[] args) {
        
        // create new empty stack
        Stack myStack = new Stack();

        // add five elements to the stack
        myStack.push(10);
        myStack.push(100);
        myStack.push(1);
        myStack.push(2);
        myStack.push(4);

        // print all elements in the stack
        myStack.printStack();

        // remove an element from the stack and print it.
        int removedItem = myStack.pop();
        System.out.println("Last element has been removed from the stack: " + removedItem);
        myStack.printStack();

        // remove an element from the stack and print it.
        removedItem = myStack.pop();
        System.out.println("Last element has been removed from the stack: " + removedItem);
        myStack.printStack();
        

    }
}