package leetcode;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy1(int n) {

        System.out.println("IsHappy number	:	" + n);
        if (n == 1) return true;
        if (n <= 0) return false;
        int sumtotal;
        Set<Integer> sum = new HashSet<>();
        while (sum.add(n)) {
            sumtotal = 0;
            while (n > 0) {
                int lastDigit = n % 10;
                n = n / 10;
                sumtotal += lastDigit * lastDigit;
            }

            System.out.println("Sumtotal	:	" + sumtotal);
            if (sumtotal == 1)
                return true;
            else
                n = sumtotal;
        }
        return false;

    }

    public static void main(String[] args) {
        int randomNum=new Random().nextInt(1000);
        System.out.println("Is Happy number	Method 1:	" + HappyNumber.isHappy1(randomNum));

        System.out.println("Is Happy number	Method 2:	" + HappyNumber.isHappy2(randomNum));

    }

    private static boolean isHappy2(int number) {
        Set<Integer> sumOfSquare = new HashSet<>();

        sumOfSquare.add(number);

        while (number!=1){
            number = getSumOfDigits(number);
            if( sumOfSquare.contains(number)){
                return false;
            }
            sumOfSquare.add(number);
        }
        return true;


    }

    private static int getSumOfDigits(int number) {
        int sum=0;
        while (number>0){
            int digit=number%10;
            number/=10;
            sum+=digit*digit;
        }
        return sum;
    }

    ;


}
