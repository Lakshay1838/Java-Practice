package BitWiseOperator;

import java.sql.SQLOutput;
import java.util.*;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long result=0;
        int count=0;

        while(count++ < 32){
            result <<= 1;
            result |= (n&1);
            n >>= 1;
        }
        System.out.println(result);
    }
}
