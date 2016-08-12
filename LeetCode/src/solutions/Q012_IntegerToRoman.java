package solutions;
/*
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.

Brute force-ish, can probably make shorter code with Hash/TreeMap
*/
public class Q012_IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        while (num >= 1000){
        	result.append('M');
        	num -= 1000;
        }
        if (num >= 900){
        	result.append("CM");
        	num -= 900;
        } else if (num >= 500){
        	result.append("D");
        	num -= 500;
        } else if (num >= 400){
        	result.append("CD");
        	num -= 400;
        }      
        while (num >=100){
        	result.append("C");
        	num -=100;
        }
        if (num >= 90){
        	result.append("XC");
        	num -= 90;
        } else if (num >= 50){
        	result.append("L");
        	num -= 50;
        } else if (num >= 40){
        	result.append("XL");
        	num -= 40;
        }        
        while (num >=10){
        	result.append("X");
        	num -=10;
        }
        if (num == 9){
        	result.append("IX");
        	num -= 9;
        } else if (num >= 5){
        	result.append("V");
        	num -= 5;
        } else if (num >= 4){
        	result.append("IV");
        	num -= 4;
        }
        
        while (num >=1){
        	result.append("I");
        	num -=1;
        }
        	return result.toString();

    }
    
    public static void main(String[] args){
    	Q012_IntegerToRoman itr = new Q012_IntegerToRoman();
    	System.out.println(itr.intToRoman(3945));
    }
}
