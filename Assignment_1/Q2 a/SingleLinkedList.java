/*
Course: COMP 272
Assignment: 1 - Q2 a
Name: Youssef Girgeis
Student ID : 3396678
Date: May 17, 2020
*/

public class SingleLinkedList{

    private Node head; // refers to the first item in the list

    /**
     * This method swaps two adjacent nodes in a singly linked list
     * @param node1 first node
     * @param node2 second node
     */
    public void swapNodes(Node node1, Node node2){

        // if one of the nodes to swap is a the head
        if(node1 == head || node2 == head){
            // check if the first argument is head and second argument is adjacent
            if (node1 == head && node1.getNext() == node2){
                node1.setNext(node2.getNext());
                node2.setNext(node1);
                head = node2;
            }
            // check if the second argument is head and first argument is adjacent
            else if (node2 == head && node2.getNext() == node1){
                node2.setNext(node1.getNext());
                node1.setNext(node2);
                head = node1;
            }
        }
        // case where none of the nodes is the head (both nodes in the middle)
        else{
            Node firstNode = null; // as ordered in the list
            Node secondNode = null; // comes after the first node
            Node current = head; // starts at the head
            Node previous = null; // node before the first node

            // check whether node1 comes before node2 in the list order
            if (node1.getNext() == node2){
                firstNode = node1;
                secondNode = node2;
            }
            // check whether node2 comes before node1 in the list order
            else if(node2.getNext() == node1){
                firstNode = node2;
                secondNode = node1;
            }
            // end if they are not adjacent
            else{return;}
            
            // loop through the list until current == first node
            while(current != firstNode){
                previous = current; // node before first node
                current = current.getNext();
            }

            // swap the two nodes
            previous.setNext(secondNode);
            firstNode.setNext(secondNode.getNext());
            secondNode.setNext(firstNode);

        }

    }

    /**
     * Add a new node to the front of a singly linked list
     * @param newNode List's new node
     */
    public void addToFront(Node newNode){
        
        // sets newNodes' next pointer to head and make newNode the head
        newNode.setNext(head);
        head = newNode;
    }

    /**
     * print all nodes in a singly linked list
     */
    public void printNodes(){
        Node current = head;
        System.out.print("HEAD -> ");

        while(current != null){
            System.out.print(current.getValue());
            current = current.getNext();
            System.out.print(" -> ");
        }
        System.out.println("null\n");
    }
}