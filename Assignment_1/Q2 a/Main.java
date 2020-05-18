/*
Course: COMP 272
Assignment: 1 - Q2 a
Name: Youssef Girgeis
Student ID : 3396678
Date: May 17, 2020
*/

public class Main{
    public static void main(String[] args) {

        //create new singly linked list
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        // create five new nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // add the five new nodes to the list
        singleLinkedList.addToFront(node1);
        singleLinkedList.addToFront(node2);
        singleLinkedList.addToFront(node3);
        singleLinkedList.addToFront(node4);
        singleLinkedList.addToFront(node5);

        // print all nodes in the list
        singleLinkedList.printNodes();

        // swap node 1 and node 2 and print all nodes after swapping
        System.out.println("Swap node 1 and node 2\n");
        singleLinkedList.swapNodes(node1, node2);
        singleLinkedList.printNodes();

        //swap nodes 4 and node 5 and print all nodes after swapping
        System.out.println("Swap node 4 and node 5\n");
        singleLinkedList.swapNodes(node4, node5);
        singleLinkedList.printNodes();

    }
}