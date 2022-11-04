package 재귀함수;

import java.util.Scanner;

public class c1905 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = add(in.nextInt());
        System.out.println(result);

    }

    public static int add(int num) {
        if(num == 0) {
            return num;
        }
        return add(num - 1);
    }
}

/**
 *더한 값을 어떻게 계속 유지하여 마지막 한 번만 출력할 것인지 고민해보기
 */