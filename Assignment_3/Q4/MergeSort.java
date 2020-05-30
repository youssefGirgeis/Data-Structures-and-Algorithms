/*
Course: COMP 272
Assignment: 3 - Q4
Name: Youssef Girgeis
Student ID : 3396678
Date: May 30, 2020
*/

public class MergeSort {


    /**
     * this method main function is to split the array
     * into small arrays so it is easy for sorting 
     * @param unorderedArray An array that's unsorted
     * @param start  index of the beginging of array
     * @param end index of the end of array
     */
    public void sort(int unorderedArray[], int start, int end){
        if(end <= start){return; }

        int middle = (start+end)/2; // divide the array into two halfs
        sort(unorderedArray, start, middle); // sort left half
        sort(unorderedArray, middle+1, end); // sort right half
        merge(unorderedArray, start, middle, end); // sorting happens here
        
    }

    /**
     * resonsible for sorting after splitting
     * @param unorderedArray unsorted sequence of numbers
     * @param start index of the beginging of array
     * @param mid inde of the middle of array
     * @param end index of the end of array
     */
    private void merge(int unorderedArray[], int start, int mid, int end){
        int[] tempArray = new int[end - start+1]; //sorted numbers will be added here
        int leftSlot = start;
        int rightSlot = mid+1;
        int k = 0;

        while(leftSlot <= mid && rightSlot <= end){
            if(unorderedArray[leftSlot] < unorderedArray[rightSlot]){
                tempArray[k] = unorderedArray[leftSlot];
                leftSlot++;
            }
            else{
                tempArray[k] = unorderedArray[rightSlot];
                rightSlot++;
            }
            k++;
        }

        if (leftSlot <= mid){ // left must be sorted already
            while(leftSlot <= mid){
                tempArray[k] = unorderedArray[leftSlot];
                leftSlot++;
                k++;
            }
        }
        else if(rightSlot <= end){
            while(rightSlot <= end){
                tempArray[k] = unorderedArray[rightSlot];
                rightSlot++;
                k++;
            }
        }

        //copy temp array into input array
        for(int i=0; i<tempArray.length; i++){
            unorderedArray[start+i]=tempArray[i];
        }
    }
    
}