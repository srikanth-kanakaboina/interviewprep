package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,2,1};
        System.out.println("Sum of Numbers : "+singleNumber(nums));
    }

    private static Integer singleNumber(int[] nums) {
        HashMap<Integer,Integer> numMap=new HashMap<>();
     Arrays.stream(nums).forEach(number->{
         if (numMap.containsKey(number)){
             numMap.put(number,numMap.get(number)+1);
         }else{
             numMap.put(number,1);
         }
     });
        for (int i : nums) {
            if (numMap.get(i) == 1) {
                return i;
            }
        }
     return 0;
    }
}
