package Basic_example;

import java.util.ArrayList;
import java.util.Scanner;

public class b2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lst1 = new ArrayList<>();

        for(int i=0; i<9; i++) {
            lst1.add(in.nextInt());

        }

        int max1 = lst1.get(0);
        for(int i=0; i<9; i++) {
            if(lst1.get(i)>max1) {
                max1 = lst1.get(i);
            }
        }


        System.out.println(max1);
        System.out.println(lst1.indexOf(max1)+1);
    }
}