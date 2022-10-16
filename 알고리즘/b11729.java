package backjoon;

import java.io.*;
import java.util.Scanner;

public class b11729 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num;
        num = sc.nextInt();
        hanoi(1, 2, 3, num);
        System.out.println(result);
        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    static int result;
    public static void hanoi(int from, int m, int to, int num) {
        if(num == 0)
            return;
        hanoi(from, to, m, num - 1);
        result ++;
        sb.append(from).append(" ").append(to).append("\n");
        // System.out.printf("%d %d\n",from, to);
        hanoi(m, from, to, num - 1);
    }
}
