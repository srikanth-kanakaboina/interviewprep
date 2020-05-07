package codesignal;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[] sequence={10, 1, 2, 3, 4, 5};
        System.out.println(almostIncreasingSequence(sequence));

    }

    public static boolean almostIncreasingSequence(int[] sequence) {

        int numOfExceptions=0;
        for (int i = 0; i < sequence.length-1; i++) {
            if ((sequence[i+1]-sequence[i])<=0){
                numOfExceptions++;
                if(sequence[i+2]-sequence[i]<=0){
                    numOfExceptions++;
                }

            }

        }
        System.out.println(numOfExceptions+" "+Arrays.toString(sequence));

        return  numOfExceptions<=1;
    }
}
