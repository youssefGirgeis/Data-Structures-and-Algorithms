public class Stack{

    // create new empty queues.
    Queue q1 = new Queue();
    Queue q2 = new Queue();

    /**
     *  Insert element to the end of the stack.
     * @param value Stack's new element
     */
    public void push(int value){
        q1.enqueue(value);
    }

    /**
     * Remove an element from the end of stack
     * @return removed element
     */
    public int pop(){

        Queue tempQueue = new Queue(); // temperay queue to store q1

        // loop through q1 as long as it has more then one element
        while(q1.getSize() > 1){
            q2.enqueue(q1.dequeue()); // add all elements q1 in q2 except the last one
        }

        // swap q1 and q2
        tempQueue = q1;
        q1 = q2;
        q2 = tempQueue;

        return q2.dequeue(); 
    }
    
    /**
     * print all elements in the stack
     */
    public void printStack(){
        Node current = q1.getHead();
        
        System.out.print("[ ");
        while (current.getNext() != null){
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.print(current.getValue() + " ");
        System.out.print("]\n");
    }
}