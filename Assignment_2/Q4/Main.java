public class Main{
    public static void main(String[] args) {
        
        //create new array
        int[] array = {1,5,21,26,39,14,15,16,17,18,19,20,111,145,146};

        // create an empty hash table
        HashTable hashTable = new HashTable(13);

        // elements in the array into the hashtable
        for(int i=0; i<array.length; i++){
            hashTable.put(array[i]);
        }

    }
}