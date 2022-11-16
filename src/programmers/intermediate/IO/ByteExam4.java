package programmers.intermediate.IO;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam4 {

    public static void main(String[] args) {
        try (
                DataInputStream in = new DataInputStream(new FileInputStream("data.txt"))
                /**
                 * data를 읽어들여야 하기 때문에 inputStream 객체를 생성하고 어떤 파일을 받아들일지를 정해준다.
                 */
                ) {
            int i = in.readInt(); // FileInputStream의 read 메서드를 통해서 file을 읽어들임
            boolean b = in.readBoolean();
            double d = in.readDouble();
            /**
             * 그럼 항상 위와같이 순서를 맞춰 읽어야만 하나 ??
             */

            System.out.println(i);
            System.out.println(b);
            System.out.println(d);
            /**
             * 데이터타입 자체로 저장하고 해당 데이터 타입으로 불러내어 출력을 하면 눈으로 볼 수 있도록 출력됨
             */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
