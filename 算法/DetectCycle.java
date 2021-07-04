/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow,fast;
        slow = head;
        fast = head;
        /**
        * 问：为什么要判断fast不为空，有必要判断吗？fast.next不为空，fast不就肯定不为空了吗？
        * 答：有必要，fast不为空主要循环执行一遍，对赋值后fast的重新判断
        */
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) break;
        }
        
        //当上面链表因为fast == null，或者fast.next== null, 循环正常结束时，说明链表没有环
        if(fast == null || fast.next == null) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}