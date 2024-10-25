package Basics;
import java.io.CharArrayReader;
import java.util.*;

public class CountVowels {
    public static void main(String[] args){
        String vowels = "aeiouAEIOU";
        Scanner sc= new Scanner(System.in);

        String input = sc.nextLine();
        int count=0;

        for(char ch:input.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                count++;
            }
        }
        System.out.println(count);
    }
}
