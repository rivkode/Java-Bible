package Basic_example;

import java.util.ArrayList;
import java.util.Scanner;

public class b7568 {
    public static void main(String[] args) {
        ArrayList<Integer[]> lst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            lst.add(new Integer[]{a, b});
        }

        for( int i=0; i<n; i++) {
            int rank = 1;

            for(int j=0; j<n; j++) {
                if(i==j) continue;
                if(lst.get(i)[0] < lst.get(j)[0] && lst.get(i)[1] < lst.get(j)[1]) {
                    rank++;
                }
            }
            System.out.printf(rank+ " ");
        }
    }
}
