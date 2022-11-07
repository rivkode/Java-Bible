package Basic_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class b2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        StringBuffer sb = new StringBuffer();

        ArrayList<Integer> lst = new ArrayList<>();

        for(int i=0; i<cnt; i++) {
            lst.add(sc.nextInt());
        }

        Collections.sort(lst);

        for(int value : lst) {
            sb.append(value).append("\n");
        }
        System.out.println(sb);
    }
}
