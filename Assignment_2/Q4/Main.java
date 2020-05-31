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