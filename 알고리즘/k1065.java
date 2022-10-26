import java.util.Scanner;

public class k1065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int i=0; i<3; i++) {
            even(in.nextInt());
        }

    }

    public static void even(int i) {
        if(i%2==0) {
            System.out.println(i);
        }
    }
}
