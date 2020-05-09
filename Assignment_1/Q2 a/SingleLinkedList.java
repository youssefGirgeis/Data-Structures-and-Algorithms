import org.graalvm.compiler.graph.Node;

public class SingleLinkedList{

    private Node head;

    public void addToFront(int value){

        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
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