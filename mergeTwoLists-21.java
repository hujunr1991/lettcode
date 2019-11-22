public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //借鉴官方的写法，采用报纸的自顶向下的方式，先各自判断为空的情况，在各自比较大小
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        //首先都是有序的链表，如果链表2的元素大于链表1，则从链表1 开始，同时取链表1的下一个元素进行比较
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
        
    }
}