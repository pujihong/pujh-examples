package com.hewei.java.lru;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * 使用LinkedHashMap
 */
public class LruCache1 {
    private static LinkedHashMap<Integer, Integer> cache;
    private static int capacity;

    public static int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        } else {
            int value = cache.get(key);
            cache.remove(key);
            cache.put(key, value);
            return value;
        }
    }

    public static void put(int key, int value) {
        cache.remove(key);
        if (capacity == cache.size()) {
            Set<Integer> keySet = cache.keySet();
            Iterator<Integer> iterator = keySet.iterator();
            cache.remove(iterator.next());
        }
        cache.put(key, value);
    }
}
