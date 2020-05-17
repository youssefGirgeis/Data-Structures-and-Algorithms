public class Queue{

    private Node head;
    private int size;

    public void enqueue(int value){
        
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
        }
        else{
            Node lastNode = head;
            while(lastNode.getNext() != null){
                lastNode = lastNode.getNext();
            }
            
            lastNode.setNext(newNode);
        }
        size++;
    }

    public int dequeue(){
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        size--;
        return temp.getValue();
    }

    public int getSize(){
        return size;
    }

    public Node getHead(){
        return head;
    }

}