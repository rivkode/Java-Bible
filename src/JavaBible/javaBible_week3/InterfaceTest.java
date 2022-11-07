package JavaBible.javaBible_week3;

class A {
    public void method(I i) { // 의존일 경우 A도 변경해야 함
        i.method(); // 인터페이스는 A가 변경이 없도록 하는 것이 목표
    }
}

interface I {
    public void method();
}
// B클래스의 선언과 구현을 분리
class B implements I{
    public void method() {
        System.out.println("B클래스의 메서드");
    }
}

class C implements I{
    public void method() {
        System.out.println("C클래스의 메서드");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.method(b); // A가 B를 사용
        a.method(c);
    }
}
