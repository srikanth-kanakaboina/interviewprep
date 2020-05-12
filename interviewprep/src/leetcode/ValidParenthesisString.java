package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class ValidParenthesisString {
    public static void main(String[] args) {


                System.out.println("Is Valid" + checkValidString("((*))"));
    }

    public static boolean checkValidString(String s) {

        Stack<Integer> open=new Stack<>();
        Stack<Integer> star=new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='('){
                open.push((i));
            }else if(s.charAt(i)==')'){
                if (!open.isEmpty()){
                    open.pop();
                }else if (!star.isEmpty()){
                    star.pop();
                }else{
                    return  false;
                }
            }else{
                star.push(i);
            }
        }

        while (!open.isEmpty()){
            if(star.isEmpty()){
                return false;
            }else if(open.peek()<star.peek()){
                star.pop();
            }else{
                return false;
            }
        }
        return false;
    }
}
