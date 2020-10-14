package com.hewei.两数相加;

/**
 * 给出两个非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0开头。
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // 第一次读题被题带偏了，题目的原因其实不用管他，只需要将两个链表对位的节点加起来，
    // 要考虑进位和补0的问题,多画图理解
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 是否需要进位
        boolean b = false;
        // 创建首节点和动态节点
        ListNode first = null, node = null;
        int val;
        while (l1 != null || l2 != null) {
            // 第一条链表的节点的值
            int x = l1 == null ? 0 : l1.val;
            // 第二条链表的节点的值
            int y = l2 == null ? 0 : l2.val;
            // 对应节点相加的值并判断是否有进位
            int sum = b ? x + y + 1 : x + y;
            // 当前对应节点相加是否要进位
            b = sum >= 10;
            val = sum % 10;
            if (first == null) {
                first = node = new ListNode(val);
            } else {
                node.next = new ListNode(val);
                node = node.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (b) {
            node.next = new ListNode(1);
        }
        return first;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode l2 = new ListNode(9, new ListNode(9));
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
