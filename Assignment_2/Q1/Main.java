
public class Main {
    public static void main(String[] args) {

        TreeNode node = new TreeNode();
        
        TreeNode root = node.insert(25);
        root.setParent(null);

        root.setLeft(root.insert(20));
        root.getLeft().setParent(root);

        root.getLeft().setLeft(root.insert(14));
        root.getLeft().getLeft().setParent(root.getLeft());     
        
        root.getLeft().setRight(root.insert(22));
        root.getLeft().getRight().setParent(root.getLeft());
        
        root.setRight(root.insert(27));
        root.getRight().setParent(root);

        root.getRight().setLeft(root.insert(26));
        root.getRight().getLeft().setParent(root.getRight());
        
        root.getRight().setRight(root.insert(30));
        root.getRight().getRight().setParent(root.getRight());
   
        root.getRight().getRight().setLeft(root.insert(29));
        root.getRight().getRight().getLeft().setParent(root.getRight().getRight());

        root.getRight().getRight().setRight(root.insert(32));
        root.getRight().getRight().getRight().setParent(root.getRight().getRight());


        TreeNode result = root.preOrderNext(root.getRight().getRight().getLeft());
        TreeNode result2 = root.postOrderNext(root.getLeft());
        TreeNode result3 = root.inOrderNext(root.getLeft().getRight());
  
        if (result != null)  
        { 
            System.out.printf("Pre Order Next of %d is %d\n", root.getRight().getRight().getLeft().getData(), result.getData()); 
        } 
        else
        { 
            System.out.printf("Next of %d is null\n", root.getRight().getRight().getLeft().getData()); 
        }

        if (result2 != null)  
        { 
            System.out.printf("Post Order Next of %d is %d\n", root.getLeft().getData(), result2.getData()); 
        } 
        else
        { 
            System.out.printf("Next of %d is null\n", root.getLeft().getData()); 
        }

        if (result3 != null)  
        { 
            System.out.printf("In Order Next of %d is %d\n", root.getLeft().getRight().getData(), result3.getData()); 
        } 
        else
        { 
            System.out.printf("Next of %d is null\n", root.getLeft().getRight().getData()); 
        }

    }
    
}