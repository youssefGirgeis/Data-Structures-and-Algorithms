
public class SingleLinkedList{

    private Node head;

    public void swapNodes(Node beforeTarget){
        
        // if (isHead(beforeTarget)){
        //     Node afterTarget = beforeTarget.getNext();
        //     beforeTarget.setNext(afterTarget.getNext());
        //     afterTarget.setNext(beforeTarget);
        //     head = afterTarget;
        // }

        Node target = beforeTarget.getNext();
        Node afterTarget = target.getNext();

        beforeTarget.setNext(afterTarget);
        target.setNext(afterTarget.getNext());
        afterTarget.setNext(target);
    }

    public void addToFront(Node newNode){

        //Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    public boolean isHead(Node n){
        return n == head;
    }

    public void printNodes(){
        Node current = head;
        System.out.print("HEAD -> ");

        while(current != null){
            System.out.print(current.getValue());
            current = current.getNext();
            System.out.print(" -> ");
        }
        System.out.println("null\n");
    }
}