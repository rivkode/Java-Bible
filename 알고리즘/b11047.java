import java.util.Scanner;

public class b11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int[] coin = new int[num1];

        for(int i=0; i<num1; i++) {
            coin[i] = sc.nextInt();
        }

        int result = 0;

        for(int i=num1-1; i>=0; i--) {
            if(coin[i] <= num2) {
                result += (num2 / coin[i]);
                num2 = (num2 % coin[i]);
            }
        }

        System.out.println(result);
    }

}
