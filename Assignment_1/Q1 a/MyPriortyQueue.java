public class MyPriortyQueue{

    private Node head;
    private int size;

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
        size++;
    }

    public void deleteMin(){

        Node current = head.getNext();
        int min = head.getNumber();
        Node removedNode = head;
        Node previous = head;
        Node previous2 = head;

        if (size() == 1){
            head = null;
            return; 
        }

        while(current.getNext() != null){

            if (current.getNumber() < min){
                min = current.getNumber();
                removedNode = current;
                previous = previous.getNext();
            }

            current = current.getNext();
            previous2 = previous2.getNext();

            if (current.getNext() == null && current.getNumber() < min){
                removedNode = current;
                previous = previous2;
            }
            

        }

        if (removedNode == head){
            head = head.getNext();
            removedNode.setNext(null);
        } 
        else if (removedNode.getNext() == null){
            previous.setNext(null);
        }
        else{
            previous.setNext(removedNode.getNext());
            removedNode.setNext(null);
        }
        size--;

    }

    public int size(){
        return size;
    }

    public void printNodes(){
        Node current = head;
        
        System.out.print("[ ");
        while (current.getNext() != null){
            System.out.print(current.getNumber() + " ");
            current = current.getNext();
        }
        System.out.print(current.getNumber() + " ");
        System.out.print("]\n");
    }

}