public class TreeNode {
    
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int value){
        this.data = value;
    }

    public void setLeft(TreeNode left){
        this.leftChild = left;
    }
    public TreeNode getLeft(){
        return this.leftChild;
    }

    public void setRight(TreeNode right){
        this.rightChild = right;
    }
    
    public TreeNode getRight(){
        return this.rightChild;
    }

    public int getData(){
        return this.data;
    }
}