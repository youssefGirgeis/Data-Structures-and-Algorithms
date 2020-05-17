public class Main{
    public static void main(String[] args) {
        
        Queue myQueue = new Queue();
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(100);
        myStack.push(1);
        myStack.push(2);
        myStack.push(4);

        //myStack.pop();

        myStack.printStack();

        int removedItem = myStack.pop();
        myStack.printStack();
        System.out.println("One item removed from the stack: " + removedItem);

        removedItem = myStack.pop();
        myStack.printStack();
        System.out.println("One item removed from the stack: " + removedItem);

        //System.out.println(myQueue.getSize());
    }
}