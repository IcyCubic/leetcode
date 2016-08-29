package solutions;

import java.util.ArrayList;
import java.util.List;

/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space? */
public class Q141_LinkedListCycle {
	// too slow!? Though it's pretty much the editorial solution...
    public boolean hasCycle(ListNode head) {
    	List<ListNode> list = new ArrayList<ListNode>();
    	
    	while (head != null){
    		if (list.contains(head)) return true;
    		else list.add(head);
    		head = head.next;
        }    	
    	return false;
    }
}
