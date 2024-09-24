package Collections;
import java.util.*;

public class MirrorOfQueue {
    static void mirrorQueue(Queue<String> q)
    {
        List<String> list = new ArrayList<>();
        while(!q.isEmpty()){
            list.add(q.peek());
            q.remove();
        }

        int n = list.size();

        for(int i=0;i<n;i++){
            q.add(list.get(i));
        }
        for(int i=n-1;i>=0;i--){
            q.add(list.get(i));
        }
    }
}
