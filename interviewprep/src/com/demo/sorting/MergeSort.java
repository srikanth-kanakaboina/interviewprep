package com.demo.sorting;

public class MergeSort {

	int numbers[];

	public int[] getNumbers() {
		return numbers;
	}


	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}


	private  MergeSort(int numbers[]) {
		this.numbers = numbers;
	}
	
	
	public int [] sort() {
		int[] tempArray=new int[numbers.length];
		mergeSort(numbers,0,numbers.length-1);
		return this.numbers;
	}


	private void mergeSort(int[] numbers, int lowerIndex, int higherIndex) {
		if(lowerIndex==higherIndex) {
			return;
		}else {
			int mid=(lowerIndex+higherIndex)/2;
			mergeSort(numbers, lowerIndex, mid);
			mergeSort(numbers, mid+1, higherIndex);
			merge(numbers,lowerIndex,mid,higherIndex);
		
		}
			
	}


	private void merge(int[] numbers, int lowerIndex, int mid, int higherIndex) {
		Utility.print(numbers,"In Recurtion with Start ["+lowerIndex+"] Mid ["+mid+"] End ["+higherIndex+"]");
		int[] temp=new int[this.numbers.length];
		int count=higherIndex-lowerIndex+1;
		int secondLower=mid+1;
		int start=lowerIndex;
		int i=0;
		while(lowerIndex<=mid&&secondLower<=higherIndex) {
			if(this.numbers[lowerIndex]<this.numbers[secondLower]) {
				temp[i++]=this.numbers[lowerIndex++];
			}else {
				temp[i++]=this.numbers[secondLower++];
			}
		}
		while(lowerIndex<=mid) {
			temp[i++]=this.numbers[lowerIndex++];
		}
		while(secondLower<=higherIndex) {
			temp[i++]=this.numbers[secondLower++];
		}
		for (int j = 0; j < temp.length; j++) {
			this.numbers[j]=temp[j];
		}
	}
	public static void main(String[] args) {
		MergeSort mergersort=new MergeSort(Utility.getRandomIntegers(10));
		Utility.print(mergersort.getNumbers(), "Before MErge Sort");
		Utility.print(mergersort.sort(), "After Merge Sort");
	}

}
