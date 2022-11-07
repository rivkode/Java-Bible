package recursive_function;

import java.util.Scanner;

public class c1905 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        add(in.nextInt());
    }

    public static void add(int num) {
        int result = num + num-1;

        if(num == 0) {
            System.out.println(result);
            return;
        }
        add(num - 1);
    }
}

/**
 *더한 값을 어떻게 계속 유지하여 마지막 한 번만 출력할 것인지 고민해보기
 */