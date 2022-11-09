package programmers.intermediate.time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class CalendarExam {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int yyyy = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);

        /**
         * 만약 100일 후의 시간과 날짜를 구하고 싶다면?
         */

        String s = yyyy+"년"+month+"월"+date+"일"+hour+"시간"+minute+"분";

        cal.add(Calendar.DATE, 100);
        System.out.println(s);

        LocalDate currDate = LocalDate.now();
//        LocalDate targetDate = LocalDate.of(int year, int month, int dayOfMonth);
        LocalTime currTime = LocalTime.now();

        System.out.println(currDate);

        System.out.println(currTime);
        LocalDateTime currDateTime = LocalDateTime.now();
        System.out.println(currDateTime);
    }
}
