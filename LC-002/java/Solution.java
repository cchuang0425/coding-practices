public class Solution {
    
    private static final ListNode EMPTY = new ListNode(-1);

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(5);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.printf("result = [%1$d, %2$d]", result.val, result.next.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);

        return cal(result, result, l1, l2);
    }

    private static ListNode cal(ListNode result, ListNode position, ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return result;
        } else if (l1 == null) {
            return cal(result, position, new ListNode(0), l2);
        } else if (l2 == null) {
            return cal(result, position, l1, new ListNode(0));
        } else {
            int value = l1.val + l2.val + position.val;
            int carry = value / 10;
            value = value % 10;

            position.val = value;

            if (l1.next != null || l2.next != null || carry > 0) {
                position.next = new ListNode(carry);
            } else {
                position.next = null;
            }

            return cal(result, position.next, l1.next, l2.next);
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}