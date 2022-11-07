package Basic_example;

import java.util.Scanner;

public class c1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ballGame(in.nextDouble());
    }

    public static void ballGame(Double i) {
        if(i>=50 & i<=60) {
            System.out.println("win");
        }
        else {
            System.out.println("lose");
        }
    }
}
