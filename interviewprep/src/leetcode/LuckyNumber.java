package leetcode;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LuckyNumber {
    public static void main(String[] args) {
        System.out.println(findLucky(new int[]{1,2,2,3,3,3}));
    }

    public static  int findLucky(int[] arr) {

        AtomicInteger luck= new AtomicInteger();
        Map<Integer,Integer> luckyMap=new TreeMap<>();

        for (int i=0;i<arr.length;i++){
            luckyMap.put(arr[i],1+ luckyMap.getOrDefault(arr[i],0));
        }
        luckyMap.forEach((key,value)->{
            if(key==value && luck.intValue()<=key){
                luck.set(key);
            }

        });
        return luck.intValue();
    }
}
