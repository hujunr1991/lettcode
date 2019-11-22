public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //����ٷ���д�������ñ�ֽ���Զ����µķ�ʽ���ȸ����ж�Ϊ�յ�������ڸ��ԱȽϴ�С
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        //���ȶ�������������������2��Ԫ�ش�������1���������1 ��ʼ��ͬʱȡ����1����һ��Ԫ�ؽ��бȽ�
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