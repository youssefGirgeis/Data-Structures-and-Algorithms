

public class BinaryTree {
    private TreeNode root;
    private  int minValue = 0;
    private  int max_value = 100;

    public void setRoot(TreeNode root){
        this.root = root;
    }

    public TreeNode getRoot() {
        return this.root;
    }

    public boolean isBinarySearchTree(){
        return isBST(root, minValue, max_value);
    }

    private boolean isBST(TreeNode node, int min, int max){
        
        if (node == null){ return true; }
        if(node.getData() < min || node.getData() > max){ return false; }
        return (isBST(node.getLeft(), min, node.getData()-1) && isBST(node.getRight(), node.getData()+1, max));
    }


}