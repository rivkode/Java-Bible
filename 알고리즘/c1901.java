import java.util.Scanner;

public class c1901 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        recursive(in.nextInt());
    }

    public static void recursive(int num) {
        if(num == 0) {
            return;
        }
        recursive(num-1);
        System.out.println(num);
    }
}
