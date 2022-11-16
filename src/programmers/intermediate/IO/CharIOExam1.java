package programmers.intermediate.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /**
         * System.in 을 바로 쓸 수가 없음 왜냐하면 reader 타입만 사용할 수 있으므로
         * inputStream인 system.in을 reader 타입으로 바꿔야 함
         * 키보드로부터 한줄씩 입력 받을 수 있음
         */

//        String line = br.readLine(); readline은 thorws IO예외를 하고 있음
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
//            throw new RuntimeException(e); // 자동생성
            e.printStackTrace(); // 왜 똑같이 안되지 ?
        }
        System.out.println(line);
    }
}
