public class RandomQueue{

    private Node head;
    private Node tail;
    private int size;

    public void addToEnd(Node newNode){

        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
        size++;
        newNode.setIndex(size-1);
    }

    public void remove(){

    }

    public void printNodes(){
        Node current = head;
        System.out.print("HEAD -> ");

        while(current != null){
            System.out.print(current.getValue());
            current = current.getNext();
            System.out.print(" <=> ");
        }
        System.out.println("null\n");
    }

}