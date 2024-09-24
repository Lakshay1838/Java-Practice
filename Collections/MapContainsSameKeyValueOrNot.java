package Collections;
import java.util.*;

public class MapContainsSameKeyValueOrNot {
    public static boolean hasDuplicateMappings(Map<String, String> map)
    {
        Set<String> set = new HashSet<>();
        for(String value:map.values()){
            if(!set.add(value))	return true;
        }
        return false;
    }

}
