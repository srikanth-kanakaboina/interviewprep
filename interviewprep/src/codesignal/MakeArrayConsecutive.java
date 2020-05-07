package codesignal;

import java.util.Arrays;

public class MakeArrayConsecutive {
    public static void main(String[] args) {
        int[] statues={6, 2, 3, 8};


       System.out.println("Count : "+makeArrayConsecutive2(statues));

    }

    public static int makeArrayConsecutive2(int[] statues) {
        int count=0;
        Arrays.sort(statues);
        for (int i = 0; i <statues.length-1 ; i++) {
            if (statues[i]>statues[i+1]){
                count+= getCountOfStatues(statues[i],statues[i+1]);
            }else{
                count+= getCountOfStatues(statues[i+1],statues[i]);
            }

        }
        return count;

    }

    private static int getCountOfStatues(int max, int min) {
        return max-min==1?0:(max-min-1);
    }
}
