package leetcode;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy(int n) {

        System.out.println("IsHappy number	:	" + n);
        if (n == 1) return true;
        if (n <= 0) return false;
        int sumtotal;
        Set<Integer> sum = new HashSet<>();
        while (sum.add(n)) {
            sumtotal = 0;
            while (n > 0) {
                int lastDigit = n % 10;
                sumtotal += lastDigit * lastDigit;
                n = n / 10;
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
        System.out.println("Is Hsppy number	:	" + HappyNumber.isHappy(new Random().nextInt()));

    }

}
