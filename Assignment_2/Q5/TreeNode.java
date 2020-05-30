import java.util.ArrayList;

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
                inOrderList.add(value);
            }
        }
    }

    public void traverseInOrder(){

        if(leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.print(data + " ");

        if (rightChild != null){
            rightChild.traverseInOrder();
        }
    }


    public void traversePreOrder() {
        if(leftChild != null){
            System.out.print(leftChild.data + " ");
            //this.preOrder = data;
            leftChild.traversePreOrder();
        }
        if (rightChild != null){
            System.out.print(rightChild.data + " ");
            //this.preOrder = data;
            rightChild.traversePreOrder();
        }
    }

    public void traversePostOrder(){

        if (leftChild != null){
            leftChild.traversePostOrder();
        }

        if(rightChild != null){
            rightChild.traversePostOrder();
        }
        //this.postOrder = data;
        System.out.print(data + " ");

    }

    public void inOrderNumber(){
        //System.out.println(inOrderList.get(1));
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