/*
Course: COMP 272
Assignment: 1 - Q2 b
Name: Youssef Girgeis
Student ID : 3396678
Date: May 17, 2020
*/

public class Main{
    public static void main(String[] args) {

        // create new empty doubly linked list
        DoubleLinkedList doublyLinkedList = new DoubleLinkedList();

        // create five new nodes.
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // add the five new nodes to the doubly linked list
        doublyLinkedList.addToFront(node1);
        doublyLinkedList.addToFront(node2);
        doublyLinkedList.addToFront(node3);
        doublyLinkedList.addToFront(node4);
        doublyLinkedList.addToFront(node5);

        // print all nodes in the doubly linked list
        System.out.println("-----Before Swapping-----");
        doublyLinkedList.printNodes();

        // swap node 4 and 3, then print all nodes
        System.out.println("------Swap Node 4 and Node 3-----");
        doublyLinkedList.swapNodes(node4, node3);
        doublyLinkedList.printNodes();

        // swap node 5 and 3, then print all nodes
        System.out.println("-------Swap Node 5 and Node 3-------");
        doublyLinkedList.swapNodes(node5, node3);
        doublyLinkedList.printNodes();

        // swap node 1 and 2, then print all nodes.
        System.out.println("-------Swap Node 1 and Node 2");
        doublyLinkedList.swapNodes(node2, node1);
        doublyLinkedList.printNodes();
    }
}