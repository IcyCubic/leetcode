package solutions;
/**
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.

Note:
Given n will always be valid.
Try to do this in one pass. 
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Q019_RemoveNthFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) { // head = 1>2>3>4>5, n=2
        if (head == null || n < 2) return null;
    	ListNode result = new ListNode(0);
    	ListNode[] buffer = new ListNode[n];
    	int index = 1;            	
    	buffer[0] = head;
    	System.out.println(buffer[0].val);
    	
        while (head.next != null){ // get length
        	head = head.next;
        	buffer[index] = head;
        	System.out.println("Loop Index: " + index);
        	index++;
        }
        
        int target = index - n; //3
        System.out.println("target: " + target);
        System.out.println("index: " + index);
        System.out.println("n: " + n);
        if (target == 0){
        	return buffer[target+1];
        } else {
        	buffer[target-1].next = buffer[target+1];
        }
        
        return result;
    }
    
    public static void main(String[] args){
    	ListNode result, head = new ListNode(0), index = head;
    	
    	for (int i = 1; i <= 10; i++){
    		ListNode next = new ListNode(i);
    		index.next = next;
    	}
    	
    	Q019_RemoveNthFromEndOfList test = new Q019_RemoveNthFromEndOfList();
    	result = test.removeNthFromEnd(head, 2);
    	System.out.print("[");
    	while (result != null){
    		System.out.print(result.val);
    		result = result.next;
    	}
    	System.out.print("]");
    }
}
