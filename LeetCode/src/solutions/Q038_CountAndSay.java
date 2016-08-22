package solutions;
/*
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string. 
*/
public class Q038_CountAndSay {
    public String countAndSay(int n) {
        if (n <= 1) return "1";
        StringBuilder result = new StringBuilder();
        result.append("1");
        for (int i = 2; i <= n; i++){
        	StringBuilder temp = new StringBuilder();
        	int count = 1;
        	int index = 0;
        	while (index < result.length()){
        		char current = result.charAt(index++);
        	}
        }
        
        
        
        return result.toString();
    }
    // ??
//    public String countAndSay(int n) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("1");
//        if (n <= 1) return sb.toString();
//        for (int i = 2; i <= n; i++) {
//            StringBuilder tmp = new StringBuilder();
//            int count = 1;
//            int index = 0;
//            while (index < sb.length()) {
//                char curr = sb.charAt(index++);
//                while (index < sb.length() && sb.charAt(index) == curr) {
//                    ++count;
//                    ++index;
//                }
//                tmp.append(String.valueOf(count) + String.valueOf(curr));
//                count = 1;
//            }
//            sb = tmp;
//        }
//        return sb.toString();
//    }
    
    public static void main(String[] args){
    	Q038_CountAndSay test = new Q038_CountAndSay();
    	System.out.println(test.countAndSay(11));
    }
}
