
/*
Course: COMP 272
Assignment: 1 - Q4
Name: Youssef Girgeis
Student ID : 3396678
Date: May 17, 2020
*/

public class RandomQueue{

    private int maxSize; // the max number items in the queue 
    private int[] queue; // this is our queue 
    private int front; // index of the element at the front
    private int end; // index of the element at the back of the queue 
    private int counter; // number of items in the queue

    /**
     * This contructor inializes the array to maxSize
     * Also it initalizes front, end, and counter varaibles
     * @param maxSize The size of the array
     */
    public RandomQueue(int maxSize){
        this.maxSize = maxSize;
        queue = new int[maxSize];
        front = 0;
        end = -1;
        counter = 0;
    }

    /**
     * add new int value to the end of the queue.
     * @param item The quene's new item
     */
    public void add (int item){

        // to make sure there is space for the new item
        if (isFull()){
            // create new array double the size of the queue.
            int[] newArray = new int[maxSize *2];

            //copy the queue into the new array 
            System.arraycopy(queue, 0, newArray, 0, counter);

            // assign the  newArray to the queue
            queue = newArray;
        }

        end += 1; 
        queue[end] = item; // new item goes to the end of the queue
        counter++; // increate the number of items in the queue by 1
    }

    /**
     * remove an item from front of the queue
     * @return removed item
     */
    public int remove(){
        // make sure the queue has items to remove
        if(!isEmpty()){
            // create a random index ranges between 0 and the number of items in the queue
            int randomIndex = (int)(Math.random() * counter);

            // store the random item to remove in removedItem 
            int removedItem = queue[randomIndex];

            //replace removed item with the last item in the queue
            queue[randomIndex] = queue[end];

            // decrease the number of items in the queue by 1
            counter--;

            return removedItem;
        }

        return -1; 
    }

    /**
     * check if the queue is empty
     * @return True if the queue is empty
     */
    public boolean isEmpty(){
        return (counter == 0);
    }

    /**
     *  check if the queue is full
     * @return True if queue is full
     */
    public boolean isFull(){
        return (counter == maxSize);
    }

    /**
     * print all items in the queue.
     */
    public void printItems(){

        for (int i=0; i<counter; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

}