package Arrays;

import java.util.*;


public class FindMaxElement {
    class Result {
        static int maxElement(int[] arr, int N) {
            // Write Your Code here
            int maxi = Integer.MIN_VALUE;
            for(int i=0;i<N;i++){
                if(maxi < arr[i]){
                    maxi = arr[i];
                }
            }
            return maxi;
        }
    }
}
