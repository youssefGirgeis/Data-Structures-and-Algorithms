

public class Node{

    private int data;
    private Node leftNode;
    private Node rightNode;

    public Node(int data){
        this.data = data;
    }

    public void insert(int value){

        if(value < data){
            if(leftNode == null){
                leftNode = new Node(value);
            }
            else{
                leftNode.insert(value);
            }

            if(value > data){
                if(rightNode == null){
                    rightNode = new Node(value);
                }
                else{
                    rightNode.insert(value);
                }
            }
        }
    }


}