public class HashTable{

    private int[] hashArray;
    private int maxSize;

    public HashTable(int maxSize){
        this.maxSize = maxSize;
        hashArray = new int[maxSize];
    }

    public void put(int key){
        int hashKey = hashKey(key);
        hashArray[hashKey] = key;
    }

    private int hashKey(int key){

        return key % 13;
    }

    public void printHashTable(){
        for (int i=0; i<hashArray.length; i++){
            System.out.println(hashArray[i]);
        }
    }
}