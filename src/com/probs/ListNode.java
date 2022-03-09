package com.probs;

//Definition for singly-linked list

//{1,2 3, 3, 4,4,5}
public class ListNode implements Cloneable {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5};
        ListNode nodeList = formListNode(arr);
        try {
            showNodes((ListNode) nodeList.clone());
            deleteDuplicates((ListNode) nodeList.clone());
            showNodes((ListNode) nodeList.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static ListNode formListNode(int[] arr) {
        ListNode listNode = new ListNode();
        listNode.val = arr[0];
        ListNode curr = listNode;
        for (int i = 1; i < arr.length; i++) {
            ListNode listNode1 = new ListNode();
            listNode1.val = arr[i];
            curr.next = listNode1;
            curr = listNode1;
        }
        return listNode;
    }

    private static void showNodes(ListNode nodeList) {
        while (null != nodeList) {
            System.out.print(nodeList.val);
            if (null != nodeList.next) {
                System.out.print(", ");
            }
            nodeList = nodeList.next;
        }
        System.out.println();
    }

    public static void deleteDuplicates(ListNode head) {
        //{1,2 3, 3, 4,4,5}
        ListNode previous = null;
        ListNode current = head;
        ListNode next = head.next;

        while (null != next) {
            if (current.val == next.val) {
                ListNode temp = next.next;
                current.next = temp;
                next = temp;
            }
            previous = current;
            current = next;
            next = next.next;
        }
    }
}

