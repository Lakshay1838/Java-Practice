package Collections;
import java.util.*;

public class DuplicateQueueElements {
    static void doubleQueue(Queue<Integer> q)
    {
        int n = q.size();
        while(n!=0){
            int ele = q.peek();
            q.poll();
            q.add(ele);
            q.add(ele);
            n--;
        }
    }
}
