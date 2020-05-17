public class Queue{

    private int maxSize;
    private int[] quereArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue(int size){
        this.maxSize = size;
        this.quereArray = new int[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void add(int num){
        rear++;
        quereArray[rear] = num;
        nItems++;
    }

    public int remove(){
        int temp = quereArray[front];
        front++;

        if(front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }

    public int peek(){
        return quereArray[front];
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    public void view(){
        System.out.print("[ ");
        for(int i=0; i<quereArray.length; i++){
            System.out.print(quereArray[i]+ " ");
        }
        System.out.println(" ]");
    }


}