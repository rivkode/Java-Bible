package JavaBible.SRP;

// SRP : single responsibility principle 단일 책임 원칙

public class Phone {
    void call() {

    }
    void getCharge() {

    }
}

class user {
    void clean() {

    }

    void checkCharge() {

    }

}

class developer{
    void error() {

    }
    void AppDevelop() {

    }

}

// 결론 : 변경으로 버그가 발생하더라도 다른 관련 없는 동작에 영향을 미치지 않도록 동작 분리를 목표로 함.