package Collections;
import java.util.*;

public class RemoveDuplicatesFromVector {
    static void removeDuplicates(Vector<Integer> v)
    {
        Set<Integer> set = new LinkedHashSet<>();
        for(int num:v){
            set.add(num);
        }

        v.clear();

        //int i=0;
        for(int num:set){
            v.add(num);
        }
    }
}
