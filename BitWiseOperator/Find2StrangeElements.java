package BitWiseOperator;

public class Find2StrangeElements {
    static void printStrangeElements(int[] arr, int n) {
        // Write your code here
        int allXor = 0;
        for(int num:arr){
            allXor^=num;
        }
        int rightMostSetBit = allXor & (-allXor);
        int a=0,b=0;
        for(int num:arr){
            if((num & rightMostSetBit) != 0){
                a^=num;
            }else{
                b^=num;
            }
        }
        //System.out.println(b + " " + a);
        if(a > b){
            System.out.println(b + " " + a);
        }else{
            System.out.println(a + " " + b);
        }
    }
}
