package org.my.app.methods;

import org.my.app.list_node.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.getVal() < list2.getVal()) {
                current.setNext(list1);
                list1 = list1.getNext();
            } else {
                current.setNext(list2);
                list2 = list2.getNext();
            }
            current = current.getNext();
        }

        if (list1 != null) {
            current.setNext(list1);
        } else {
            current.setNext(list2);
        }
        return dummy.getNext();
    }

}
