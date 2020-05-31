/*
Course: COMP 272
Assignment: 2 - Q4
Name: Youssef Girgeis
Student ID : 3396678
Date: May 31, 2020

Problem:
Implement a commonly used hash table in a program that handles collision using linear
probing. Using (K mod 13) as the hash function, store the following elements in the table: {1, 5, 21,
26, 39, 14, 15, 16, 17, 18, 19, 20, 111, 145, 146}.
*/

public class HashTable{

    private Integer[] hashArray; //backing array for the hash table
    private int maxSize; // size of the hash table

    /**
     * This constructor initialize the hash array
     * @param maxSize
     */
    public HashTable(int maxSize){
        this.maxSize = maxSize;
        hashArray = new Integer[maxSize];
    }

    /**
     * add/put new item in the hash table
     * @param key the key and the item to add in the hash table
     */
    public void put(int key){
        int hashedKey = hashKey(key); // get the index

        // if the hash table occupied at certain position
        if(isOccupied(hashedKey)){ 
            int stopIndex = hashedKey; // index where the loop has if the array is full
            // if we reached the end of array, then start at 0 index
            if(hashedKey == hashArray.length - 1){
                hashedKey = 0;
            }
            else{
                hashedKey++;
            }
            // keep looping as long as array is occupied and array is not full
            while(isOccupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % hashArray.length;
            }
        }
        // this condition prints when the array is full
        if (hashArray[hashedKey] != null){
            System.out.println("Hash table is full! You can't add " + key);
        }
        //add the an item at a the hashedKey index
        else{
            hashArray[hashedKey] = key;
            System.out.println(key + " has been added to the hash table at position " + hashedKey);
        }
    }

    /**
     * return the index of the new element
     * @param key the value that will be converted to index
     * @return index of the new element
     */
    private int hashKey(int key){

        return key % 13;
    }

    /**
     * check whether a position is occupied or not
     * @param index 
     * @return true if the a position isn't empty
     */
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