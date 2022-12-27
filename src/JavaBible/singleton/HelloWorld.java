package JavaBible.singleton;


/**
 * 싱글톤을 이용한 객체 해시코드 확인
 */
public class HelloWorld {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println("a = " + a.hashCode());
        System.out.println("b = " + b.hashCode());
        if(a == b) {
            System.out.println(true);
        }

    }
}
