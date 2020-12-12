/**
 * <h3>leetcode</h3>
 * <p>合并两个有序链表</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-12-12 14:59
 **/
public class Ques21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode merge = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                merge.next = l1;
                merge = merge.next;
                l1 = l1.next;
            } else {
                merge.next = l2;
                merge = merge.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            merge.next = l2;
        } else if (l2 == null) {
            merge.next = l1;
        }
        return  head.next;
    }

    //递归法解决问题
    public ListNode mergeTwoListsR(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val > l2.val) {
            l2.next = mergeTwoListsR(l1, l2.next);
            return l2;
        } else {
            l1.next = mergeTwoListsR(l1.next, l2);
            return l1;
        }
    }
}
