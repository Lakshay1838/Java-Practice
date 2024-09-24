import java.util.*;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<Integer> LL = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
//        LL.add(1);
//        LL.add(2);
//        LL.add(3);
//        LL.add(4);
//        LL.add(5);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            LL.add(sc.nextInt());
        }

        System.out.println("LL : " + LL);
    }
}
