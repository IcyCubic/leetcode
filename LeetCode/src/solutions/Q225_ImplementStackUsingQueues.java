package solutions;

import java.util.LinkedList;
import java.util.Queue;

/*
 Implement the following operations of a stack using queues.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    empty() -- Return whether the stack is empty.

Notes:

    You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
    Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
    You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).

Update (2015-06-11):
The class name of the Java function had been updated to MyStack instead of Stack.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and all test cases.
*/
public class Q225_ImplementStackUsingQueues {
	Queue<Integer> q = new LinkedList<>();
    // Push element x onto stack.
    public void push(int x) {
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(x);
        q2.addAll(q);
    	q = q2;
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.remove();
        
    }

    // Get the top element.
    public int top() {
        return (int)q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
}
