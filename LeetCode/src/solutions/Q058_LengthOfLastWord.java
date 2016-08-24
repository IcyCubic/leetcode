package solutions;

public class Q058_LengthOfLastWord { //forward solution
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        String trimmed = s.trim();
        int index = trimmed.lastIndexOf(' ');
        if (index < 0){
        	int len = trimmed.length();
        	if ( len != 0)
        		return len;
            return 0;
        }
        String last = trimmed.substring(index+1);
        return last.length();
    }
    
    public int reverse(String s) { //backward solution
    	int length = s.length() - 1;
    	while (length > 0 && s.charAt(length) == ' '){
    		length--;
    	}
    	int result = 0;
    	for (int i = length; i >=0; i--){
    		if (s.charAt(length) == ' '){
    			break;
    		}
    		result++;
    	}
    	return result;
    } 
    
    public static void main(String[] args){
    	Q058_LengthOfLastWord test = new Q058_LengthOfLastWord();
    	System.out.println(test.lengthOfLastWord("what"));
    }
}
