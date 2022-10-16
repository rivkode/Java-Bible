package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] lst = new int[n][2]; // 2칸의 2차원 배열 생성

        for (int i=0; i<n; i++) {
            lst[i][0] = sc.nextInt(); // 각각 자리에 input 받기
            lst[i][1] = sc.nextInt();
        }

        Arrays.sort(lst, (lst_1, lst_2) -> {
            if(lst_1[1] == lst_2[1]) { // 람다식으로 첫번째 원소가 같으면 Arrays.sort를 통해 x좌표가 증가하는 순, y좌표가 증가하는 순으로 정렬한다.
                return lst_1[0] - lst_2[0];
            }
            else {
                return lst_1[1] - lst_2[1];
            }
        });

        for(int i=0; i<n; i++) {
            System.out.println(lst[i][0] + " "+ lst[i][1]);
        }
    }
}
