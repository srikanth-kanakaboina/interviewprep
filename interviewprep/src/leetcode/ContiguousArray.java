package leetcode;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static void main(String[] args) {
        //int[] nums={1,0,1,1,0,0,1};
        int[] nums={0,0,1,1,0,0,1};
        System.out.println("findMaxLength "+findMaxLength(nums));
    }

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        System.out.println("Map :"+map.toString());
        return maxlen;
    }
}
