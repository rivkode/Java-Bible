import java.util.ArrayList;
import java.util.Scanner;

public class c1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        ArrayList<Integer> studentLst = new ArrayList<>(23);
        ArrayList<Integer> numLst = new ArrayList<>(count);




        for(int i=0; i<count; i++) {
            studentLst.add(sc.nextInt());
        }

        for(int i=0; i<23; i++) {
            numLst.add(0);
        }

        for(int i=0; i<count; i++) {
            int tmp = numLst.get(studentLst.get(i)-1);
            tmp += 1;
            numLst.set(studentLst.get(i)-1, tmp);
        }

        for(int i: numLst){
            System.out.print(i+" ");
        }
    }
}

