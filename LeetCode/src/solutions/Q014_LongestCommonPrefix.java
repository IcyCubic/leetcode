package solutions;

public class Q014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	if (null == strs || strs.length == 0){
    		return "";
    	}
        StringBuilder result = new StringBuilder();
        boolean toAppend = true;
        
        for (int i = 0, stringMax = strs[0].length(); i < stringMax; i++){
	        for (int j = 0, arrayMax = strs.length; j < arrayMax; j++){
	        	if (i +1 > strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)){
	        		toAppend = false;
	        		break;
	        	}
	        }
	        if (!toAppend){
	        	break;
	        }
	        result.append(strs[0].charAt(i));
        }
        
    	return result.toString();
    }
    
   public static void main(String[] args){
	   Q014_LongestCommonPrefix lcp = new Q014_LongestCommonPrefix();
	   System.out.println(lcp.longestCommonPrefix(new String[] {"aaa","aa","aabcd"}));
   } 
}
