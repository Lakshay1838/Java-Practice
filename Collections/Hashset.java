import java.util.*;

public class Hashset {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            names.add(s);
        }
        System.out.print("Array List : ");
        for(String name:names){
            System.out.print(name + " ");
        }
        sc.nextLine();
        Set<String> namesSet = new HashSet<>(names);
        System.out.println("Set : " + namesSet);
    }
}
