package programmers.intermediate.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FisCloseException {
    public static void fisCloseException(FileInputStream fis) throws IOException{
        try {
            fis.close();
        } catch (IOException e) {
            throw new IOException();
        }
    }
}
