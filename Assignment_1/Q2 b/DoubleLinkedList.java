/*
Course: COMP 272
Assignment: 1 - Q2 b
Name: Youssef Girgeis
Student ID : 3396678
Date: May 17, 2020
*/

public class DoubleLinkedList{

    private Node head; // first node in the list
    private Node tail; // last node in the list

    /**
     * Swaps two adjacent nodes in a doubly linked list
     * @param firstNode first node
     * @param secondNode second node
     */
    public void swapNodes(Node firstNode, Node secondNode){
        
        Node beforeFirst = firstNode.getPrevious(); // the node before the first node
        Node afterSecond = secondNode.getNext(); // the node after the second node

        // if firstNode is the first node in the list, then
        // make secondNode's previous links points to null
        // and make secondNode the head 
        if (firstNode == head){
            secondNode.setPrevious(null);
            head = secondNode;
        }
        // if secondNode is the last node in the list, then
        // the first node will be the tail and 
        // the node before the first will point to the second node
        else if (secondNode == tail){
            firstNode.setNext(null);
            beforeFirst.setNext(secondNode);
            tail = firstNode;
        }
        // if both nodes lies in the middle
        else{
            // swap the two nodes.
            secondNode.setPrevious(beforeFirst);
            beforeFirst.setNext(secondNode);
            afterSecond.setPrevious(firstNode);
        }

        firstNode.setNext(afterSecond);
        firstNode.setPrevious(secondNode);
        secondNode.setNext(firstNode);
    }

    /**
     * Add new node to the front of doubly linked list
     * @param newNode List's new node
     */
    public void addToFront(Node newNode){
        
        newNode.setNext(head);
        if (head == null){
            tail = newNode;
        }
        else{
            head.setPrevious(newNode);
            newNode.setNext(head);
        }
        head = newNode;
    }

    /**
     * print all nodes in the doubly linked list
     */
    public void printNodes(){
        Node current = head;
        System.out.print("HEAD -> ");

        while(current != null){
            System.out.print(current.getValue());
            current = current.getNext();
            System.out.print(" <=> ");
        }
        System.out.println("null \n");
    }
}