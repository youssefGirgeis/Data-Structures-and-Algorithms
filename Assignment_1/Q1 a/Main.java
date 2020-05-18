/*
Course: COMP 272
Assignment: 1 - 1 a
Name: Youssef Girgeis
Student ID : 3396678
Date: May 17, 2020
*/

public class Main{
    public static void main(String[] args) {
        
        //  create new empty proirity queue
        MyPriortyQueue priortyQueue = new MyPriortyQueue();

        // add five elements to the priority queue.
        priortyQueue.add(2);
        priortyQueue.add(10);
        priortyQueue.add(1);
        priortyQueue.add(22);
        priortyQueue.add(3);

        // print all elements in the queue.
        System.out.println("Before Removing: ");
        priortyQueue.printNodes();

        // remove the smallest element, then print all nodes in the queue.
        System.out.println("Smallest item has been removed from the queue");
        priortyQueue.deleteMin();
        priortyQueue.printNodes();

        // remove the smallest element, then print all nodes in the queue.
        System.out.println("Smallest item has been removed from the queue");
        priortyQueue.deleteMin();
        priortyQueue.printNodes();

        // remove the smallest element, then print all nodes in the queue.
        System.out.println("Smallest item has been removed from the queue");
        priortyQueue.deleteMin();
        priortyQueue.printNodes();

        System.out.println("The size of the queue after removing items is " + priortyQueue.size());
    }
}