package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length. 
*/
public class Q205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
//    	if (s == null || s.length() == 0) return true;
//    	for (int i = 0; i < s.length(); i++){
//    		t = t.replaceAll(String.valueOf(t.charAt(i)), String.valueOf(s.charAt(i)));
//    		System.out.println(s + " " + t);
//    	}
//    	if (t.equals(s))
//    		return true;
//    	return false;
// ----------------------------------    	
//    	Set<Character> set1 = new TreeSet<Character>();
//    	Set<Character> set2 = new TreeSet<Character>();
//    	for (int i = 0; i < s.length(); i++){
//    		set1.add(s.charAt(i));
//    		set2.add(t.charAt(i));
//    		System.out.println(set1.size() + " " + set2.size());
//    	}
//    	if (set1.size() == set2.size()) return true;
//    	return false;
// ----------------------
    	Map<Character, Integer> map1 = new HashMap<>();
    	Map<Character, Integer> map2 = new HashMap<>();
    	for (int i = 0; i < s.length(); i++){
    		char cS = s.charAt(i);
    		char cT = t.charAt(i);
   			if (!map1.getOrDefault(cS, -1).equals(map2.getOrDefault(cT, -1)))
   				return false;
    		else {
    			map1.put(cS, i);
    			map2.put(cT, i);
    		}
    	}
    	return true;
    }
    public static void main(String[] args){
    	Q205_IsomorphicStrings test = new Q205_IsomorphicStrings();
    	System.out.println(test.isIsomorphic("ab", "aa"));
    }
}
