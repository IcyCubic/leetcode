package solutions;

/*
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
*/
public class Q066_PlusOne {
// bad solution: works only up to max value of long
//    public static int[] plusOne(int[] digits) { 
//    	long number = 0;    	
//    	for (int i = 0, max = digits.length; i < max; i++){
//    		number += digits[i];
//    		if (i < max-1){
//    			number *= 10;
//    		}
//    	}
//    	number++; // +1
//    	
//    	int numDigits = 0;
//    	long temp = number;
//    	while (temp > 0){ //get digits
//    		temp /= 10;
//    		numDigits++;
//    	}
//    	int[] result = new int[numDigits]; // answer container
//    	for (int i = result.length -1; i >= 0; i--){
//    		long digit = number %10;
//    		result[i] = (int)digit;
//    		number /= 10;
//    	}
//
//    	return result;
//    }

    public int[] plusOne(int[] digits) {
    	int index = digits.length -1;
    	digits[index] += 1;
    	while (digits[index] == 10 && index >= 1){
    		digits[index] = 0;
    		digits[index-1] += 1;
    		index--;
    	}
    	if (digits[0] == 10){
    		digits[0] = 0;
    		int[] bigger = new int[digits.length+1];
    		bigger[0] = 1;
    		for (index = 1; index < bigger.length; index++){
    			bigger[index] = digits[index-1];
    		}
    		return bigger;
    	} else {
    		return digits;
    	}
    }
    
    public static void main(String[] args){
    	Q066_PlusOne test = new Q066_PlusOne();    	
    	int[] answer = test.plusOne(new int[] {9,8,7,6,5,4,3,2,1,0});
    	for (int c : answer){
    		System.out.print(c);
    	}
    }
}
