package com.hewei.jvm.jvmTools;

/**
 * linux 上 top命令，可见cpu占用飘升
 */
public class DeadLoop {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Dead loop");
        }
    }
}
