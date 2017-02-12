package com.demo.sorting;

import java.util.Random;
import java.util.stream.IntStream;

public class Utility {
	public static int[] getRandomIntegers(int count) {
		int[] randomIntegers = new int[count];
		
		IntStream.range(0, randomIntegers.length)
         .forEach(i -> randomIntegers[i] = new Random().nextInt(100));
		
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
		IntStream.range(0, numbers.length)
				.forEach(i->System.out.print("|	"+i+" 	|"));
		System.out.print(" ]\n");
		
	}
}
