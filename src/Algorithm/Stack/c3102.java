package Stack;

import java.util.Scanner;
import java.util.Stack;

public class c3102 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int reNum = sc.nextInt();

        for(int i=0; i<reNum; i++) {
            String content = sc.next();
            int idx = content.indexOf("(");
            String command = content.substring(0, idx);

            switch (command) {
                case "top":
                    System.out.println(stack.peek());
                    break;
                case "pop":
                    stack.pop();
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "push":
                    System.out.println(command);
                    System.out.println(idx);
                    System.out.println(content);
                    String num = content.substring(idx + 1, idx + 2);
                    int Num = Integer.parseInt(num);
                    stack.push(Num);
                    break;
            }
        }

    }
}
