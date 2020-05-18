/*
Course: COMP 272
Assignment: 1 - 1 a
Name: Youssef Girgeis
Student ID : 3396678
Date: May 17, 2020
*/

public class MyPriortyQueue{

    private Node head; // first element in the queue.
    private int size; // number of elements in the queue

    /**
     * add element to the front of queue
     * @param number Queue's new element
     */
    public void add(int number){

        Node newNode = new Node(number);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    /**
     * Delete the minimum number in the queue. 
     */

    public void deleteMin(){

        Node current = head.getNext(); // starts at element after the first
        int min = head.getNumber(); // minimum number in the queue.
        Node removedNode = head; // element to remove
        Node previous = head; // element before the current
        Node previous2 = head; // element before the current

        // in case only one element in the queue.
        if (size() == 1){
            head = null;
            return; 
        }

        while(current.getNext() != null){
            
            // find the minimum elements
            if (current.getNumber() < min){
                min = current.getNumber();
                removedNode = current;
                previous = previous.getNext();
            }

            current = current.getNext(); // move to the next current
            previous2 = previous2.getNext(); // move to the next previous

            if (current.getNext() == null && current.getNumber() < min){
                removedNode = current;
                previous = previous2;
            }
            

        }
        // if the minimum element is the first
        if (removedNode == head){
            head = head.getNext();
            removedNode.setNext(null);
        } 
        // if minimum element is the last, then make previous to be the last
        else if (removedNode.getNext() == null){
            previous.setNext(null);
        }
        // minimum element is in the middle
        else{
            previous.setNext(removedNode.getNext());
            removedNode.setNext(null);
        }
        size--;

    }

    /**
     * Get the number of elements in the queue.
     * @return number of elements in the queue.
     */
    public int size(){
        return size;
    }

    /**
     * print all elements in the queue.
     */
    public void printNodes(){
        Node current = head;
        
        System.out.print("[ ");
        while (current.getNext() != null){
            System.out.print(current.getNumber() + " ");
            current = current.getNext();
        }
        System.out.print(current.getNumber() + " ");
        System.out.print("]\n\n");
    }

}