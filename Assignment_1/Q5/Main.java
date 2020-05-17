public class Main{
    public static void main(String[] args) {
        
        DoublyReversedList doublyReversedList = new DoublyReversedList();

        // create five new nodes.
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // add the five new nodes to the list.
        doublyReversedList.addToFront(node1);
        doublyReversedList.addToFront(node2);
        doublyReversedList.addToFront(node3);
        doublyReversedList.addToFront(node4);
        doublyReversedList.addToFront(node5);
        
        //print nodes, then reverse them, then print them again.
        doublyReversedList.printNodes();
        doublyReversedList.reverseNodes();
        System.out.println("Reverse the list");
        doublyReversedList.printNodes();


    }
}