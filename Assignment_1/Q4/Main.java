public class Main{
    public static void main(String[] args) {

        RandomQueue rq = new RandomQueue(5);
        
        rq.add(1);
        rq.add(2);
        rq.add(3);
        rq.add(4);
        rq.add(5);

        rq.printItems();

        while(! rq.isEmpty()){
            System.out.println(rq.remove() + " is removed");
            rq.printItems();
        }
    }
}