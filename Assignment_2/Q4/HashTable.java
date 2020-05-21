public class HashTable{

    private Integer[] hashArray; //backing array for the hash table
    private int maxSize; // size of the hash table

    /**
     * 
     * @param maxSize
     */
    public HashTable(int maxSize){
        this.maxSize = maxSize;
        hashArray = new Integer[maxSize];
    }

    /**
     * 
     * @param key
     */
    public void put(int key){
        int hashedKey = hashKey(key);

        if(isOccupied(hashedKey)){
            if(hashedKey == hashArray.length - 1){
                hashedKey = 0;
            }
            else{
                hashedKey++;
            }

            while(isOccupied(hashedKey)){
                hashedKey = (hashedKey + 1) % hashArray.length;
            }
        }

        if (hashArray[hashedKey] != null){
            System.out.println("There's already an number at position " + hashedKey);
        }
        else{
            hashArray[hashedKey] = key;
        }
    }

    /**
     * 
     * @param key
     * @return
     */
    private int hashKey(int key){

        return key % 13;
    }

    private boolean isOccupied(int index){
        return hashArray[index] != null;
    }
    /**
     * print the elements in the hash table.
     */
    public void printHashTable(){
        for (int i=0; i<hashArray.length; i++){
            System.out.println(hashArray[i]);
        }
    }
}