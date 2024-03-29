package BOJ.solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1373_v2 {
    // 2진수 8진수로 변환하기
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String str = br.readLine();
        int len = str.length();

        if (len % 3 == 1) {
            sb.append(str.charAt(0));
        }

        if (len % 3 == 2) {
            sb.append(((str.charAt(0)-'0') * 2) + (str.charAt(1)-'0'));
        }

        for (int i = len % 3; i < len; i += 3) {
            sb.append(
                    ((str.charAt(i)-'0') * 4)
                    + ((str.charAt(i+1)-'0') * 2)
                    + (str.charAt(i+2)-'0')
            );
        }

        System.out.println(sb);
    }
}
