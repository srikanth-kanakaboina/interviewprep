package leetcode;

import leetcode.listnode.ListNode;

import java.util.List;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        ListNode list2=new ListNode(2);
        ListNode list3=new ListNode(3);
        ListNode list4=new ListNode(4);
        list.setNext(list2);
        list2.setNext(list3);
        list3.setNext(list4);
        list4.setNext(null);

        System.out.println(middleNode(list).val);

    }

    public static  ListNode middleNode(ListNode head) {
        ListNode slow_node=head,fast_node=head;
        while (fast_node != null && fast_node != null){
            slow_node=slow_node.next;
            fast_node=fast_node.next.next;
            head=head.next;
        }
        return slow_node;
    }
}
