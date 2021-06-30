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
class Solution {
    //返回头节点
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return null;
        ListNode a,b;        
        a = head;
        b = head;
        for(int i = 0; i < k ; i++){
            if(b == null)
                return head;
            b = b.next;
        }
        ListNode newhead = reverseRecursion(a,b);
        a.next = reverseKGroup(b,k);
        return newhead;
    }

    //迭代反转链表
    public ListNode reverseIteration(ListNode head,ListNode nail) {
        if(head == null) return null;
        ListNode pre = null;
        ListNode cur = head;
        while(cur != nail){
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre; 
    }
    //递归反转指定区间链表,左闭右开
    public ListNode reverseRecursion(ListNode head,ListNode nail) {
        if(head == null) return null;
        if(head.next == nail) return head;
        ListNode newhead = reverseRecursion(head.next,nail);
        head.next.next = head;
        head.next = nail;
        return newhead;
    }
}