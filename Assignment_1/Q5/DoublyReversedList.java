public class DoublyReversedList{

    private Node head; // first node in the list
    private Node tail; // last node in the list 

    /**
     * Reverse nodes in a linked list
     */
    public void reverseNodes(){
        
        Node current = head; // current nodes starts at the head
        Node beforeCurrent = null; // behind the current node

        while(current != null){
            beforeCurrent = current.getPrevious();
            
            //set the tail to head
            if(beforeCurrent == null){
                tail = current;
            }
            current.setPrevious(current.getNext()); //set the curret previous link equals to current's next link
            current.setNext(beforeCurrent); //point current's next link to beforeCurrent node
            current = current.getPrevious(); //set current to the previous node.
        }

        // after moving the head to the tail position, the new head is equal to beforeCurrent
        if (beforeCurrent != null){
            head = beforeCurrent.getPrevious();
        }
    }

    /**
     * Add a node to the front of a linked list
     * @param newNode The new node to add to the list
     */
    public void addToFront(Node newNode){
        
        newNode.setNext(head); // set the next link of newNode to head

        // if the list is empty
        if (head == null){
            tail = newNode;
        }
        else{
            head.setPrevious(newNode);
            newNode.setNext(head);
        }
        head = newNode;
    }

    /**
     * Print a list of linked nodes on the screen.
     */
    public void printNodes(){
        Node current = head;
        System.out.print("HEAD -> ");

        while(current != null){
            System.out.print(current.getValue());
            current = current.getNext();
            System.out.print(" <=> ");
        }
        System.out.println("null \n");
    }
}