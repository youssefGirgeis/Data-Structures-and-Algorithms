import org.graalvm.compiler.graph.Node;

public class SingleLinkedList{

    private Node head;

    public void addToFront(int value){

        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }
}