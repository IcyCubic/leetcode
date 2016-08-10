package solutions;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        boolean incriment = false;
        int sum = l1.val + l2.val;
        if (sum > 9){
            sum %=10;
            incriment = true;
        }
        ListNode answer = new ListNode(sum);
        ListNode index = answer;
        ListNode temp;
        
        while (null != l1.next || null != l2.next){
            if (null != l1.next && null != l2.next){
                l1 = l1.next;
                l2 = l2.next;
                sum = incriment ? l1.val + l2.val+1 : l1.val + l2.val;
            } else if (null != l1.next && null == l2.next){
                l1 = l1.next;
                sum = incriment ? l1.val + 1 : l1.val;
            } else if (null == l1.next && null != l2.next){
                l2 = l2.next;
                sum = incriment ? l2.val + 1 : l2.val;
            }
            incriment = false;            
            if (sum > 9){
                incriment = true;
                sum %=10;
            }
            temp = new ListNode(sum);
            index.next = temp;
            index = temp;
        }
        if (incriment == true){
            temp = new ListNode(1);
            index.next = temp;
        }
        return answer;
    }

	public static void main(String[] args){
		AddTwoNumbers add = new AddTwoNumbers();
		ListNode solution = add.addTwoNumbers(new ListNode(5), new ListNode(7));
		System.out.print("["+solution.val);
		while (null!=solution.next){
			solution = solution.next;
			System.out.print(", " + solution.val);
		}
		System.out.print("]");
	}
}
