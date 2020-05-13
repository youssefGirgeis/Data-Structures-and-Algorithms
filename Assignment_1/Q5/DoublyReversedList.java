public class DoublyReversedList{

    private Node head;
    private Node tail;
    private int size; 

    public void reverseNodes(){
        
        Node current = head;
        Node beforeCurrent = null;

        while(current != null){
            beforeCurrent = current.getPrevious();
            current.setPrevious(current.getNext());
            current.setNext(beforeCurrent);
            current = current.getPrevious();
        }
        if (beforeCurrent != null){
            head = beforeCurrent.getPrevious();
        }
    }

    public void addToFront(Node newNode){
        
        newNode.setNext(head);
        if (head == null){
            tail = newNode;
        }
        else{
            head.setPrevious(newNode);
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }

    public boolean isEmpty(){
        return (size == 0);
    }


    public void printNodes(){
        Node current = head;
        System.out.print("HEAD -> ");

        while(current != null){
            System.out.print(current.getValue());
            current = current.getNext();
            System.out.print(" <=> ");
        }
        System.out.println("null \n");
    }
}