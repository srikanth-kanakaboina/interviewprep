package com.demo.sorting;

public class ShellSort {
	public static void main(String[] args) {
		int[] numbers=Utility.getRandomIntegers(10);
		Utility.print(numbers,"Before InsertionSort	");
		int increment=3;
		for(int i=0;i<numbers.length;i=i+increment) {
			for(int j=i+increment;j-increment>0;j=j-increment) {
				if(numbers[j]<numbers[j-increment]) {
					Utility.swap(numbers, j, j-increment);
				}
			}
		}
		
		
		Utility.print(numbers,"After first increment InsertionSort	");
		
	}
	

}
