# java.time 패키지

---

java.time 패키지
자바 7이전 까지는 Date와 Calendar 클래스를 이용해서 날짜와 시간 정보를 얻을 수 있었다.

Calendar 클래스는 날짜와 시간 정보를 얻기 에는 충분하지만, 날짜와 시간을 조작하거나 비교하는 기능이 불충분하다.

그래서 자바 8부터 날짜와 시간을 나타내는 여러가지 API를 새롭게 추가했다.

이 API는 java.util 패키지에 없고 별도로 java.time 패키지와 하위 패키로 제공 된다.



날짜와 시간 객체 생성
java.time 패키지에는 다음과 같이 날짜와 시간을 표현하는 5개의 클래스가 있다.
그 중 사용 빈도가 높은 3가지 클래스(LocalDate, LocalTime, LocalDateTime)를 살펴보겠습니다.



LocalDate
로컬 날짜 클래스로 날짜 정보만을 저장

두가지 정적 메소드로 얻는다

now() => 컴퓨터의 현재 날짜 정보를 저장한 LocalDate 객체를 리턴

of() => 매개값으로 주어진 날짜 정보를 저장한 LocalDate 객체를 리턴
```java
LocalDate currDate = LocalDate.now();
LocalDate targetDate = LocalDate.of(int year, int month, int dayOfMonth);
// 2022-11-09
```

LocalTime
로컬 시간 클래스로 시간 정보만을 저장,

now() => 컴퓨터의 현재 날짜 정보를 저장한 LocalTime 객체를 리턴

of() => 매개값으로 주어진 날짜 정보를 저장한 LocalTime 객체를 리턴
```java
LocalTime currTime = LocalTime.now();
LocalTime targetTime = LocalTime.of(int hour, int minute, int second,int nanoOfSecond)
// 19:51:05.839524800   포맷을 통해 수정할 수 있습니다.

```
LocalDateTime
LocalDated와 LocatTime을 결합한 클래스,

날짜와 시간정보 모두 저장

now() => 컴퓨터의 현재 날짜 정보를 저장한 LocalDateTime 객체를 리턴

of() => 매개값으로 주어진 날짜 정보를 저장한 LocalDateTime 객체를 리턴
```java
LocalDateTime currDateTime = LocalDateTime.now();
LocalDateTime targetTime = LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minutem int second, int nanoOfsecond);
// 2022-11-09T19:51:59.157015600

```
날짜와 시간에 대한 정보 얻기
LocalDate와 LocalTime 은 프로그램에서 날짜와 시간정보를 이용할 수 있도록 다음과 같은 메소드 제공



참고자료 - [time패키지](https://ho-log.tistory.com/98)