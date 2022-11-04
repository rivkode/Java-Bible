package 재귀함수;

import java.util.Scanner;

public class c1902 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        recursive(in.nextInt());
    }

    public static void recursive(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        recursive(num-1);
    }
}
