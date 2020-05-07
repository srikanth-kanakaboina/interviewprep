package leetcode.listnode;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println("Backspace Campare"+backspaceCompare("ab#c","ad#c"));

    }
    public static boolean backspaceCompare(String S, String T) {
       return build(S).equals(build(T));
    }

    private static String build(String S) {
        Stack<Character> stack=new Stack();
        for (char ch :S.toCharArray()){
            if (ch!='#'){
                stack.push(ch);
            }else if(!stack.empty()){
                stack.pop();
            }
        }
        return stack.toString();
    }
}
