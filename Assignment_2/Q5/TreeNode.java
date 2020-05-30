public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private int preOrder;
    private int postOrder;
    private int inOrder;


    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    public void inOrderNumber(){

        if(leftChild != null){
            leftChild.inOrderNumber();
        }
        System.out.print(data + " ");
        this.inOrder = data;

        if (rightChild != null){
            rightChild.inOrderNumber();
        }
    }

    public void preOrderNumber() {
        if(leftChild != null){
            System.out.print(leftChild.data + " ");
            this.preOrder = data;
            leftChild.preOrderNumber();
        }
        if (rightChild != null){
            System.out.print(rightChild.data + " ");
            this.preOrder = data;
            rightChild.preOrderNumber();
        }
    }

    public void postOrderNumber(){

        if (leftChild != null){
            leftChild.postOrderNumber();
        }

        if(rightChild != null){
            rightChild.postOrderNumber();
        }
        this.postOrder = data;
        System.out.print(data + " ");

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getInOrder(){
        return this.inOrder;
    }

    public int getPreOrder(){
        return this.preOrder;
    }

    public int getPostOrder(){
        return this.postOrder;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
    
}