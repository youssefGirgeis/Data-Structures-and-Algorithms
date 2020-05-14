
public class RandomQueue{

    private int maxSize; // the max number items in the queue 
    private int[] queue; // this is our queue 
    private int front; // index of the element at the front
    private int end; // index of the element at the back of the queue 
    private int counter; // number of items in the queue

    public RandomQueue(int maxSize){
        this.maxSize = maxSize;
        queue = new int[maxSize];
        front = 0;
        end = -1;
        counter = 0;
    }

    public void add (int item){

        if (isFull()){
            int[] newArray = new int[maxSize *2];
            System.arraycopy(queue, 0, newArray, 0, counter);
            queue = newArray;
        }

        end += 1;
        queue[end] = item;
        counter++;
    }

    public int remove(){

        if(!isEmpty()){
            int randomIndex = (int)(Math.random() * counter);
            int removedItem = queue[randomIndex];
            queue[randomIndex] = queue[end];
            counter--;

            return removedItem;
        }

        return -1;
    }


    public boolean isEmpty(){
        return (counter == 0);
    }

    public boolean isFull(){
        return (counter == maxSize);
    }

    public void printItems(){

        for (int i=0; i<counter; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

}