package com.hewei.java.二叉树;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 1、23号华为机试第三题
 * 根据中序喝后续 求层次遍历
 * 思路
 * 1. 根据后序序列的最后一个元素建立根结点；
 * 2. 在中序序列中找到该元素，确定根结点的左右子树的中序序列；
 * 3. 在后序序列中确定左右子树的后序序列；
 * 4. 由左子树的后序序列和中序序列建立左子树；
 * 5. 由右子树的后序序列和中序序列建立右子树。
 */
//前序： 631254978
//中序： 123456789
//后序： 214538796
//层次： 639157248

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // 输入中序喝后序 空格隔开
        String str = in.readLine();
        String inOrder = str.split(" ")[0];
        String postOrder = str.split(" ")[1];
        if (inOrder.length() != postOrder.length()) {
            return;
        }
        System.out.print("前序: ");
        Node root = buildTree(inOrder, 0, inOrder.length() - 1, postOrder, 0, postOrder.length() - 1);
        System.out.println();
        if (root != null) {
            System.out.print("层次: ");
            printLevelOrder(root);
        }
    }

    public static Node buildTree(String inOrder, int inBegin, int inEnd, String postOrder, int postBegin, int postEnd) {
        if (inBegin > inEnd || postBegin > postEnd) {
            return null;
        }
        String rootVal = postOrder.substring(postEnd, postEnd + 1);
        System.out.print(rootVal);
        Node root = new Node(rootVal, null, null);
        int i = inOrder.indexOf(rootVal);
        root.left = buildTree(inOrder, inBegin, i - 1, postOrder, postBegin, postBegin + i - inBegin - 1);
        root.right = buildTree(inOrder, i + 1, inEnd, postOrder, postEnd - inEnd + i, postEnd - 1);
        return root;
    }

    public static void printLevelOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node n = queue.poll();
                if (n != null) {
                    System.out.print(n.val);
                    if (n.left != null) {
                        queue.add(n.left);
                    }
                    if (n.right != null) {
                        queue.add(n.right);
                    }
                }
            }
        }
    }

    public static class Node {
        private String val;
        private Node left;
        private Node right;

        public Node(String val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
