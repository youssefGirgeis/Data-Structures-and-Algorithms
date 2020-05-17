public class Stack{

    Queue q1 = new Queue();
    Queue q2 = new Queue();

    public void push(int value){
        q1.enqueue(value);
    }

    public int pop(){

        Queue tempQueue = new Queue();

        while(q1.getSize() > 1){
            q2.enqueue(q1.dequeue());
        }

        tempQueue = q1;
        q1 = q2;
        q2 = tempQueue;

        return q2.dequeue();
    }

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