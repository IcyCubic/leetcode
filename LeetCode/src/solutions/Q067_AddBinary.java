package solutions;
/*
 Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100". 
*/
public class Q067_AddBinary {
    public String addBinary(String a, String b) {

        int ia = a.length() - 1; // index of last char of string a
        int ib = b.length() - 1; // index of last char of string b
        int index = ia > ib ? ia : ib; // length of longer of two strings;
        int diff = ia > ib ? ia-ib : ib-ia; // length difference.
        for (int i = 0; i < diff; i++){ // normalize lengths
        	if (ia > ib){
        		b = "0" + b;
        	} else {
        		a = "0" + a;
        	}
        }

        StringBuilder result = new StringBuilder(); // WIP result string
        boolean carry = false; // carry flag
        char temp;        
        for (int i = index; i >= 0; i--){ //working backwards from end of strings          	
        	if (a.charAt(i) == '1' && b.charAt(i) == '1'){ 
        		temp = carry? '1' :'0';
        		carry = true;
        	} else if ((a.charAt(i) == '0' && b.charAt(i) == '1') || (a.charAt(i) == '1' && b.charAt(i) == '0')){
        		temp = carry ? '0' : '1';
        	} else { // a.charAt(ia) == '0' && b.charAt(ib) == '0'
        		temp = carry ? '1' : '0';
        		if (carry){
        			carry = false;
        		}
        	}
    		result.insert(0, temp);
        }
    	if (carry)
    		result.insert(0, 1);
    	return result.toString();
    }
    
    public static void main(String[] args){
    	Q067_AddBinary test = new Q067_AddBinary();
    	System.out.println(test.addBinary("1", "1111"));
    }
}
