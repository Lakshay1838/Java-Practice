import java.util.*;

public class HashMapExample {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        sc.nextLine();

        while(n != 0){
            names.add(sc.nextLine());
            n--;
        }
        System.out.println(names);


        Map<String,Integer> mp = new HashMap<>();
        for(String s:names){
            if(mp.containsKey(s)){
                mp.put(s,mp.get(s) + 1);
            }else {
                mp.put(s,1);
            }
        }
        System.out.println(mp);
    }
}
