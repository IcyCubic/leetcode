package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given two strings s and t, write a function to determine if t is an 
anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your 
solution to such case?
*/
public class Q242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
    	if (s == null && t != null || s != null && t == null || t.length() != s.length()) return false;    	
    	List<Character> list = new ArrayList<>(); // char container
    	for (int i = 0; i < s.length(); i++){ // populate w/ string 1
    		list.add(s.charAt(i));
    	}
    	for (int i = 0; i < t.length(); i++){
    		if (!list.remove((Character)t.charAt(i)))
    			return false;
    	}
        return true;
    }
    public boolean isAnagramII(String s, String t){
    	if (s.length() != t.length()) return false;
    	char[] sa = s.toCharArray();
    	char[] ta = t.toCharArray();
    	Arrays.sort(sa);
    	Arrays.sort(ta);
    	for (int i = 0; i < sa.length; i++){
    		if (sa[i] != ta[i])
    			return false;
    	}    	
    	return true;
    }
}
