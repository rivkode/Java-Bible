package Stack;

import java.util.Scanner;
import java.util.Stack;

public class c1402 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(int i=0; i<num; i++) {
            stack.push(in.nextInt());
        }

        for(int i=0; i<num; i++) {
            int pop = stack.pop();
            System.out.println(pop);
        }
    }
}
