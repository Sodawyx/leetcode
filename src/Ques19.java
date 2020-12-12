/**
 * <h3>leetcode</h3>
 * <p>删除链表的倒数第N个节点</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-12-12 13:05
 **/
public class Ques19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        if ((length(head) - n) == 0) return head.next;
        for (int i = 0; i < length(head) - n - 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;


    }

    public int length(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len ++;
        }
        return len;
    }

    //快慢指针法
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) { //这里要注意一下走几步
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
