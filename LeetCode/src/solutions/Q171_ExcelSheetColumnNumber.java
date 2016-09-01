package solutions;
/*
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
*/
public class Q171_ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
    	int result = 0;
    	int place = s.length()-1;
    	for (int i = 0; i < s.length(); i++){
    		result += Math.pow(26, place)* (s.charAt(i) - 64); 
    		place--;
    	}
        return result;
    }
    public static void main(String[] args){
    	Q171_ExcelSheetColumnNumber test = new Q171_ExcelSheetColumnNumber();
    	System.out.println(test.titleToNumber("ZA"));
    }
}
