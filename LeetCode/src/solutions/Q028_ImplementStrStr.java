package solutions;

public class Q028_ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || needle.length() > haystack.length()) return -1;
        if (needle.length() == 0) return 0;    	
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
        	if (haystack.substring(i, i + needle.length()).equals(needle)) {
        		return i;
        	}
        }        
    	return -1;
    }
}
