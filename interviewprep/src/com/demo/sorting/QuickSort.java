package com.demo.sorting;

public class QuickSort {
	int[] numbers;
	int size;
	public QuickSort(int[] numbers) {
		super();
		this.numbers = numbers;
		this.size = numbers.length-1;
	}
	
	
	public void sort() {
		Utility.print(numbers, "Before Sorting");
		quicksort(0,size);
		Utility.print(numbers, "After Sorting");
	}


	private void quicksort(int low, int high) {
		if(low<high) {
			int pivote=partition(low, high);
			quicksort(low, pivote-1);
			quicksort(pivote+1, high);	
		
		}
	}


	private int partition(int low, int high) {
		int i=low-1;
		int j=low;
		int pivoteElement=numbers[high];
		for(;j<high;j++) {
			if(numbers[j]<=pivoteElement) {
				i=i+1;
				int temp=numbers[j];
				numbers[j]=numbers[i];
				numbers[i]=temp;
				//Utility.swap(numbers,i, j);
			}
		}
		int temp=numbers[i+1];
		numbers[i+1]=numbers[high];
		numbers[high]=temp;
		//Utility.swap(numbers, ++i, high);
		
		return i+1;
	}
	
public static void main(String[] args) {
	QuickSort quickSort=new QuickSort(Utility.getRandomIntegers(10));
	quickSort.sort();
}
}
