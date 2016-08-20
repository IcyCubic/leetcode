package solutions;

import java.util.Stack;

/*
Given a string containing just the characters '(', ')', '{', '}', 
'[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are 
all valid but "(]" and "([)]" are not.
*/
public class Q020_ValidParentheses { // compare first and last, work way in?
    public boolean isValid(String s) {
    	if (s.length() % 2 != 0) return false;
    	
    	Stack<Character> stack = new Stack<>();
        for (int i = 0, max = s.length(); i < max; i++){    	
        	switch (s.charAt(i)){
        		case ')':
        			if (stack.isEmpty() || stack.pop() != '(') return false;
        			break;
        		case '}':
        			if (stack.isEmpty() || stack.pop() != '{') return false;
        			break;
        		case ']':
        			if (stack.isEmpty() || stack.pop() != '[') return false;
        			break;
        		case '(': case '[': case '{':
        			stack.push(s.charAt(i));
        	}
        }
        if (!stack.isEmpty()) return false;
    	return true;
    }
}
