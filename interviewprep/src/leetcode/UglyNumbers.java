package leetcode;

import java.util.Random;

public class UglyNumbers {

	public static boolean isUgly(int num) {
		if(num==1) return true;
		if(num==0) return false;
		
			while(num%2==0) num=num/2;
			while(num%3==0) num=num/3;
			while(num%5==0) num=num/5;
	
		
		return num==1;
	}

	public static void main(String[] args) {
		System.out.println("Is Ugly	:	"+isUgly(new Random().nextInt()));
		
	}

}
