package com.hewei.华为真题.磁盘的容量;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * 磁盘的常用单位有M，G,T这三个等级，它们之间的换算关系是1T=1000G,1G=1000M,现在给定n块磁盘的容量，
 * 请对他们按从小到大的顺序进行排序，例如给定三块盘的容量，1T,20M,3G。排序后的结果为20M,3G,1T
 * <p>
 * 输入描述：
 * 1.每个测试用例第一行包含一个整数n（2=<n=<1000）,表示磁盘的个数。接下来的n行，每行一个字符串（长度大于2，小于10）,表示磁盘的容量。
 * 格式为mv，其中m为容量大小，v表示容量单位。例如，10M，1T，30G
 * 2.磁盘容量m表示十进制数范围1到1000的正整数。v的范围只包含M、G、T三种
 * 输出n行
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            int num = Integer.parseInt(str);
            String[] strArr = new String[num];
            Map<String, Integer> map = new TreeMap<>();
            for (int i = 0; i < num; i++) {
                String s = in.readLine();
                String type = s.substring(s.length() - 1);
                int val = Integer.parseInt(s.substring(0, s.length() - 1));
                if ("G".equals(type)) {
                    val = val * 1000;
                }
                if ("T".equals(type)) {
                    val = val * 1000 * 1000;
                }
                strArr[i] = s;
                map.put(val + "" + i, i); // 重复数据去重
            }
            for (Integer val : map.values()) {
                System.out.println(strArr[val]);
            }
        }
    }
}
