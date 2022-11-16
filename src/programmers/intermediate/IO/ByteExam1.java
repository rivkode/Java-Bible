package programmers.intermediate.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("src/programmers/intermediate/IO/1.txt");
            fos = new FileOutputStream("byte.txt");

            int readData = -1;
            while((readData = fis.read())!= -1){
                fos.write(readData);
                System.out.println(readData);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }
}
