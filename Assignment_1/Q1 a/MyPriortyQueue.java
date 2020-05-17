public class MyPriortyQueue{

    private Node head;

    public void add(int number){

        Node newNode = new Node(number);

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

    }

    public void printNodes(){
        Node current = head;
        
        while (current.getNext() != null){
            System.out.print(current.getNumber() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

}