package solutions;

public class Q009_PalindromeNumber {
	public boolean isPalindrome(int x) { // x=432
        if (x < 0) return false; // negative numbers cannot be palindromes
        int places = 1; //multiplier / counter for number of digits in the input
        int first = x;
        while (first > 9) { // 432, 1; 43, 10; 4, 100
            first /= 10;
            places *=10;
        }
        while (x > 0){            
            int last = x % 10; // last = 2
            first = x / places;
            if (first != last) return false; // checks first vs last digit
            
            x -= first * places; // 32
            x -= last; // 30
            x /= 10; // 3
            places /= 100;
        }
        return true;
    }
    public static void main(String[] args){
    	Q009_PalindromeNumber pn = new Q009_PalindromeNumber();
    	boolean solution = pn.isPalindrome(1234321);
    	System.out.println(solution);   	
    }
}
