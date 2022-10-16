package backjoon;

import java.util.Scanner;

public class b4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int cnt = 0;

            for(int i=n+1; i<=2*n; i++) {
                if(isPrime(i)) {
                    cnt ++;
                }
            }System.out.println(cnt);

        }
    }

    public static boolean isPrime(int Number) {
        if(Number == 1) {
            return false;
        }

        for (int i=2; i<=Math.sqrt(Number); i++) {
            if(Number%i == 0) return false;
        }
        return true;
    }



}
