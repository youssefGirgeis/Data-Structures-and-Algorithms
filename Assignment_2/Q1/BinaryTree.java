public class BinaryTree{
    
    private Node root;

    public void insert(int value){
        if (root == null){
            root = new Node(value);
        }
        else{
            root.insert(value);
        }
    }
}