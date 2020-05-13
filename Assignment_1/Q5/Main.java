public class Main{
    public static void main(String[] args) {
        
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        DoublyReversedList drl = new DoublyReversedList();
        drl.addToFront(node1);
        drl.addToFront(node2);
        drl.addToFront(node3);
        drl.addToFront(node4);
        drl.addToFront(node5);

        drl.printNodes();
        drl.reverseNodes();

        drl.printNodes();


    }
}