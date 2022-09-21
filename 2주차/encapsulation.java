class Time {
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        if (isValidHour(hour)) return;

        this.hour = hour;
    }

    //매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    private boolean isValidHour(int hour) {
        return hour <0 || hour >23;
    }

    public int getHour() {return hour;} ;
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
        // t.hour= -100; // 에러, hour는 time클래스의 private로 설정되어있으므로 외부에서 접근할 수 없음
        t.setHour(21); // hour값을 21로 변경, setHour 메서드(public)는 time클래스 내부 메서드이므로 hour접근 가능
        System.out.println(t.getHour()); // getHour메서드는 public이므로 외부에서 접근 가능
        t.setHour(100);
    }
}// 즉 변수와 메소드를 하나의 단위로 묶는 것, 해당 클래스의 인스턴스를 생성하여 해당 클래스에 포함된 메소드를 통해 변수를 제어함