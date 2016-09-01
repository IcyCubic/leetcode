package solutions;

import java.util.ArrayList;
import java.util.List;

/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting 
with any positive integer, replace the number by the sum of the squares 
of its digits, and repeat the process until the number equals 1 
(where it will stay), or it loops endlessly in a cycle which does not 
include 1. Those numbers for which this process ends in 1 are happy 
numbers.

Example: 19 is a happy number

    12 + 92 = 82
    82 + 22 = 68
    62 + 82 = 100
    12 + 02 + 02 = 1

Credits:
Special thanks to @mithmatt and @ts for adding this problem and creating all test cases.

---
Divide up the int into its digits
square the digits
sum the squares
check if sum of squares == 1
break and return false after x iterations
repeat
*/
public class Q202_HappyNumber {
    public boolean isHappy(int n) {    	
    	int count = 0;
    	do {
    		List<Integer> list = new ArrayList<Integer>();
    		int sum = 0;
	    	while (n > 0){ // break the number up into digits
	    		list.add(n%10);
	    		n /=10;
	    	}    	
	    	Integer[] array = list.toArray(new Integer[0]);
	    	for (int i = 0; i < array.length; i++){ // square and sum each digit
	    		array[i] = array[i] * array[i]; 
	    		sum += array[i];
	    	}
	    	n = sum;
	    	count++;
	    	if (sum == 1) return true;	    	
    	} while (count < 100);
        return false;
    }
    public static void main(String[] args){
    	Q202_HappyNumber test = new Q202_HappyNumber();
    	System.out.println(test.isHappy(199));
    }
}
