package Basic_example;

import java.util.Scanner;

public class c1160 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        partTime(in.nextInt());

    }

    public static void partTime(int i) {
        if(i==1 || i==3 || i==5 || i==7) {
            System.out.println("oh my god");
        }
        else {
            System.out.println("enjoy");
        }
    }
}
