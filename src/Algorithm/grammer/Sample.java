package grammer;

import java.util.Scanner;

public class Sample {
    private String secret;

    private String getSecret() {
        return this.secret;
    }

    private void setSecret(String secret) {
        this.secret = secret;
    }

    public static void main(String[] args) {
        Sample sample = new Sample();

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        sample.setSecret(input);
        String var = sample.getSecret();
        System.out.println(var);
    }
}
