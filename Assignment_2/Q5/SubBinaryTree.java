public class SubBinaryTree extends BinaryTree {
    
    private int preOrder;
    private int postOrder;
    private int inOrder;


    public void inOrderNumber(){
        if (root != null){
            root.inOrderNumber();
        }
    }

    public void preOrderNumber(){
        if (root != null){
            System.out.print(root.getData() + " ");
            root.preOrderNumber();
        }
    }

    public void postOrderNumber(){
        if (root != null){
            root.postOrderNumber();
        }
    }

    public TreeNode getRoot(){
        return this.root;
    }

}