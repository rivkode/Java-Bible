package JavaBible;

class Point {
    int x;
    int y;
}

class Circle {
    Point p = new Point(); // 포함관계 Circle 안에 멤버로 point라는 참조변수를 선언함
    int r;
}

public class composite {
    public static void main(String[] args) {
        Circle c = new Circle();
    }
}