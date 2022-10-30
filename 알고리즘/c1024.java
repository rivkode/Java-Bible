import java.util.Scanner;

public class c1024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String w = in.next();

        for(int i=0; i<w.length(); i++) {
            System.out.print("'"+w.charAt(i)+"'"+"\n");
        }
    }
}
