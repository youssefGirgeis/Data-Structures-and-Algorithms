public class Main{
    public static void main(String[] args) {
        
        int[] array = {1,5,21,26,39};

        HashTable hashTable = new HashTable(10);

        for(int i=0; i<array.length; i++){
            hashTable.put(array[i]);
        }

        hashTable.printHashTable();

    }
}