# 3주차

## 여러종류의 객체를 배열로 다루기

- 조상타입의 배열에 자손들의 객체를 담을 수 있다.

다향성 장점

1. 다형적 매개변수, 같은 타입
2. 하나의 배열에 여러종류 객체저장

그림그리는 연습 하기

<img src="https://user-images.githubusercontent.com/109144975/192128548-1a7129b6-faf0-4a52-a75b-789e5634c6be.jpg" width="400" height="220">

```java
class Product2 {
	int price;			// 제품의 가격
	int bonusPoint;	// 제품구매 시 제공하는 보너스점수

	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

	Product2() {} // 기본 생성자
}

class Tv2 extends Product2 {
	Tv2() {  super(100);	 }

	public String toString() { return "Tv"; }
}

class Computer2 extends Product2 {
	Computer2() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio2 extends Product2 {
	Audio2() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer2 {			  // 고객, 물건을 사는 사람
	int money = 1000;	  // 소유금액
	int bonusPoint = 0; // 보너스점수
	Product2[] cart = new Product2[10];   // 구입한 제품을 저장하기 위한 배열
	int i =0;			  // Product배열에 사용될 카운터

	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;             // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;   // 제품의 보너스 점수를 추가한다.
		cart[i++] = p;                // 제품을 Product[] cart에 저장한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
// 뒷 페이지에 계속됩니다.
	void summary() {	              // 구매한 물품에 대한 정보를 요약해서 보여 준다.
		int sum = 0;                 // 구입한 물품의 가격합계
		String itemList ="";         // 구입한 물품목록

		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i].toString + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

class Ex7_9 {
	public static void main(String args[]) {
		Buyer2 b = new Buyer2();

		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}
}
```

## 추상클래스

추상 클래스

- 미완성 설계도, 미완성 메서드를 갖고 있는 클래스

```java
abstract class Player { // 추상클래스(미완성 클래스)
	abstract void play(int pos); // 추상메서드 몸통{}이 없는 미완성 메서드
	abstract void stop(); // 추상 메서드
}
```

- 다른 클래스 작성에 도움을 주기 위한 것. 인스턴스 생성 불가

`Player p = new Player(); // 에러, 미완성 설계도이므로 추상 클래스의 인스턴스 생성 불가`

- 상속을 통해 추상 메서드를 완성해야 인스턴스 생성 가능

```java
class AudioPlayer extend Player { // 완성된 설계도
	void play(int pos) { } // 추상 메서드를 구현
	void stop() {}  // 추상 메서드를 구현
}

AudioPlayer(Player) ap = new AudioPlayer(); // OK
// Player(조상) 로 만들어도 play를 호출하게 되면 AudioPlayer에서 구현한 메서드 호출됨
```

추상 메서드(abstract method)

- 미완성 메서드, 구현부(몸통, {})가 없는 메서드

`/* 주석을 통해 어떤 기능을 수행할 목적으로 작성하였는지 설명한다*/`

abstract 리턴타입 메서드 이름();

꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우

추상클래스를 상속받아 사용할 경우 해당 추상 메서드에 있는 내용들을 모두 구현해야한다.

만약 구현하지 않으면 abstact을 붙어줘야 한다.

- 추상 메서드 호출 가능(호출할 때는 선언부만 필요)

```java
package javaBible;

abstract class Player{ // 추상 클래스
    abstract void play (int pos); // 추상 메서드
    abstract void stop();
}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos+"위치부터 play합니다.");
    }
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}

public class PlayerText {
    public static void main(String[] args) {
//        Player p = new Player();
//        AudioPlayer ap = new AudioPlayer();
        Player ap = new AudioPlayer(); // 다형성
        ap.play(100);
        ap.stop();
    }
}
```

ap 리모콘 타입에는 선언부만 있어도 된다. Player 클래스가 추상클래스라 하여도 new AudioPlayer 클래스를 만들었기 때문에 Player ap 가 가르키는 play, stop 메서드는 AudioPlayer로 구현된 메서드이므로 에러가 나지 않고 잘 실행된다.

<img src="https://user-images.githubusercontent.com/109144975/192128534-ff371ae0-864e-4219-ab32-6bccb1e1eb6c.jpg" width="400" height="220">

## 추상클래스의 작성

- 여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나 기존클래스의 공통부분을 뽑아서 추상클래스를 만든다.

<img src="https://user-images.githubusercontent.com/109144975/192128537-b4d2d0bf-a1b3-4192-ba58-7f03581cec7c.jpg" width="400" height="220">

기존 Marine, Tank, Dropship 클래스에 있는 공통된 부분들을 Unit클래스의 멤버로 넣는다.

여기서 move메소드의 경우 클래스별로 다르게 동작하기 때문에 추상화 메서드로 설정해주었다. 이렇게 추상메서드로 설정해주게 되면 클래스별로 다시 구현할 수 있다.

```java
package javaBible;

public class Ex7_10 {
    public static void main(String[] args) {
//        Unit[] group = { new Marine(), new Tank(), new Dropship() };
        Unit[] group = new Unit[3];
//        Object[] group = new Object[3]; // 만약 타입이 Object라면 에러남, Object 에는 move 메소드가 없기 때문에
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Dropship();

        for (int i = 0; i < group.length; i++) // group 의 타입은 Unit
            group[i].move(100, 200); // 만약 타입이 Object라면 에러남, Object 에는 move 메소드가 없기 때문에
    } // Marine이라는 객체에는 move가 있지만 Object 리모콘에는 move가 없으므로 호출할 수가 없음
}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
    void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank extends Unit { // 탱크
    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ",y=" + y + "]");
    }
    void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship extends Unit { // 수송선
    void move(int x, int y) {
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }
    void load()   { /* 선택된 대상을 태운다. */ }
    void unload() { /* 선택된 대상을 내린다. */ }
}
```

객체 배열 : 참조변수를 묶은 것

## 추상클래스의 작성 2

- 추상화(불명확) vs 구체화(명확)

추상화된 코드는 구체화된 코드보다 유연하다. 변경에 유리

```java
GregorianCalendar cal = new GregorianCalendar(); // 구체적
Calendar cal = Calendar.getInstance(); // 추상적
```

<img src="https://user-images.githubusercontent.com/109144975/192128538-3cd85c0b-5698-46fe-8d7c-b41606ec018f.jpg" width="400" height="220">

추상클래스, 미완성 설계도를 통해 여러 형태를 가지는 객체를 만드는 것이 편리해졌다.(노란부분만 추가해주면 되므로)

만약 네모를 하트로 바꿔야 하는 상황이라면 추상클래스에서만 변경해주면 나머지는 자동으로 바뀌게 된다 (유지 보수 편리)

추상클래스를 만드는과정에서 단계별로 만들어 놓으면 후에 변경해야하는 부분이 있을때 원하는 시기의 추상클래스를 상속받아서 구현하기가 용이하다.

## 인터페이스(interface)

- 추상 메서드의 집합 (결론, 핵심)

- 구현된 것이 전혀 없는 설계도. 껍데기(모든 멤버가 public)

<img src="https://user-images.githubusercontent.com/109144975/192128539-8b56fa1a-716f-4120-aca3-06c05933b79f.jpg" width="400" height="220">

추상클래스와 인터페이스의 차이는?

- 추상클래스는 일반클래스에 추상메서드를 가지고 있는것, 즉 추상클래스 외에도 다른 것(일반 메소드, 인스턴스 변수등) 을 가질 수 있음, 인터페이스는 구현된 것이 전혀없으며 추상클래스만 가질 수 있음, 이외의 다른 것들은 가질 수 없음

```java
interface 인터페이스이름 {
	public static final 타입 상수이름 = 값; // 상수, 부수적인것, 변수X
	public abstract 메서드이름(매개변수목록); // 추상메서드
} // 모든 멤버는 public임, public , abstract, static, final 생략가능, 왜냐하면 반드시 저 조건을 갖춰야하므로 당연한 부분이므로
```

## 인터페이스의 상속

- 인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상이 아님)

- 다중 상속이 가능(추상메서드는 충돌해도 문제 없음)

## 인터페이스(미완성 설계도)의 구현

- 인터페이스에 정의된 추상 메서드를 완성하는 것

```java
class 클래스이름 implements 인터페이스이름 {
	// 인터페이스에 정의된 추상메서드를 모두 구현(추상메서드 작성)해야 한다.
}
```

<img src="https://user-images.githubusercontent.com/109144975/192128540-3539a0ca-ad6a-45d4-93ff-818775f5c8d9.jpg" width="400" height="220">

인터페이스 구현은 추상클래스 구현과 유사하다. 다만 키워드 extends, implements에서 차이가 있음

Q 인터페이스란? - 추상메서드의 집합 (상수, static메서드, 디폴트메서드등)

Q 인터페이스의 구현이란 ? - 인터페으스의 추상메서드 몸통{} 만들기(미완성 설계도 완성하기)

Q 추상클래스와 인터페이스의 공통점은 ? - 추상메서드를 가지고 있다(미완성 설계도)

Q 추상클래스와 인터페이스의 차이점은 ? - 인터페이스는 iv를 가질 수 없다

## 인터페이스를 이용한 다형성

- 인터페이스도 구현 클래스의 부모? - yes

- 인터페이스 타입 매개변수는 인터페이스 구현한 클래스의 객체만 가능

<img src="https://user-images.githubusercontent.com/109144975/192128541-842c4d79-f26e-443f-94ed-d5cf7a3c747c.jpg" width="400" height="220">

Fighter클래스가 Fightable 인터페이스를 구현하였다라고 말할 수 있음

- 인터페이스를 메서드의 리턴타입으로 지정할 수 있다.

<img src="https://user-images.githubusercontent.com/109144975/192128542-20cb6f13-09fe-47ec-b81c-e91f385dc210.jpg" width="400" height="220">

```java
package javaBible;

abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() { System.out.println("멈춥니다.");}
}

interface Fightable { // 인터페이스의 모든 메서드는  public abstact. 예외없이
    void move(int x, int y); // public abstract가 생략됨
    void attack(Fightable f); // public abstract가 생략됨
}

class Fighter extends Unit2 implements Fightable {
    // 오버라이딩규칙 : 조상(public) 보다 접근제어자가 좁으면 안된다.
    public void move(int x, int y) { // interface에서는 생략이 되었기때문에 여기서 잘 구현을 했어도 public을 안붙여주면 에러나옴
        System.out.println("["+x+","+y+"]로 이동");
    }
    public void attack(Fightable f) {
        System.out.println(f+"를 공격");
    }

    // 싸울 수 있는 상대를 불러온다.
    Fightable getFightable() {
        Fighter f = new Fighter(); // Fighter를 생성해서 반환
        return f;
    }
}

public class FighterTest {
    public static void main(String[] args) {
//        Fighter f = new Fighter();
        Unit2 u = new Fighter();
        Fightable f = new Fighter();
        u.move(100, 200);
//        u.attack(new Fighter());  // Unit2에는 attack이 없어서 호출 불가
        u.stop();

        f.move(100, 200);
        f.attack(new Fighter());
//        f.stop(); // Fightable 에는 stop이 없어서 호출 불가
    }
}
```

반환타입이 인터페이스의 어떤의미인지 알자

- 이 인터페이스를 구현한 것을 반환해준다

다향성이면서 동시에 추상화

- Fightable의 의미는 반환타입이 Fightable일때는 Fightable 인터페이스를 구현한 객체를 반환한다.

## 인터페이스의 장점

- 두 대상(객체) 간의 ‘연결, 대화, 소통’ 을 돕는 ‘중간 역할’을 한다.

<img src="https://user-images.githubusercontent.com/109144975/192128543-6c559623-b2ed-4a5f-bf75-f5dc0d6e2d36.jpg" width="400" height="220">

사람이 기계와 소통하기 쉽도록 도와줌, 중간역할을 하기 위함

변경에 유리

- 선언(설계, 껍데기)와 구현(알맹이)을 분리시킬 수 있게 한다.

<img src="https://user-images.githubusercontent.com/109144975/192128544-2a612562-2363-4a83-91b9-e76c3af3c81f.jpg" width="400" height="220">

첫번째 경우  A가 B를 사용할때 B에 변경사항이 있으면 A 도 같이 변경해줘야 함. 직접 사용하기때문 (강한 결합, 빠름)

두번째 경우 A가 B를 사용할 때 B에 변경사항이 있어도 B만 변경하면 됨 인터페이스가 중간역할을 이미 해주고 있기 때문에 A 변경을 하지 않아도 됨. 껍데기와 알맹이로 분리를 하므로써 껍데기를 통해 알맹이로 접근할 수 있음 (느슨한 결함, 느림)

<img src="https://user-images.githubusercontent.com/109144975/192128545-dd10548b-1d8e-423f-8285-6e60f348b88a.jpg" width="400" height="220">

껍데기와 알맹이로 분리

interface I로 methodB를 추상화하여 클래스 B가 I를 구현하도록 함

그러므로 클래스 A에서 클래스 B의 메소드를 직접 접근하는 것이 아닌 인터페이스 I를 사용하여 접근, B 와 관계 없음, A와 I만 서로 관계 있음

만약 B를 C로 변경해야한다면 B만 바꿔주면 됨

```java
package javaBible;

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

//출력
// B클래스의 메서드
// C클래스의 메서드
```

## 인터페이스 장점

- 개발 시간을 단축할 수 있다.

- 변경에 유리한 유연한 설계 가능

<img src="https://user-images.githubusercontent.com/109144975/192128546-ec46dddf-a082-4c2b-9231-e21bc1170e92.jpg" width="400" height="220">

A를 개발하기 위해 B가 개발이 완료될때까지 기다려야함

A를 개발하기 위해 B가 개발이 완료필요 없음 왜냐 I만 있으면 됨, B는 I를 구현하면 됨

- 표준화가 가능하다 (JDBC - 인터페이스 집합), 여러 종류의 데이터베이스가 있는데 데이터베이스를 변경할때마다 코드변경을 해야하면 지옥,,, 그러므로 데이터베이스를 다룰때 중간 인터페이스를 놓음으로써 데이터베이스를 변경하더라도 자바 코드변경이 없도록 하기 위함

- 서로 관계없는 클래스들을 관계를 맺어줄 수 있다.

repairable을 구현했다는 공통점이 있음 - repairable 의 자손? 같은 개념

<img src="https://user-images.githubusercontent.com/109144975/192128547-a24356a5-1c49-4883-9a8f-9eb3c70d7d7b.jpg" width="400" height="220">

```java
void repair(Repairable r) {
	if (r instanceif Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
					u.hitPoint++; // Unit의 HP를 증가시킨다.
      }
	}
}
```

## 디폴트 메서드와 static메서드

- 인터페이스에 디폴트 메서드. static메서드 추가 가능.

- 인터페이스에 새로운 메서드(추상메서드)를 추가하기 어려움.

- 디폴트 메서드는 인스턴스 메서드(인터페이스 원칙 위반) -예외

참고 : [자바의 정석 ch7](https://www.youtube.com/watch?v=Pgutf0G3nE4&list=PLW2UjW795-f5JPTsYHGAawAck9cQRw5TD&index=20)