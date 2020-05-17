
public class Node{

    private int value; // node's content
    private Node next; //points to the next node
    private Node previous; // points to the previous node

    public Node(int value){
        this.value = value;
    }

    /**
     * setter for node's value
     * @param value Node's new value
     */
    public void setValue(int value){
        this.value = value;
    }

    /**
     * getter for the value of the node
     * @return Node's value
     */
    public int getValue(){
        return this.value;
    }

    /**
     * set node's next link/pointer
     * @param next Node's new next pointer
     */
    public void setNext(Node next){
        this.next = next;
    }

    /**
     * getter for the node next link
     * @return Node's next link/pointer
     */
    public Node getNext(){
        return this.next;
    }

    /**
     * set node's previous link/pointer
     * @param previous Node's new previous pointer
     */
    public void setPrevious(Node previous){
        this.previous = previous;
    }

    /**
     * getter for the node previous pointer
     * @return Node's previous pointer
     */
    public Node getPrevious(){
        return this.previous;
    }

}