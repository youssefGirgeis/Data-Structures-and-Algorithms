/*
Course: COMP 272
Assignment: 3 - Q3
Name: Youssef Girgeis
Student ID : 3396678
Date: May 30, 2020
*/


public class App {
    public static void main(String[] args) {
        
        int[] s1 = {3,3,3,3,0,1,1,1,2,2,2,2}; // first set
        int[] s2 = {2,2,2,1,0,0,0,0,3}; // second set

        MergeSort.sort(s1); // sorting s1 using merge sort
        MergeSort.sort(s2); // sorting s2 using merge sort

        if(isSame(s1, s2)) // return if two sets are equal 
            System.out.println("S1 and S2 have the same set of elements");
        else
            System.out.println("S1 and S2 don't have the same set of elements");


    }
    /**
     *  checks if two sets have the same elements
     * @param s1 sorted set
     * @param s2 sorted set
     * @return true if two sets are has same elements
     */
    public static boolean isSame(int[] s1, int[] s2){

        int i = 0; // pointer for elements in s1
        int j = 0; // pointer for elments in s2
        int previous=-1; // refers to the element behind current element in s1

        // loop as long as i and j are less length of s1 and s2
        while(i<s1.length && j<s2.length){
            
            // if the first in the sorted s1 and sorted s2 not equal
            // then the two sets don't match
            if(s1[i] != s2[j] && i == 0 && j == 0){return false;}

            if(s1[i] == s2[j]){
                previous = s1[i];
                i++;
                j++;
            }
            else if (previous == s1[i]){ i++; }
            else if (previous == s2[j]) { j++; }
            else { return false; }
        }

        // if we didn't loop through all elements in s1
        while (i<s1.length){
            if (previous == s1[i]){ i++; }
            else { return false; }
        }

        // if we didn't loop through all elements in s2
        while (j<s2.length){
            if (previous == s2[j]){ j++;}
            else { return false; }
        }

        return true;
    }
}