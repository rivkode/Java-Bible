package bruteForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class c2001 {
    Scanner in = new Scanner(System.in);
    public int p1 = in.nextInt();
    public int p2 = in.nextInt();
    public int p3 = in.nextInt();
    public int f1 = in.nextInt();
    public int f2 = in.nextInt();

    public static void main(String[] args) {
        c2001 c2001 = new c2001();
        ArrayList<Integer> pasta = new ArrayList<>();
        ArrayList<Integer> juice = new ArrayList<>();
        pasta.add(c2001.p1);
        pasta.add(c2001.p2);
        pasta.add(c2001.p3);
        juice.add(c2001.f1);
        juice.add(c2001.f2);

        int pmin = Collections.min(pasta);
        int jmin = Collections.min(juice);
        int result = pmin + jmin;
        float f_result = (float)result;
        f_result *= 1.1;
        System.out.println(f_result);
    }
}
