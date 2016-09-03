package solutions;
/*
 Given an integer, write a function to determine if it is a power of two.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
*/
public class Q231_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {    	
        if (n == 1 || n == 2) return true;    	
        while (n > 0) {
        	if (n%2 != 0) return false;
        	if (n/2 == 2) return true;
        	n /= 2;
        }    	
    	return false;
    }
    public static void main(String[] args){
    	Q231_PowerOfTwo test = new Q231_PowerOfTwo();
    	for (int i = 0; i < 100; i++)
    	System.out.println(i + " : " +test.isPowerOfTwo(i));
    }
}
