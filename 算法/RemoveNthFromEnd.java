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
class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        while( n-- > 0 ){
            if(fast.next != null){
                //fast 指针前进 n 个节点
                fast = fast.next;
            } else {
                // 如果链表的长度小于n，删除头节点
                head = head.next;
                return head;
            }
        }
        //如果链表的长度大于n，快节点比慢节点快n个节点，快节点到达末尾时，满节点在倒数第n个
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}