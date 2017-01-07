package com.demo.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] numbers=Utility.getRandomIntegers(10);
		Utility.print(numbers,"Before Selection Sort");
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i]>numbers[j]){
					Utility.swap(numbers,i,j);
				}
				//Utility.print(numbers,"Process["+i+"]["+j+"]");
			}
		}
		
		Utility.print(numbers,"After Selection Sort");
	}

	
}
