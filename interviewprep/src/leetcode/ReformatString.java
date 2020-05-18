package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReformatString {
    public static void main(String[] args) {
        reformat("a0b1c2");
    }
    public static String reformat(String str) {
        List<Character> chars=new ArrayList<>();
        List<Character> digits=new ArrayList<>();
        StringBuffer s=new StringBuffer();
        for(int i=0; i < str.length(); i++) {
            Boolean flag = Character.isDigit(str.charAt(i));
            if(flag) {
                digits.add(str.charAt(i));
            }
            else {
                chars.add(str.charAt(i));

            }
        }
        if (Math.abs(chars.size()-digits.size())>1){
            return "";
        }
        boolean digitOrChar = (digits.size()>=chars.size()) ? true : false;
        for(int i=0;i<str.length();i++){
            if(digitOrChar){
               digits.remove(0);
            }else{
               chars.remove(0);
            }
            digitOrChar=!digitOrChar;
        }

        return s.toString();
    }
}
