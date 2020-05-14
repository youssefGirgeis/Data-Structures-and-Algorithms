
public class SingleLinkedList{

    private Node head;

    public void swapNodes(Node node1, Node node2){

        if(node1 == head || node2 == head){
            if (node1 == head && node1.getNext() == node2){
                node1.setNext(node2.getNext());
                node2.setNext(node1);
                head = node2;
            }
            else if (node2 == head && node2.getNext() == node1){
                node2.setNext(node1.getNext());
                node1.setNext(node2);
                head = node1;
            }
        }

        else{
            Node firstNode = null;
            Node secondNode = null;
            Node current = head;
            Node previous = null;

            if (node1.getNext() == node2){
                firstNode = node1;
                secondNode = node2;
            }
            else if(node2.getNext() == node1){
                firstNode = node2;
                secondNode = node1;
            }
            else{return;}
            
            while(current != firstNode){
                previous = current;
                current = current.getNext();
            }

            previous.setNext(secondNode);
            firstNode.setNext(secondNode.getNext());
            secondNode.setNext(firstNode);

        }

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