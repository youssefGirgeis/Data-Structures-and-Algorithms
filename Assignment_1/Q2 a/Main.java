

public class Main{
    public static void main(String[] args) {

        SingleLinkedList sll = new SingleLinkedList();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        sll.addToFront(node1);
        sll.addToFront(node2);
        sll.addToFront(node3);
        sll.addToFront(node4);
        sll.addToFront(node5);

        sll.printNodes();
        System.out.println("After Swapping\n");
        sll.swapNodes(node4);
        sll.printNodes();

    }
}