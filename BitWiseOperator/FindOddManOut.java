package BitWiseOperator;
import java.util.*;

public class FindOddManOut {


    public static int findOddMan(int n, int arr[]) {
        // Write your code here
        int ans = 0;
        for(int num:arr){
            ans ^= num;
        }
        return ans;
    }

//    OR SECONDRY
//    public static int findOddMan(int n, int arr[]) {
//        // Write your code here
//        Map<Integer,Integer> mp = new HashMap<>();
//        for(int i=0;i<n;i++){
//            mp.put(arr[i],mp.getOrDefault(arr[i],0) + 1);
//        }
//        for(int num:arr){
//            if(mp.get(num)%2 != 0){
//                return num;
//            }
//        }
//        return -1;
//    }

}
