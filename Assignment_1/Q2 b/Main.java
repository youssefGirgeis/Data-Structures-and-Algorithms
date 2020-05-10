
public class Main{
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        dll.addToFront(node1);
        dll.addToFront(node2);
        dll.addToFront(node3);
        dll.addToFront(node4);
        dll.addToFront(node5);

        System.out.println("-----Before Swapping-----");
        dll.printNodes();

        System.out.println("------Swap Node 4 and Node 3-----");
        dll.swapNodes(node4, node3);
        dll.printNodes();

        System.out.println("-------Swap Node 5 and Node 3-------");
        dll.swapNodes(node5, node3);
        dll.printNodes();

        System.out.println("-------Swap Node 1 and Node 2");
        dll.swapNodes(node2, node1);
        dll.printNodes();
    }
}