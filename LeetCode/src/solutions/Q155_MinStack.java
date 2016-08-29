package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
*/
public class Q155_MinStack {

    /** initialize your data structure here. */
	private Integer minimum;
	private Stack<Integer> stack;
	private List<Integer> list;
    
    public Q155_MinStack() {
        minimum = Integer.MAX_VALUE;
        stack = new Stack<>();
        list = new ArrayList<>(); 
    }
    
    public void push(int x) {
        stack.push(x);
        minimum = Math.min(minimum, x);
        list.add(x);
    }
    
    public void pop() {
        Integer popped = stack.pop();
        list.remove(popped);
        minimum = Integer.MAX_VALUE;
        for (Integer a : list){
        	minimum = Math.min(minimum, a);
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
    	if (!stack.isEmpty())
    		return minimum;
    	return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */