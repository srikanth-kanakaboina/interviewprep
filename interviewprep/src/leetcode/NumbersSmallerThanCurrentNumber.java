package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{7,7,7,7})));

    }

    public static  int[]  smallerNumbersThanCurrent(int[] nums) {

        Map<Integer,Integer> countMap=new HashMap<>();

        int[] temp=nums.clone();
        Arrays.sort(temp);
        int[] countArr=new int[nums.length];
        countMap.put(temp[0],0);
        for(int i=1 ;i<temp.length;i++){
            if(!countMap.containsKey(temp[i])){
                countMap.put(temp[i],i);
            }
        }

        for(int i=0 ;i<nums.length;i++){
            countArr[i]=countMap.get(nums[i]);
        }

        return countArr;

    }
}
