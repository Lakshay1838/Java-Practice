package Collections;
import java.util.*;

public class BalancedParenthesis {
    class Result{
        static int balancedString(String s){
            // Write your code here
            Stack<Character> stack = new Stack<>();
            int n = s.length();
            int i=0;

            while(i<n){
                char ch = s.charAt(i);

                if(ch == '(' || ch == '{'){
                    stack.push(ch);
                }else if(ch == ')' || ch == '}'){
                    if(stack.isEmpty()){
                        return i;
                    }else{
                        char top = stack.peek();
                        if(ch == ')' && top == '('){
                            stack.pop();
                        }else if(ch == '}' && top == '{'){
                            stack.pop();
                        }else{
                            return i;
                        }
                    }
                }
                i++;
            }
            return stack.isEmpty() ? -1 : n;
        }
    }
}
