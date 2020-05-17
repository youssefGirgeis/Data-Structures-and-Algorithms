public class Main{
    public static void main(String[] args) {
        
        MyPriortyQueue priortyQueue = new MyPriortyQueue();

        priortyQueue.add(2);
        priortyQueue.add(10);
        priortyQueue.add(1);
        priortyQueue.add(22);
        priortyQueue.add(3);

        System.err.println("Before Removing: ");
        priortyQueue.printNodes();

        System.out.println("One Item Removed");
        priortyQueue.deleteMin();
        priortyQueue.printNodes();

        System.out.println("One Item Removed");
        priortyQueue.deleteMin();
        priortyQueue.printNodes();

        System.out.println("One Item Removed");
        priortyQueue.deleteMin();
        priortyQueue.printNodes();

        System.out.println("The size of the queue after removing items is " + priortyQueue.size());
    }
}