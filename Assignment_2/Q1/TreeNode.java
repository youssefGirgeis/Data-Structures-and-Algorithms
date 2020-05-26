public class TreeNode {
    
    private int data;
    private TreeNode parent;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode insert(int value){
        TreeNode node = new TreeNode();
        node.leftChild = null;
        node.rightChild = null;
        node.parent = null;
        node.data = value;
        return node;
    }

    public TreeNode preOrderNext(TreeNode node){

        // If left child exists, then it is preorder 
        // successor. 
        if (node.leftChild != null) 
            return node.leftChild; 

        // If left child does not exist, then 
        // travel up (using parent pointers) 
        // until we reach a node which is left 
        // child of its parent. 
        TreeNode curr = node, parent = curr.parent; 
        while (parent != null && parent.rightChild == curr)  
        { 
            curr = curr.parent; 
            parent = parent.parent; 
        } 

        // If we reached root, then the given 
        // node has no preorder successor 
        if (parent == null) 
            return null; 

        return parent.rightChild; 
    }

    public void setParent(TreeNode parent){
        this.parent = parent;
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