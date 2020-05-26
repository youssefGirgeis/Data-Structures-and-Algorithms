public class Main {
    public static void main(String[] args) {
        
        BinaryTree bt = new BinaryTree();
        bt.setRoot(new TreeNode(25));
        bt.getRoot().setLeft(new TreeNode(20));
        bt.getRoot().setRight(new TreeNode(27));
        bt.getRoot().getLeft().setLeft(new TreeNode(14));
        bt.getRoot().getLeft().setRight(new TreeNode(22));
        bt.getRoot().getRight().setLeft(new TreeNode(26));
        bt.getRoot().getRight().setRight(new TreeNode(30));

        if(bt.isBinarySearchTree()){
            System.out.println("This tree is a binary search tree");
        } else{
            System.out.println("This tree is not a binary search tree");
        }
        
    }
}