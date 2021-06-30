/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseList{
    // 迭代反转链表
    public ListNode reverseListIteration(ListNode head) {
        if(head == null) return null;
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre; 
    }
    
    //递归反转链表
    public ListNode reverseListRecursion(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode newhead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
}