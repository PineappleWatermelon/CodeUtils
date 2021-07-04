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
class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode slow,fast;
        slow = head;
        fast = head;
        //返回的是中间靠后的节点
        //如果想返回中间靠前的节点，在头节点之前自创一个节点 
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}