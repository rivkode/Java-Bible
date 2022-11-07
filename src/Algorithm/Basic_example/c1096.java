package Basic_example;

import java.util.ArrayList;
import java.util.Scanner;

public class c1096 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        ArrayList<Integer>[] numLst = new ArrayList[19];

        for(int i=0; i<19; i++) {
            numLst[i] = new ArrayList<>();
            for(int j=0; j<19; j++) {
                numLst[i].add(j, 0);
            }
        }


        for(int i=0; i<count; i++) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            numLst[num1-1].add(num2-1, 1);
        }

        for(int i=0; i<19; i++) {
            for(int j=0; j<19; j++) {
                System.out.print(numLst[i].get(j)+" ");
            }
            System.out.println("");
        }

    }
}
