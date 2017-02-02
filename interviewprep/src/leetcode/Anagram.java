package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static boolean isAnagram(String s, String t) {
		if(s==null||t==null){
			return false;
		}
		
		if(s.length()!=t.length()) {
			return false;
		}
		
		int[] index=new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			index[s.charAt(i)-'a']++;
			index[t.charAt(i)-'a']--;
		}
		
		for(int i:index) {
			if(i!=0)
				return false;
		}
		return true;  
    }
	
	
	public static boolean isAnagramUsingMaps(String s, String t) {
		if(s==null||t==null){
			return false;
		}
		
		if(s.length()!=t.length()) {
			return false;
		}
		
		Map<Character,Integer> charMap=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			if(!charMap.containsKey(s.charAt(i))) {
				charMap.put(s.charAt(i), 1);
			}else {
				charMap.put(s.charAt(i), charMap.get(s.charAt(i))+1);
			}
		}
		
		for(int i=0;i<s.length();i++) {
			if(charMap.containsKey(t.charAt(i))) {
				if(charMap.get(t.charAt(i))==1) {
					charMap.remove(t.charAt(i));
				}else {
					charMap.put(t.charAt(i), charMap.get(t.charAt(i))-1);
				}
			}else {
				return false;
			}
		}
		
		
		if(!charMap.isEmpty()) {
			return false;
		}
		return true;  
    }

	public static void main(String[] args) {
		String s1="abbazde";
		String s2="bbaezcd";
		
		System.out.println(Anagram.isAnagram(s1, s2));
		System.out.println(Anagram.isAnagramUsingMaps(s1, s2));
	}

}
