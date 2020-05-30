public class MergeSort {

    public static void sort(int unorderedArray[]){
        sort(unorderedArray, 0, unorderedArray.length-1);
    }

    private static void sort(int unorderedArray[], int start, int end){
        if(end <= start){return; }

        int middle = (start+end)/2;
        sort(unorderedArray, start, middle); // sort left half
        sort(unorderedArray, middle+1, end); // sort right half
        merge(unorderedArray, start, middle, end);
        
    }

    private static void merge(int unorderedArray[], int start, int mid, int end){
        int[] tempArray = new int[end - start+1]; // end + 1
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