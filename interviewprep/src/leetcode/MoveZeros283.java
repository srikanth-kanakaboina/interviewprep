package leetcode;

public class MoveZeros283 {
    public static void moveZeroes(int[] nums) {
        Utility.print(nums, "Before Zero move");
        if (nums.length == 0 || nums == null) {
            return;
        }

        int index = 0;
        for (int j : nums) {
            if (j != 0) nums[index++] = j;
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }

        Utility.print(nums, "After Zero move");

    }

    public static void main(String[] args) {
        int[] array = {1, 0, 3, 0, 5, 6};
        MoveZeros283.moveZeroes(array);

    }
}
