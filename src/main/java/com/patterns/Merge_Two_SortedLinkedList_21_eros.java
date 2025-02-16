package com.patterns;

import com.leetcode.ListNode;

public class Merge_Two_SortedLinkedList_21_eros {
    public static void main(String[] args) {
        ListNode odd = new ListNode(1,
                new ListNode(3,
                        new ListNode(5,
                                new ListNode(7))));
        ListNode even = new ListNode(2,
                new ListNode(4,
                        new ListNode(6,
                                new ListNode(8))));

        Merge_Two_SortedLinkedList_21_eros leet = new Merge_Two_SortedLinkedList_21_eros();
        ListNode fullList = leet.mergeTwoLists(odd, even);
        System.out.println(fullList.toString());

    }

    private ListNode mergeTwoLists(ListNode odd, ListNode even) {
        ListNode fakeHead = new ListNode(-9999);
        ListNode current = fakeHead;
        while(odd != null && even != null){
            if(odd.getVal() < even.getVal()){
                current.setNext(odd);
            }else{

            }
        }
        return fakeHead.getNext();
    }


}