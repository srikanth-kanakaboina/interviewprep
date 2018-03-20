package leetcode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String str[]){





        int numbers[]={2,4,7,12,34};
        int target=9;

        int[] twoSum=getTwoSum(numbers,target);



    }

    private static int[] getTwoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> tracker=new HashMap<>();
        for (int i=0;i<numbers.length;i++){
            if (!tracker.isEmpty() && tracker.containsKey(target-numbers[i])){
                int k[]= {tracker.get(target-numbers[i]),i};
                return k;
            }

            tracker.put(numbers[i],i);
        }

        int k[]={-1,-1};
        return k;
    }
}
