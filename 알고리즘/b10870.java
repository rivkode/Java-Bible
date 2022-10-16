package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class b10870 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        lst.add(0);
        lst.add(1);

        for (int i=2; i<=20; i++) {
            lst.add(i, lst.get(i - 1) + lst.get(i - 2));
        }
        System.out.println(lst.get(n));
    }
}