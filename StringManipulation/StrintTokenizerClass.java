package StringManipulation;

import java.sql.SQLOutput;
import java.util.*;

public class StrintTokenizerClass {
    public static void main(String[] args){
        String s = "This is a String";
        StringTokenizer st = new StringTokenizer(s);
//  By Default " ";

//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }


        String fruits = "apple,banana,mango,kiwi,papaya,tomato";
        StringTokenizer str = new StringTokenizer(fruits,",");
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
    }
}
