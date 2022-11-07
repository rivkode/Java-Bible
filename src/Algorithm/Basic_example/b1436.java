package Basic_example;

import java.util.Scanner;

public class b1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 666;
        int cnt = 1;
        while(cnt != n) { /**원하는 번째수의 종말숫자일때까지 반복*/
            num ++;
            if(String.valueOf(num).contains("666")) { /** 666을 포함하였는가 ?*/
                cnt ++; // 포함하였을 경우에만 1증가
            }
        }
        System.out.println(num);
    }
}