import java.util.ArrayList;
import java.util.Scanner;

public class b11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> pmLst = new ArrayList<>();
//        ArrayList<Integer> numLst = new ArrayList<>();

        int n = sc.nextInt();
//        int share; 몫을 사용하려 했으나 더 좋은 방법이 있었다


        for (int i=2; i<= Math.sqrt(n); i++) {
            while (n%i == 0) {
                System.out.println(i);
                n = n/i;
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
//
//
//
//        for (int i=2; i<n; i++) {
//            if (n%i == 0) {
//                pmLst.add(i);
//            }
//        }
//
//        for (int j:pmLst) { 몫을 사용하여 그 값을 리스트에 넣어주고
//            share = n / j;
//            for (int i=0; i<share; i++) {
//                numLst.add(j);
//            }
//            n = n/(j*share); 그 수만큼 나눠주어 리셋한 뒤 다시 소수를 찾아 계산하려 하였으나 더 좋은 exception 오류가 떳다
//        } 더 좋은 알고리즘이 있어서 참고하였다


     }
}
