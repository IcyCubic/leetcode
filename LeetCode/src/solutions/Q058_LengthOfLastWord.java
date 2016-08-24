package solutions;

public class Q058_LengthOfLastWord {
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
    
    public static void main(String[] args){
    	Q058_LengthOfLastWord test = new Q058_LengthOfLastWord();
    	System.out.println(test.lengthOfLastWord("what"));
    }
}
