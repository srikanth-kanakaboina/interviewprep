package interviewprep;

import com.demo.sorting.Utility;

public class HeapSort {
	int[] numbers;
	int size;

	public HeapSort(int[] numbers) {
		super();
		this.numbers = numbers;
		this.size = numbers.length-1;
	}

	public void sort() {
		createMaxHeap();
		for(int i=size;i>=0;i--) {
			exchange(0,i);
			size--;
			maxHeapify(0);
			
		}
		
		
		Utility.print(numbers, "After heap Sort");
	}

	private void createMaxHeap() {

		for (int i = size / 2; i>= 0; i--) {
			maxHeapify(i);
		}

		Utility.print(numbers, "After Max Heap");
	}

	private void maxHeapify(int parent) {
		int left = parent * 2;
		int right = (parent *2)  + 1;
		int largest=parent;

		if (left <= size && numbers[left] > numbers[parent]) {
			largest = left;
		}

		if (right <= size && numbers[right] > numbers[largest]) {
			largest = right;
		}

		if (parent != largest) {
			exchange(parent, largest);
			maxHeapify(largest);
		}
	}

	private void exchange(int parent, int largest) {
		int temp = numbers[parent];
		numbers[parent] = numbers[largest];
		numbers[largest] = temp;
	}

	public static void main(String[] args) {
		HeapSort heapSort=new HeapSort(Utility.getRandomIntegers(10));
		heapSort.sort();
	}
}
