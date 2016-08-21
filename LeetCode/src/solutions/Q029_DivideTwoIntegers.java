package solutions;
/*
 Divide two integers without using multiplication, division and mod operator.

If it is overflow, return MAX_INT. 
*/
public class Q029_DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
    	if(dividend == Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
    	if (dividend < 0 && divisor < 0) return div(-dividend, -divisor);
    	else if (dividend < 0) return -div(-dividend, divisor);
    	else if (divisor < 0) return -div(dividend, -divisor);
    	else return div(dividend, divisor);
    }
    
    private int div (int dividend, int divisor) {
    	if (divisor == 1) return dividend;
    	if (dividend == 0 || divisor == 0) return 0;    	    	    	
    	if (divisor > dividend) return 0;
    	int answer = 0;
    	while (dividend >= divisor) { // brute force method takes too long, need to improve
    		answer++;    		
    		dividend -= divisor;
    	}
	return answer;
    }
    public static void main(String[] args){
    	Q029_DivideTwoIntegers test = new Q029_DivideTwoIntegers();
    	System.out.println(test.divide(2147483647, 2));
    }
}
