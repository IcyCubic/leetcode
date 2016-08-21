package solutions;
/*
 Merge two sorted linked lists and return it as a new list. 
 The new list should be made by splicing together the nodes of the first two lists.
*/
public class Q021_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if (l1 == null && l2 == null) return null;
    	else if (l1 == null) return l2;
    	else if (l2 == null) return l1;
    	ListNode result = new ListNode(9999);
    	ListNode current = result;
    	
    	while(l1 != null && l2 != null){
    		if (l1.val > l2.val){
    			current.next = l2;
    			l2 = l2.next;
    		} else {
    			current.next = l1;
    			l1 = l1.next;
    		}
    		current = current.next;
    	}
    	if (l1 == null){
    		current.next = l2;
    	} else {
    		current.next = l1;
    	}
    	
    	return result.next;
    }
    
    public static void main(String[] args){
    	Q021_MergeTwoSortedLists test = new Q021_MergeTwoSortedLists();
    	ListNode result = test.mergeTwoLists(new ListNode(3), new ListNode(5));
    	while (result != null){
    		System.out.println(result.val);
    		result = result.next;
    	}
    }
}
