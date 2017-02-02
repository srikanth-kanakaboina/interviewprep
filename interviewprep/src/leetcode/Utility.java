package leetcode;

import java.util.Arrays;
import java.util.Random;

public class Utility {
	public static int[] getRandomIntegers(int count) {
		int[] randomIntegers = new int[count];
		for (int i = 0; i < randomIntegers.length; i++) {
			randomIntegers[i] = new Random().nextInt(100);
		}
		return randomIntegers;
	}

	public static void swap(int[] numbers, int i, int j) {
		int temp = 0;
		temp=numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
	
	public static void print(int[] numbers,String message){
		System.out.print(message+	"	:[ ");
		for (int i : numbers) { 
			System.out.print("|	"+i+" 	|");
		}
		System.out.print(" ]\n");
		
	}
}
