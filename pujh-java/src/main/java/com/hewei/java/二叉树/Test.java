package com.hewei.java.二叉树;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
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
//层次： 6, 3, 9, 1, 5, 7, 2, 4, 8

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String inOrder = str.split(" ")[0];
        String postOrder = str.split(" ")[1];
        // 1、根据后序序列的最后一个元素建立根结点；
        String rootVal = postOrder.substring(postOrder.length() - 1);
        Node root = new Node(rootVal, null, null);
        // 2、 在中序序列中找到该元素，确定根结点的左右子树的中序序列；
        int rootInIndex = inOrder.indexOf(rootVal);
        buildTree(inOrder.split(rootVal)[0], 0, rootInIndex - 1, inOrder.split(rootVal)[1], rootInIndex + 1, inOrder.split(rootVal)[1].length() - 1);
    }

    public static Node buildTree(String inOrder, int inBegin, int inEnd, String postOrder, int postBegin, int postEnd) {
          return null;
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

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
