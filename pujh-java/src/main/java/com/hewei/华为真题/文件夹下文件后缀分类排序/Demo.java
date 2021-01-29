package com.hewei.华为真题.文件夹下文件后缀分类排序;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*8
遍历目录下的文件，并按后缀分类，排序
 */
public class Demo {

    public static void main(String[] args) {
        Map<String, List<String>> map = new TreeMap<>();
        File file = new File("G:\\");
        List<String> res = new ArrayList<>();
        List<String> list = getFIleNames(file, res);
        String type;
        for (String fileName : list) {
            if (fileName.contains(".")) {
                type = fileName.substring(fileName.lastIndexOf(".") + 1);
                if (!map.containsKey(type)) {
                    map.put(type, new ArrayList<>());
                }
                map.get(type).add(fileName);
            }
        }
        System.out.println(map);
    }

    public static List<String> getFIleNames(File file, List<String> res) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    res.add(f.getName());
                } else {
                    getFIleNames(f, res);
                }
            }
        }
        return res;
    }
}
