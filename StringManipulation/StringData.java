package StringManipulation;
import java.util.*;

public class StringData {
    public static void main(String[]args) {
        String s = "hello";
        System.out.println(s);
        s += " java";
        System.out.println(s);
//      StringBuffer

        StringBuffer sb = new StringBuffer();
//        sb += "Hello World";
        sb.append("Hello Java from String Buffer");
//        if(!sb.isEmpty()) System.out.println(" not empty");
        System.out.println("String Buffer : " + sb);


        sb.insert(10," hi World");
        System.out.println(sb);

        sb.replace(0,19,"Hello from Lakshay and ");

        sb.delete(10,28);
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);


        sb.reverse();
        System.out.println(sb);
        sb.reverse();

        System.out.println(sb.charAt(0));
        sb.setCharAt(3,'l');   //replaces not add new char
        System.out.println(sb);

        System.out.println(sb.length());

        System.out.println(sb.substring(0,5));

        String ans = sb.toString();
        System.out.println(ans);

        StringBuilder sbldr = new StringBuilder();
        sbldr.append("Hello Java from String Builder");
        System.out.println("STring Builder : " + sbldr);
    }
}
