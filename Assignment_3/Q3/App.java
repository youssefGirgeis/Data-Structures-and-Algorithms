import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        
        int[] s1 = {3,3,3,3,0,1,1,1,2,2,2,2};
        int[] s2 = {2,2,2,1,0,0,0,0,3};

        MergeSort.sort(s1); // sorting s1 using merge sort
        MergeSort.sort(s2); // sorting s2 using merge sort

        if(isSame(s1, s2))
            System.out.println("S1 and S2 have the same set of elements");
        else
            System.out.println("S1 and S2 don't have the same set of elements");


    }

    public static boolean isSame(int[] s1, int[] s2){

        int i = 0;
        int j = 0;
        int previous=-1;

        while(i<s1.length && j<s2.length){
            
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

        while (i<s1.length){
            if (previous == s1[i]){ i++; }
            else { return false; }
        }

        while (j<s2.length){
            if (previous == s2[j]){ j++;}
            else { return false; }
        }

        return true;
    }
}