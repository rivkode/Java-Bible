import java.util.Scanner;

public class c1116 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.printf("%d+%d=%d\n",a, b, a+b);
        System.out.printf("%d-%d=%d\n",a, b, a-b);
        System.out.printf("%d*%d=%d\n",a, b, a*b);
        System.out.printf("%d/%d=%d",a, b, a/b);

    }
}
