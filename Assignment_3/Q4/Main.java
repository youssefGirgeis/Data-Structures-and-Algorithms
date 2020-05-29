public class Main {

    public static void main(String[] args) {
        
        int[] unorderedArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        System.out.print("Array before sorting: ");
        for (int i = 0; i < unorderedArray.length; i++) {
            System.out.print(unorderedArray[i] + " ");
        }
        System.out.println();

        MergeSort sorter = new MergeSort();
        sorter.sort(unorderedArray, 0, unorderedArray.length-1);

        System.out.print("Merge Sort: ");
        for(int i=0; i<unorderedArray.length; i++){
           
            System.out.print(unorderedArray[i] + " ");
        }
        System.out.println();




    
        int [] unsortedArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        System.out.print("Array before sorting: ");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i] + " ");
        }
        System.out.println();

        QuickSort qSorter = new QuickSort();
        qSorter.quickSort(unsortedArray, 0, unsortedArray.length-1);

        System.out.print("Quick Sort: ");
        for(int i=0; i<unsortedArray.length; i++){
           
            System.out.print(unsortedArray[i] + " ");
        }
        System.out.println();
    }
    
}