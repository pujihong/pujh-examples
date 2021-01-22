package com.hewei.华为真题.举办聚会;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * 办一场8小时的聚会，时间段从12：00到20：00点，让来访的客人事先填好到达的时间和离开的时间，为了掌握聚会期间的座位数目，需要先估计不同时间的最大客人数量。
 * 1.到达和离开的时间，以整点计算，输入为整数，比如“12，18”表示客人到达的时间为12点后13点前，离开的时间是17点后18点前。
 * 2.按小时区间统计客人的数量，需要统计[12，13),[13,14)….[19，20)共有8个时间段的最大客人数量。
 * 3.假设邀请的客人最多100个。
 * 假设输入：
 * <p>
 * 12,15
 * 16,17
 * 12,20
 * 1
 * 2
 * 3
 * 程序要求的输出结果为：
 * <p>
 * [12,13):2
 * [13,14):2
 * [14,15):2
 * [15,16):1
 * [16,17):2
 * [17,18):1
 * [18,19):1
 * [19,20):1
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        int start = 12;
        int end = 20;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            int pNum = Integer.parseInt(str);
            Map<Integer, Integer> map = new TreeMap<>();
            for (int i = start; i < end; i++) {
                map.put(i, 0);
            }
            for (int i = 0; i < pNum; i++) {
                String s = in.readLine();
                int num1 = Integer.parseInt(s.split(",")[0]);
                int num2 = Integer.parseInt(s.split(",")[1]);
                if (num1 < start || num2 > end || num1 >= num2) {
                    System.out.println(-1);
                    break;
                }
                for (int j = num1; j < num2; j++) {
                    if (map.containsKey(j)) {
                        map.put(j, map.get(j) + 1);
                    }
                }
            }
            for (Integer key : map.keySet()) {
                System.out.println("[" + key + "," + (key + 1) + "):" + map.get(key));
            }
        }
    }
}
