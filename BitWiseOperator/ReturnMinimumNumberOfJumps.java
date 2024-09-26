package BitWiseOperator;
import java.util.*;

//Example: N = 25
//Now, to reach the level 25 as quickly as possible, you can first make a jump of 1 unit, then of 8 units and finally
// a jump of 16 units. Therefore, a minimum of 3 jumps are required. Note that, jumps need not to be in increasing sequence
// only i.e. if you want, you can jump 8 units first, then 1 unit and finally 16 units.

public class ReturnMinimumNumberOfJumps {
    // Return the minimum number of jumps
    static int getMinJumps(long n) {
        // Write your code here
        List<Long> list = new ArrayList<>();
        long val = 1;
        while(true){
            if(val > n){
                break;
            }
            list.add(val);
            val*=2;
        }

        int count=0;
        int index = list.size()-1;

        while(n != 0){
            long ele = list.get(index--);
            if(ele <= n){
                n-=ele;
                count++;
            }
        }
        return count;
    }
}
