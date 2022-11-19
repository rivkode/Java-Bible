package programmers.intermediate.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FioCloseException {
    public static void fioCloseException(FileOutputStream fos) throws IOException{
        try {
            fos.close();
        } catch (IOException e) {
            throw new IOException();
        }
    }
}
