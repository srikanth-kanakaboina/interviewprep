package leetcode;

import java.util.Arrays;

public class MaximumSubArray {

    public static void main(String[] args) {

        int[] nums={-2,1};
        System.out.println("Maximun sub array"+maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        int sum_local   = nums[0];
        int sum_global  = nums[0];

       for (int i=1;i<=nums.length-1;i++){
           if (nums[i]>(sum_local+nums[i])){
               sum_local =nums[i];
           }else{
               sum_local =sum_local+nums[i];
           }
           sum_global =sum_local>sum_global?sum_local:sum_global;
       }
       return sum_global;

    }
}
