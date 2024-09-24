import java.util.*;

public class IteratorExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        System.out.print("enter n : ");

        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("enter name " + i + " : ");
            String s = sc.nextLine();
            names.add(s);
        }
        System.out.println(names);

        Iterator<String> i = names.iterator(); //iterate krne ke kam ata hai
        while (i.hasNext()){
            System.out.print(i.next() + " ");
        }

    }
}
