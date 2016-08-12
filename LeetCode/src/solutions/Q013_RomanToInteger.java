package solutions;
/* 
Given a roman numeral, convert it to an integer.
 
Input is guaranteed to be within the range from 1 to 3999.
*/
public class Q013_RomanToInteger {
    public int romanToInt(String s) {
    	s = s.toUpperCase();
    	StringBuilder sb = new StringBuilder(s);
    	int result = 0;
    	
    	int x = sb.indexOf("CM");
    	if (x >= 0){
    		result += 900;
    		sb.delete(x, x+2);
    	}
    	x = sb.indexOf("CD");
    	if (x >= 0){
    		result += 400;
    		sb.delete(x, x+2);
    	}    	
    	x = sb.indexOf("XC");
    	if (x >= 0){
    		result += 90;
    		sb.delete(x, x+2);
    	}    	
    	x = sb.indexOf("XL");
    	if (x >= 0){
    		result += 40;
    		sb.delete(x, x+2);
    	}    	
    	x = sb.indexOf("IX");
    	if (x >= 0){
    		result += 9;
    		sb.delete(x, x+2);
    	}    	
    	x = sb.indexOf("IV");
    	if (x >= 0){
    		result += 4;
    		sb.delete(x, x+2);
    	}    	
    	
    	for (int i = 0, max = sb.length(); i < max; i++){
    		switch (sb.charAt(i)){
    			case 'M':
    				result+=1000;
    				break;
    			case 'D':
    				result+=500;
    				break;
    			case 'C':
    				result+=100;
    				break;
    			case 'L':
    				result+=50;
    				break;
    			case 'X':
    				result+=10;
    				break;
    			case 'V':
    				result+=5;
    				break;
    			case 'I':
    				result+=1;
    				break;
    		}
    	}    	
    	return result;
    }
	
    public static void main(String[] args){
    	Q013_RomanToInteger rti = new Q013_RomanToInteger();
    	System.out.println(rti.romanToInt("MMMCMXLV"));
    }
}
