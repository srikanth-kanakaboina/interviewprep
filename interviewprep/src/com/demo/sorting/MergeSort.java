package com.demo.sorting;

public class MergeSort {

	int numbers[];
	int helper[];
	int count;

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	private MergeSort(int numbers[]) {
		this.numbers = numbers;
		count = numbers.length;
		helper = new int[count];
	}

	public int[] sort() {
		mergeSort(0, numbers.length - 1);
		return this.numbers;
	}

	private void mergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex == higherIndex) {
			return;
		} else {
			int mid = (lowerIndex + higherIndex) / 2;
			mergeSort(lowerIndex, mid);
			mergeSort(mid + 1, higherIndex);
			merge(lowerIndex, mid, higherIndex);
		}

	}

	private void merge(int lowerIndex, int mid, int higherIndex) {
		int i=lowerIndex;
		int j=mid+1;
		int k=lowerIndex;
		for (int n = lowerIndex; n <= higherIndex; n++) {
            helper[n] = numbers[n];
		}

		while(i<=mid&&j<=higherIndex) {
			if(helper[i]<helper[j])
				numbers[k++]=helper[i++];
			else
				numbers[k++]=helper[j++];
		}
		
		while(i<=mid) {
			numbers[k++]=helper[i++];
		}
		while(j<=higherIndex) {
			numbers[k++]=helper[j++];
		}
	
	}
	public static void main(String[] args) {
		MergeSort mergersort = new MergeSort(Utility.getRandomIntegers(10));
		Utility.print(mergersort.getNumbers(), "Before MErge Sort");
		Utility.print(mergersort.sort(), "After Merge Sort");
	}

}
