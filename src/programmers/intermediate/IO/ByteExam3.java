package programmers.intermediate.IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {
    public static void main(String[] args) {
        try (
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
        ) {
            out.writeInt(100); // 정수를 저장할 경우 4bytes
            out.writeBoolean(true); // boolean을 저장할 경우 1byte
            out.writeDouble(1.123); // double을 저장할 경우 8bytes

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
