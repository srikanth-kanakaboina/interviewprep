package com.demo.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int count=0;
		int[] numbers=Utility.getRandomIntegers(10);
		Utility.print(numbers,"Before BubbleSort");
		Boolean swapped=false;
		for (int number : numbers) {
			swapped=false;
			for (int j = numbers.length-1; j > 0; j--) {
				if(numbers[j]<numbers[j-1]){
					Utility.swap(numbers, j-1, j);
					swapped=true;
				}
			}
			if(!swapped)
				break;
		}
		Utility.print(numbers,"After BubbleSort");
	}

}





