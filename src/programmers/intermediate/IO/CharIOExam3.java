package programmers.intermediate.IO;

import java.io.*;

public class CharIOExam3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter pw = null;

        br = new BufferedReader(new FileReader("src/programmers/intermediate/IO/CharIOExam3.java"));
        pw = new PrintWriter(new FileWriter("test1.txt"));
    }
}
