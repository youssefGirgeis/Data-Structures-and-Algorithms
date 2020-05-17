/*
Course: COMP 272
Assignment: 1 - Q4
Name: Youssef Girgeis
Student ID : 3396678
Date: May 17, 2020
*/

public class Main{
    public static void main(String[] args) {

        // create a random queue 
        RandomQueue rq = new RandomQueue(5);
        
        // Add 5 items to the queue.
        rq.add(10);
        rq.add(2);
        rq.add(36);
        rq.add(4);
        rq.add(59);

        //print all items in the queue
        rq.printItems();

        //keep removing items randomely from the queue as long as it is not empty
        while(! rq.isEmpty()){
            System.out.println(rq.remove() + " is removed");
            rq.printItems();
        }
    }
}