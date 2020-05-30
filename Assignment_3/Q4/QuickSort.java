/*
Course: COMP 272
Assignment: 3 - Q4
Name: Youssef Girgeis
Student ID : 3396678
Date: May 30, 2020
*/

public class QuickSort {

    public void quickSort(int[] unsortedArray, int start, int end){
        if (start < end){
            // index position of the correctly placed pivot in the array
            int partitionIndex = partition(unsortedArray, start, end); 
            quickSort(unsortedArray, start, partitionIndex-1); // to sort the left partition
            quickSort(unsortedArray, partitionIndex+1, end); // sort the right partition
        }
    }

    private int partition(int[] unsortedArray, int start, int end){
        
        int pivot = unsortedArray[end];
        int i = start - 1; // i starts at -1 in the first iteration
        for (int j= start; j <= end-1; j++){
            if(unsortedArray[j] < pivot){
                i++;
                int iTemp = unsortedArray[i];
                int jTemp = unsortedArray[j];
                //swap
                unsortedArray[i] = jTemp;
                unsortedArray[j] = iTemp;
            }
        }

        //place the pivot value in the correct position
        int nextToI = unsortedArray[i+1]; // pivot's position
        unsortedArray[end] = nextToI; // move the elment at the pivot position to the end
        unsortedArray[i+1] = pivot; // move pivot the correct spot.

        return i+1;
    }
    
}