package Basic_example;

import java.util.ArrayList;
import java.util.Scanner;

public class c1403 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>();

        int num = in.nextInt();


        for(int i=0; i<num; i++) {
            lst.add(in.nextInt());
        }

        printLst(num, lst);
        printLst(num, lst);
    }

    public static void printLst(int num, ArrayList<Integer> lst) {
        for(int i=0; i<num; i++) {
            System.out.println(lst.get(i));
        }
    }
}
