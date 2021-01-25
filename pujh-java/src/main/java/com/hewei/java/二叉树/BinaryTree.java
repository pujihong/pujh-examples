package com.hewei.java.二叉树;

import java.util.*;

/**
 * 前序  跟节点 -- 左节点 -- 右节点
 * 中序  左节点 -- 根节点 -- 右节点
 * 后续  左节点 -- 右节点 -- 根节点
 */
//前序： 631254978
//中序： 123456789
//后序： 214538796
public class BinaryTree {

    public static Node init() {
        Node I = new Node(8, null, null);
        Node H = new Node(4, null, null);
        Node G = new Node(2, null, null);
        Node F = new Node(7, null, I);
        Node E = new Node(5, H, null);
        Node D = new Node(1, null, G);
        Node C = new Node(9, F, null);
        Node B = new Node(3, D, E);
        Node A = new Node(6, B, C);
        return A;
    }

    public static void main(String[] args) {
        Node root = init();
        System.out.print("前序： ");
        preOrder(root);
        System.out.println("");
        System.out.print("中序： ");
        inOrder(root);
        System.out.println("");
        System.out.print("后序： ");
        postOrder(root);
        System.out.println("");
        System.out.print("层次： ");
        levelOrder(root);
    }

    public static void printNode(Node node) {
        System.out.print(node.getData());
    }

    /**
     * 前序遍历
     *
     * @param root
     */
    private static void preOrder(Node root) {
        printNode(root);
        if (root.getLeftNode() != null) {
            preOrder(root.getLeftNode());
        }
        if (root.getRightNode() != null) {
            preOrder(root.getRightNode());
        }
    }

    /**
     * 中序遍历
     *
     * @param root
     */
    public static void inOrder(Node root) {
        if (root.getLeftNode() != null) {
            inOrder(root.getLeftNode());
        }
        printNode(root);
        if (root.getRightNode() != null) {
            inOrder(root.getRightNode());
        }
    }

    /**
     * 后续遍历
     *
     * @param root
     */
    public static void postOrder(Node root) {
        if (root.getLeftNode() != null) {
            postOrder(root.getLeftNode());
        }
        if (root.getRightNode() != null) {
            postOrder(root.getRightNode());
        }
        printNode(root);
    }

    /**
     * 层次遍历 leetcode 102
     * bfs (广度优先搜索)
     *
     * @param root
     */
    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node != null) {
                    arr.add(node.data);
                    if (node.leftNode != null) {
                        queue.add(node.leftNode);
                    }
                    if (node.rightNode != null) {
                        queue.add(node.rightNode);
                    }
                }
            }
        }
        System.out.println(arr);
    }

    private static class Node {
        private int data;
        private Node leftNode;
        private Node rightNode;

        public Node(int data, Node leftNode, Node rightNode) {
            this.data = data;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }
    }
}
