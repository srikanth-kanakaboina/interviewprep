package leetcode;

import java.sql.SQLOutput;
import java.util.*;

public class GroupOfAnagrams {
    public static void main(String[] args) {

        String[]  strs={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));

    }

    public static  List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String,List<String>> anagrams=new HashMap<>();
        List<List<String>> groupOfAnagrams=new ArrayList<>();

        for (int i = 0; i <strs.length; i++) {
            String key=getIntegerVale(strs[i]);
            if (anagrams.containsKey(key)) {
                List<String> val=anagrams.get(key);
                val.add(strs[i]);
                System.out.println(val);
            }else{
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                anagrams.put(key,list);
            }
        }
        anagrams.forEach((k,v)->{
            groupOfAnagrams.add(v);
        });
    return groupOfAnagrams;

    }

    private static String getIntegerVale(String anagram) {
        char[] str = anagram.toCharArray();
        Arrays.sort(str);
        return Arrays.toString(str);
    }
}

