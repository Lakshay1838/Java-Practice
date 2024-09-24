import java.util.*;

public class QueueExample {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            nums.add(sc.nextInt());
        }

        Set<Integer> set = new HashSet<>(nums);
        System.out.println("set : " + set);

        //queue using LL
        System.out.print("enter m : ");
        int m = sc.nextInt();
        sc.nextLine();

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<m;i++){
            int num = sc.nextInt();
            queue.add(num);
        }
        System.out.println("queue : " + queue);
//        poll - removes first element :
        queue.poll();
        System.out.println("queue : " + queue);
        queue.poll();
        System.out.println("queue : " + queue);
    }
}
