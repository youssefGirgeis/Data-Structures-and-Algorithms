
public class SingleLinkedList{

    private Node head;

    public void swapNodes(){

    }

    public void addToFront(Node newNode){

        //Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    public boolean checkHead(Node n){
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
        System.out.println("null");
    }
}