/**
 * <h3>leetcode</h3>
 * <p>两数相加</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-09-24 23:07
 **/
public class Ques2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
         val = x;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int carry = 0;
        int x = 0;
        int y = 0;
        int sum = 0;
        ListNode result = new ListNode(0);
        ListNode cur = result;
        while (l1 != null || l2 != null){
            if (l1 == null){
                x = 0;
            } else {
                x = l1.val;
            }

            if (l2 == null){
                y = 0;
            } else {
                y = l2.val;
            }
            sum = x + y + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry != 0) {
            cur.next = new ListNode(carry);
        }

        return result.next;
    }
}
