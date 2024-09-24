package Collections;
import java.util.*;

public class FindOddElementsOfQueue {
    static void flipHalfQueue(Queue<Integer> q)
    {
        Stack<Integer> stack = new Stack<>();
        int n = q.size();

        for(int i=0;i<n;i++){
            if(i%2!=0){
                stack.push(q.poll());
            }else{
                q.add(q.poll());
            }
        }
        for(int i=0;i<n;i++){
            if(i%2!=0){
                q.add(stack.pop());
            }else{
                q.add(q.poll());
            }
        }
    }

}
