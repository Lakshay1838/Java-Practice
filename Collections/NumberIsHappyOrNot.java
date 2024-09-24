package Collections;
import java.util.*;

// Other imports go here
// Do NOT change the class name and method signature
import java.util.*;

class NumberIsHappyOrNot {
    static int digitSum(int n) {
        //List<Integer> list = new ArrayList<>();
        int sum = 0;
        while (n != 0) {
            //list.add(n%10);
            int digit = n % 10;
            sum += (digit * digit);
            n /= 10;
        }
        return sum;
    }
    static boolean isHappy(int n) {
        if (n == 1) return true;
        while (n >= 10) {
            if (digitSum(n) == 1) {
                return true;
            } else {
                n = digitSum(n);
            }
        }
        return false;
    }
}