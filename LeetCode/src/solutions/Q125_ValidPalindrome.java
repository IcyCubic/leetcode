package solutions;
/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome. 
*/

public class Q125_ValidPalindrome {
// 38ms
//    public boolean isPalindrome(String s) {
//        s = s.toLowerCase();
//        s = s.replaceAll("[^a-z0-9]", "");
//    	StringBuilder sb = new StringBuilder(s);
//    	if (sb.reverse().toString().equals(s))    	
//    		return true;
//    	return false;
//    }

// ms	
	public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int j = s.length()-1;
        for (int i = 0; i < s.length(); i++){
        	if (s.charAt(i)!=s.charAt(j--)) return false;
        }
        return true;
    }
    public static void main(String[] args){
    	Q125_ValidPalindrome test = new Q125_ValidPalindrome();
    	System.out.println(test.isPalindrome("aaabbbccaccbbbaaa"));
    	System.out.println(test.isPalindrome("12345432"));
    }
}
