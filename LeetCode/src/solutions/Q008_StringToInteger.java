package solutions;

public class Q008_StringToInteger {
	public int myAtoi(String str) {
		char current;
        String wip = str;
        StringBuffer result = new StringBuffer();
        char signed = ' ';
        
        if (null==wip || wip.length() == 0){
            return 0;
        }
        wip = wip.trim(); //eliminates white spaces
        if (wip.charAt(0)=='-'){ //flags signed number
            signed = '-';
        } else if (wip.charAt(0)=='+'){
        	signed = '+';
        }
        for (int i = signed != ' ' ? 1 : 0; i < wip.length(); i++){ //iterates through the string
            current = wip.charAt(i);
            if (current >= '0' && current <= '9'){ //if the character is between 0-9
                result.append(current);
            } else {
                break; //stops reading after encountering first non-number character
            }
        }
        wip = result.toString();
        if (wip.length() == 0 ){
            return 0;
        } 
        try {
        	System.out.println(wip);
            if (Integer.parseInt(wip) > Integer.MAX_VALUE || Integer.parseInt(wip) < Integer.MIN_VALUE){
                return 0;
            } else {
                if (signed=='-'){
                    return Integer.parseInt(wip)*-1;
                } else {
                    return Integer.parseInt(wip);
                }
            }
        } catch (NumberFormatException e) { // for int parsing errors (above max / below min)
            if (signed=='-'){
            	return Integer.MIN_VALUE;
            } else {
            	return Integer.MAX_VALUE;
            }
        }                
    }
    
	public static void main(String[] args){
		Q008_StringToInteger sti = new Q008_StringToInteger();
    	int solution = sti.myAtoi("+3453623");
    	System.out.println(solution);   	
    }
}
