/*
Course: COMP 272
Assignment: 2 - Q1
Name: Youssef Girgeis
Student ID : 3396678
Date: May 31, 2020

Problem:
Design an algorithm for the following operations for a binary tree BT, and show the
worst-case running times for each implementation:
preorderNext(x): return the node visited after node x in a pre-order traversal of BT.
postorderNext(x): return the node visited after node x in a post-order traversal of BT.
inorderNext(x): return the node visited after node x in an in-order traversal of BT
*/


public class Main {
    public static void main(String[] args) {

        // create a tree
        TreeNode node = new TreeNode();
        
        //create the root
        TreeNode root = node.insert(25);
        root.setParent(null);

        //create children
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

        // get the next node in the preorder sequence
        TreeNode result = root.preOrderNext(root.getRight().getRight().getLeft()); 

        //get the next node in the post order sequence
        TreeNode result2 = root.postOrderNext(root.getLeft());

        // get the next node in the inorder sequence
        TreeNode result3 = root.inOrderNext(root.getLeft().getRight());
        
        // print the next nodes for all preorder, post order, and inorder
        if (result != null)  
        { 
            System.out.printf("The node after %d in a pre-order traversal is %d\n", 
            root.getRight().getRight().getLeft().getData(), result.getData()); 
        } 
        else
        { 
            System.out.printf("Next of %d in a pre-order traversal is null\n", 
            root.getRight().getRight().getLeft().getData()); 
        }

        if (result2 != null)  
        { 
            System.out.printf("The node after %d in a post-order traversal is %d\n", 
            root.getLeft().getData(), result2.getData()); 
        } 
        else
        { 
            System.out.printf("Next of %d in post-order traversal is null\n", 
            root.getLeft().getData()); 
        }

        if (result3 != null)  
        { 
            System.out.printf("The node after %d in an in-order traversal is %d\n", 
            root.getLeft().getRight().getData(), result3.getData()); 
        } 
        else
        { 
            System.out.printf("Next of %d in an in-order traversal  is null\n", 
            root.getLeft().getRight().getData()); 
        }

    }
    
}