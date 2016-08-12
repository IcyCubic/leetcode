package solutions;

public class Q007_ReverseInteger {
    public int reverse(int x) {
        String input = String.valueOf(x);
        boolean negative = false;
        StringBuilder answer = new StringBuilder();
        int rev;
        for (int i = input.length()-1; i >=  0; i--){
            if (input.charAt(i) != '-'){
            	answer.append(input.charAt(i));
            } else {
            	negative = true;
            }    
        }
        try{
            rev = Integer.parseInt(answer.toString());
        } catch (Exception e){
            rev = 0;
        }
        return negative? rev*-1 : rev;
    }
    public static void main(String[] args){
    	Q007_ReverseInteger ri = new Q007_ReverseInteger();
    	int solution = ri.reverse(123456);
    	System.out.println(solution);   	
    }
}
