public class Main{
    public static void main(String[] args) {
        
        int[] array = {1,5,21,26,39,14,15,16,17,18,19,20,111,145,146};

        HashTable hashTable = new HashTable(15);

        for(int i=0; i<array.length; i++){
            hashTable.put(array[i]);
        }

        hashTable.printHashTable();

    }
}