public class DoubleLinkedList{

    private Node head;
    private Node tail;

    public void swapNodes(Node firstNode, Node secondNode){
        
        Node beforeFirst = firstNode.getPrevious();
        Node afterSecond = secondNode.getNext();

        if (firstNode == head){
            secondNode.setPrevious(null);
            head = secondNode;
        }
        else if (secondNode == tail){
            firstNode.setNext(null);
            beforeFirst.setNext(secondNode);
            tail = firstNode;
        }
        else{
            secondNode.setPrevious(beforeFirst);
            beforeFirst.setNext(secondNode);
            afterSecond.setPrevious(firstNode);
        }

        firstNode.setNext(afterSecond);
        firstNode.setPrevious(secondNode);
        secondNode.setNext(firstNode);
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