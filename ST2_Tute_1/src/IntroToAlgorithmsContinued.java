//Christian Westenfelder
//20/02/2018 | University of Canberra
//Initial Introduction to Algorithms

import java.util.*;

// Uses the console to get the size of the array and then asks the end user for the array items, (Integers). 
//It is designed to find "the odd" integer out of the array. an Int that is not repeated. 

public class IntroToAlgorithmsContinued {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int x = lonelyInteger(array);
        System.out.println(x);
    }
	
    static int lonelyInteger(int[] a){
        int len = a.length;
        if (len < 1 || len > 100 || len % 2 == 0){
            return -1;
        } 
        for(int i = 0; i < len; i++){
            if (a[i] < 0 || a[i] > 100){
                return -1;
            }
        }
        
        for (int i = 0; i < len; i++){
            boolean lonely = true;
            for (int j = 0; j < len; j++) {
                if ((i != j) && (a[i] == a[j])) {
                    lonely = false;
                    break;
                }
            }
            if (lonely){
                return a[i];
            } 
        }
        return -1;
    }
}
