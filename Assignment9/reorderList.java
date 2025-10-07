package Assignment9;

class Solution {
    public void reorderList(ListNode head) {
        if (head == null) return;

       
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

     
        ListNode second = slow.next;
        slow.next = null;
        ListNode node = null;

        while (second != null) {
            ListNode temp = second.next;
            second.next = node;
            node = second;
            second = temp;
        }

      
        ListNode first = head;
        second = node;

        while (second != null) {
            ListNode temp1 = first.next, temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }        
    }
}

/*
 * Time Complexity: O(n)
 * - We traverse the list to find the middle, reverse the second half, and compare both halves.

 * Space Complexity: O(1)
 * - All operations are done in-place with constant extra space.
 */