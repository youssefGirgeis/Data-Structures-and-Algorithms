public class Node{
    private int number;
    private Node next;

    public Node(int number){
        this.number = number;
        next = null;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}