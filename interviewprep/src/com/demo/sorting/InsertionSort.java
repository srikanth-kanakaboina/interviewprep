package com.demo.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int count=0;
		int[] numbers=Utility.getRandomIntegers(10);
		Utility.print(numbers,"Before InsertionSort	");
		for (int i = 0; i <numbers.length-1; i++) {
			count++;
			for(int j=i+1;j>0;j--){
				if(numbers[j]<numbers[j-1]){
					Utility.swap(numbers, j, j-1);count++;
				}else
					break;
			}
		}
		System.out.println("Count	:	"+count);
		
		
		Utility.print(numbers,"After InsertionSort	");
		
	}
	
}
