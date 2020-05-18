package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class UpperCaseToLowerCase {
    public static void main(String[] args) {
        String str="ABCDE";
        char[] a = str.toCharArray();

        for (int i=0;i<str.length();i++){
            if ('A' <= a[i] && a[i] <= 'Z'){
                System.out.print(" "+(int)(a[i])+ " "+a[i]);
                a[i] = (char) ((int)(a[i])+32);

            }

        }
        System.out.println();

        for (int i=0;i<str.length();i++){

                System.out.print(" "+(int)a[i]+ " "+a[i]);


        }


    }
}
