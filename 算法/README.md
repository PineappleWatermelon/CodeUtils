# 一、链表

## 1.反转链表

[题目](https://leetcode-cn.com/problems/reverse-linked-list/)       [解答](./ReverseList.java)       [参考文章](https://mp.weixin.qq.com/s/5wz_YJ3lTkDH3nWfVDi5SA)

> 递归和迭代两种方式 ，反转链表，指定区间链表(在第2项中)，交换节点位置而不是节点里的值

## 2.k个一组反转链表

[题目](https://leetcode-cn.com/problems/reverse-nodes-in-k-group/submissions/)       [解答](./ReverseKGroup.java)       [参考文章](https://mp.weixin.qq.com/s/A-dQ9spsP_Iu1Y4iCRP9nA)

> 递归和迭代两种方式 ，反转 k 个一组链表，

## 3.双指针技巧

### 3.1 判断链表是否含有环

[题目](https://leetcode-cn.com/problems/linked-list-cycle/)       [解答](./HasCycle.java)       [参考文章](https://mp.weixin.qq.com/s/Nh6jxQtO-xOT_WuX-B5w3Q)

> 快慢两个指针，同时向前运动，重合的时候说明含有环

### 3.2 判断链表环的起点

[题目](https://leetcode-cn.com/problems/linked-list-cycle-ii/submissions/)       [解答](./DetectCycle.java)       [参考文章](https://mp.weixin.qq.com/s/Nh6jxQtO-xOT_WuX-B5w3Q)

> 当两个指针第一次相遇时，说明含有环，慢指针重新指向起点，快慢指针，同速运动时相遇点为环的起点
>
> 扩展：环的长度？一个节点不变，另一个节点继续走，二者相遇即为又走了一圈

### 3.3 返回链表的中点

[题目](https://leetcode-cn.com/problems/middle-of-the-linked-list/)       [解答](./DetectCycle.java)       [参考文章](https://mp.weixin.qq.com/s/Nh6jxQtO-xOT_WuX-B5w3Q)

> 如果链表节点是单数的话，返回链表中间节点，如果链表是双数的话，返回链表的中间靠后的节点
>
> 扩展：如果链表要返回中间靠前的节点，可以选择在头节点之前自己创建加一个节点

### 3.4 寻找链表的倒数第n个元素

[题目](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/submissions/)       [解答](./RemoveNthFormEnd.java)       [参考文章](https://mp.weixin.qq.com/s/Nh6jxQtO-xOT_WuX-B5w3Q)

> 如果链表的长度大于n，快节点比慢节点快n个节点，快节点到达末尾时，满节点在倒数第n个