public class Main {
    public static void main(String[] args) {
        
        //BinaryTree bt = new BinaryTree();
        SubBinaryTree sbt = new SubBinaryTree();
        sbt.insert(25);
        sbt.insert(20);
        sbt.insert(14);
        sbt.insert(27);
        sbt.insert(30);
        sbt.insert(29);
        sbt.insert(26);
        sbt.insert(22);
        sbt.insert(32);

        sbt.inOrderNumber();
        System.out.println();
        sbt.preOrderNumber();
        System.out.println();
        sbt.postOrderNumber();
        System.out.println();
        
        System.out.println(sbt.getRoot().getInOrder());

    }
}