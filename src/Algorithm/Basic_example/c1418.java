package Basic_example;

import java.util.ArrayList;
import java.util.Scanner;

public class c1418 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>();

        String w = in.next();

        char t = 't';

        for(int i=0; i<w.length(); i++) {
            if(w.charAt(i) == t) {
                System.out.print(i+1+" ");
            }
        }

    }
}
