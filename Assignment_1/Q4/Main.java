public class Main{
    public static void main(String[] args) {

        RandomQueue rq = new RandomQueue();
        
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        rq.addToEnd(node1);
        rq.addToEnd(node2);
        rq.addToEnd(node3);
        rq.addToEnd(node4);
        rq.addToEnd(node5);

        rq.printNodes();


    }
}