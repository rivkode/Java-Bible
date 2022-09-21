class Point {
    int x;
    int y;
}

class Circle {
    Point c = new Point(); // 포함관계 Circle 안에 멤버로 point라는 참조변수를 선언함
    int r;
}

class Car {
    Engine e = new Engine();
    Door [] d = new Door[4];
}