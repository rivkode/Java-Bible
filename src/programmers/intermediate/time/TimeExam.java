package programmers.intermediate.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);

        LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 25);
        System.out.println(ld1);

        /**
         * 시간만 가지는 객체
         */
        LocalTime lt1 = LocalTime.of(17, 18);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.parse("10:15:30");
        System.out.println(lt2);

        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(theDate);
        System.out.println(timePoint.getMonth());

        Month month = timePoint.getMonth();
        System.out.println(month.getValue());
        /**
         * timePoint를 통해 getter메소드를 가지고 다양한 값들을 얻어낼 수 있다.
         */
    }
}
