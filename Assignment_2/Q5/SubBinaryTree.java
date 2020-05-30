public class SubBinaryTree extends BinaryTree {
    
    private int preOrder;
    private int postOrder;
    private int inOrder;


    public void traverseInOrder(){
        if (root != null){
            root.traverseInOrder();
        }
    }

    public void traversePreOrder(){
        if (root != null){
            System.out.print(root.getData() + " ");
            root.traversePreOrder();
        }
    }

    public void traversePostOrder(){
        if (root != null){
            root.traversePostOrder();
        }
    }

    public TreeNode getRoot(){
        return this.root;
    }

}