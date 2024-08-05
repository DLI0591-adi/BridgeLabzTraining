package Day4.LinkedList;

// Java Program to Merge Two Sorted
// Linked Lists in New List
// Iteratively

import java.io.*;



class MergeTwoLL {
    static class ListNode {

        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next)
        {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1,
                                         ListNode l2)
    {

        ListNode result = new ListNode(-1);
        ListNode p = result;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
            }

            else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 == null) {
            p.next = l2;
        }

        else if (l2 == null) {
            p.next = l1;
        }

        return result.next;
    }

    static void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(0);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(4);
        ListNode mergedhead = mergeTwoLists(head1, head2);

        printList(mergedhead);
    }
}
