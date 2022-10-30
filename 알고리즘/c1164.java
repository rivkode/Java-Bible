import java.util.Scanner;

public class c1164 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int i=0; i<3; i++) {
            if(gothrough(in.nextInt())) {
                System.out.println("CRASH");
                System.exit(0); /** 프로그램 종료해버리기 */
            }
        }
        System.out.println("PASS"); /** 위 사항들이 진행되지 않으면 마지막에 출력 */

    }

    public static boolean gothrough(int i) {
        if(i>170) {
            return false;
        }
        return true;
    }
}
