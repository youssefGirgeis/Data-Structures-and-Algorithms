/*
Course: COMP 272
Assignment: 1 - 1 a
Name: Youssef Girgeis
Student ID : 3396678
Date: May 17, 2020
*/

public class Node{
    
    private int number;
    private Node next;

    /**
     * Contructor to initialize the new node.
     * @param number node's new value.
     */
    public Node(int number){
        this.number = number;
        next = null;
    }

    /**
     * getter of the value of the node
     * @return Node's value
     */
    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
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