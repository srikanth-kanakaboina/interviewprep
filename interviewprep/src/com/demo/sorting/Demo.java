package com.demo.sorting;

public class Demo {
public static void main(String[] args) {
	System.out.println(7/2);
	int a[]=Utility.getRandomIntegers(10);
	Utility.print(a, "Before Merge");
	int mid=a.length/2;
	a=merge(a,0,mid,a.length-1);
	Utility.print(a, "After Merge");
}

private static int[]  merge(int[] numbers, int lowerIndex, int mid, int higherIndex) {
	int lowerArrayLength=mid-lowerIndex+1;
	int higherArrayLength=higherIndex-mid;
	
	int[] lowerArray=new int[lowerArrayLength];
	int[] higherArray=new int[higherArrayLength];
	System.out.println(lowerArrayLength+":::::"+higherArrayLength);
	
	
	System.out.print("Lower	:	");
	for (int i = 0; i < lowerArrayLength; i++) {
		lowerArray[i]=numbers[i];
		System.out.print(" "+lowerArray[i]+" ");
		
	}
	System.out.print("\nHigher	:	");
	int j=0;
	for (int i = mid+1; i < higherIndex; i++) {
		higherArray[j]=numbers[i];
		System.out.print(" "+higherArray[j]+" ");
		
	}
	
	int i=0;
	j=0;
	for (int k = lowerIndex; k < higherIndex; k++) {
		if(lowerArray[i]<higherArray[j])
			numbers[k]=lowerArray[i++];
		else if(lowerArray[i]>higherArray[j])
			numbers[k]=higherArray[j++];
	}
	
	return numbers;
}
}
