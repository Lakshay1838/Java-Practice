package Basics;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x > 1){
            for(int i=2;i*i<x;i++){
                if(x%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Yes It is Prime");
        }else{
            System.out.println("No it is not Prime");
        }
    }

}
