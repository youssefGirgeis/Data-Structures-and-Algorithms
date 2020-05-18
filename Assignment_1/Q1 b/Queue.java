public class Queue{

    private Node head; // first element in the queue.
    private int size; // number of elements in the queue

    /**
     * Add new element to end of end of the queue.
     * @param value The queue's new element
     */
    public void enqueue(int value){
        
        Node newNode = new Node(value);

        // make the new element first of queue is empty
        if (head == null){
            head = newNode;
        }
        // loop through the queue until last element, then add the new element
        else{
            Node lastNode = head; 
            while(lastNode.getNext() != null){
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(newNode);
        }
        size++;
    }

    /**
     * Remove an element from the front of the queue.
     * @return first element in the queue.
     */
    public int dequeue(){

        Node temp = head; // stores the first element in the queue.
        head = head.getNext(); // new head
        temp.setNext(null); // detach first element from the queue
        size--;
        return temp.getValue(); // return first element
    }

    /**
     * retrieve the number of elements in the queue
     * @return number of element in the queue.
     */
    public int getSize(){
        return size;
    }

    /**
     * return the head/first element
     * @return the first element in the queue.
     */
    public Node getHead(){
        return head;
    }

}