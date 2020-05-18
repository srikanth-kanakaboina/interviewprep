package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ArrayWithStackOperations {
    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{2,3,4},5));
    }

    public static List<String> buildArray(int[] a, int n) {
        List<String> stack=new ArrayList<>();
        int j=1;

        for(int i=0;i<=n &&i<a.length;i++){
            if(a[i]==j){
                stack.add("Push");
                j++;
            }else{
                while(a[i]!=j){
                    stack.add("Push");
                    stack.add("Pop");
                    j++;
                }
                stack.add("Push");
                j++;
            }
        }
        return stack;
    }
}
