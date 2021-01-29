package com.hewei.java.lru;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 最近最少使用的值
 */
public class LruCache {
    private static LinkedList<Node> cache;
    private static int capacity;

    public LruCache(int capacity) {
        cache = new LinkedList<>();
        capacity = capacity;
    }

    public static int get(int key) {
        Iterator<Node> iterator = cache.iterator();
        int res = -1;
        while (iterator.hasNext()) {
            Node node = iterator.next();
            if (node.key == key) {
                res = node.value;
                iterator.remove();
                cache.add(new Node(key, res));
            }
        }
        return res;
    }

    public static void put(int key, int value) {
        Iterator<Node> iterator = cache.iterator();
        while (iterator.hasNext()) {
            Node node = iterator.next();
            if (node.key == key) {
                iterator.remove();
                break;
            }
        }
        if (capacity == cache.size()) {
            cache.removeFirst();
        }
        cache.add(new Node(key, value));
    }


    static class Node {
        int key;
        int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
