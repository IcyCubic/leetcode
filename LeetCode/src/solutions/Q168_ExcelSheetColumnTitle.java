package solutions;

import java.util.HashMap;
import java.util.Map;

/*
Given a positive integer, return its corresponding column title as 
appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB  
*/
public class Q168_ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.append((char) (65 + (n - 1) % 26));            
            n = (n - 1) / 26;
        }
        return result.reverse().toString();
    }
//	incomplete, possibly non-viable	
//    public String convertToTitle(int n) {    	    	
//    	Map<String, Character> map = new HashMap<String, Character>();
//    	for (int i = 1; i <=26; i++)
//    		map.put(convert(i), (char)(64+i));    	    	
//    	String base26 = convert(n);    	
//    	StringBuilder result = new StringBuilder();
//    	System.out.println("n: "+ n + " base26: " + base26 +" map.get(base26): ["+map.get(base26)+"]" + " Length: " + base26.length());
//    	for (int i = 0; i < base26.length(); i++){
//    		result.append(map.get(String.valueOf(base26.charAt(i))));
//    	}
//    	
//        return result.toString();
//    }
//    private String convert(int n){
//    	return Integer.toString(Integer.parseInt(String.valueOf(n), 10), 27);
//    }

    public static void main(String[] args){
    	Q168_ExcelSheetColumnTitle test = new Q168_ExcelSheetColumnTitle();
    	for (int i = 1; i < 70; i++)
    		System.out.println(test.convertToTitle(i));
    }
}
