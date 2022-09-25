interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    int LEG_COUNT = 4;  // 인터페이스 상수

    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable {
    void bark();
}

interface BarkablePredator extends Predator, Barkable {
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator, Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements BarkablePredator {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal) {
        /*if (animal instanceof Tiger) {
            System.out.println("어흥");
        } else if (animal instanceof Lion) {
            System.out.println("으르렁");
        } else if (animal instanceof Crocodile) {
            System.out.println("쩝쩝");
        } else if (animal instanceof Leopard) {
            System.out.println("캬옹");
        }*/ // 만약 다향성의 특징을 활용하지 않았더라면 위와같이 클래스별로 작성을 해야할 것 이다

        animal.bark(); // 위 예제에서 사용한 tiger, lion 객체는 각각 Tiger, Lion 클래스의 객체이면서
        // Animal 클래스의 객체이기도 하고 Barkable, Predator 인터페이스의 객체이기도 하다.
        // 이러한 이유로 barkAnimal 메소드의 입력 자료형을 Animal에서 Barkable 로 바꾸어 사용할 수 있는 것이다.
    } // 이렇게 하나의 객체가 여러개의 자료형 타입을 가질 수 있는 것을 객체지향 세계에서는 다형성(Polymorphism)이라고 한다.
}

public class polymorphism {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}