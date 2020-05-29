public class Main {

    public static void main(String[] args) {
        
        int[] unorderedArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        MergeSort sorter = new MergeSort();
        sorter.sort(unorderedArray);

        for(int i=0; i<unorderedArray.length; i++){
           
            System.out.print(unorderedArray[i] + ", ");
        }
        System.out.println();

    }
    
}