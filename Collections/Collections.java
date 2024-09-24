import java.util.*;

public class Collections {
    public static void main(String[] args){
//        array list
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        System.out.print("enter n : ");

        int n = sc.nextInt();
        sc.nextLine();
        // System.out.println("enter array list : ");
        for(int i=0;i<n;i++){
//            System.out.print("enter name " + i + " : ");
            String s = sc.nextLine();
            names.add(s);
        }

//        names.add("Lakshay0");
//        names.add("Lakshay1");
//        names.add("Lakshay2");

//        for(String name:names){
//            System.out.print(name + " ");
//        }
        System.out.println(names);
        names.remove("devilal singh"); //removes value from list
        System.out.println(names);

    }

}
