/*
Course: COMP 272
Assignment: 1 - Q2 a
Name: Youssef Girgeis
Student ID : 3396678
Date: May 17, 2020
*/

public class Node{
    
    private int value; // node's content
    private Node next; //points to the next node

    /**
     * This contructor creates a new node
     * @param value new Node's value
     */
    public Node(int value){
        this.value = value;
    }

    /**
     * setter for node's value
     * @param value Node's new value
     */
    public void setValue(int value){
        this.value = value;
    }

    /**
     * getter for the value of the node
     * @return Node's value
     */
    public int getValue(){
        return this.value;
    }

    /**
     * set node's next link/pointer
     * @param next Node's new next pointer
     */
    public void setNext(Node next){
        this.next = next;
    }

    /**
     * getter for the node next link
     * @return Node's next link/pointer
     */
    public Node getNext(){
        return this.next;
    }
}