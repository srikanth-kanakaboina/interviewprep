/**
 *
 */
package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author srikanth
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int majoritycount = 0;
        List<int[]> listOfIntegers = Arrays.asList(nums);


        return 0;
    }

    public static int findCandidate(int a[], int size) {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) {
            Utility.print(a, "Majority	:" + a[maj_index] + "count	:	" + count + "	");
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] majorityElement = {5, 5, 5, 2, 2, 5, 5, 5, 2, 5, 6};
        //jorityElement.findCandidate(majorityElement, majorityElement.length);

        Set<Integer> set = new HashSet();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
        System.out.println(set.add(0));

    }

}
