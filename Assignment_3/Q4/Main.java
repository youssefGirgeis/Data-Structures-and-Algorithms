/*
Course: COMP 272
Assignment: 3 - Q4
Name: Youssef Girgeis
Student ID : 3396678
Date: May 30, 2020
*/

public class Main {

    public static void main(String[] args) {
        
        int[] unorderedArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5}; // unsorted array

        System.out.print("Array before sorting: ");
        //print unsorted array
        for (int i = 0; i < unorderedArray.length; i++) {
            System.out.print(unorderedArray[i] + " ");
        }
        System.out.println();

        //sort array
        MergeSort sorter = new MergeSort();
        sorter.sort(unorderedArray, 0, unorderedArray.length-1);

        // print sorted array using merge sort
        System.out.print("Merge Sort: ");
        for(int i=0; i<unorderedArray.length; i++){
           
            System.out.print(unorderedArray[i] + " ");
        }
        System.out.println();


    
        int [] unsortedArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        // print array before sorting
        System.out.print("Array before sorting: ");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i] + " ");
        }
        System.out.println();

        //sort array
        QuickSort qSorter = new QuickSort();
        qSorter.quickSort(unsortedArray, 0, unsortedArray.length-1);

        // print array after sorting using quick sort
        System.out.print("Quick Sort: ");
        for(int i=0; i<unsortedArray.length; i++){
           
            System.out.print(unsortedArray[i] + " ");
        }
        System.out.println();
    }
    
}