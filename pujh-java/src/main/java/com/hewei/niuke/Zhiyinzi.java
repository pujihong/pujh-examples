package com.hewei.niuke;

public class Zhiyinzi {
  /*  public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        long n;
        StringBuilder sb;
        while ((s = br.readLine()) != null) {
            n = Long.parseLong(s);
            sb = new StringBuilder();
            for (int i = 2; i * i <= n; i++) {
                if (0 == n % i) {
                    sb.append(i).append(' ');
                    n = n / i;
                    i--;
                }
            }
            sb.append(n).append(' ');
            System.out.println(sb.toString());
        }
    }
*/

    // 质数
    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        } else {
            int a = (int) Math.sqrt(n);
            for (int i = 2; i <= a; i++ ) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (prime(i)) {
                System.out.println(i);
            }
        }
    }
}