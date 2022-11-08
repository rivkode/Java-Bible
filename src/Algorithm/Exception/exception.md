# 예외처리

## 오류와 예외

오류와 예외를 혼동하는 경우가 많은데 이 둘을 분리하여 생각해야 합니다.

오류(error)는 시스템이 종료되어야 할 수준의 상황과 같이 수습할 수 없는 심각한 문제를 의미합니다.  개발자가 이를 미리 예측하여 방지할 수 없습니다.

반면 예외(Exception)는 개발자가 구현한 로직에서 발생한 실수나 사용자의 영향에 의해 발생합니다.

오류와 달리 개발자가 미리 예측하여 방지할 수 있기에 상황에 맞는 예외처리(Exception Handle)를 해야합니다.

예외 처리는 크게 아래 3 블록으로 구분할 수 있습니다.

<br>


try

catch

finally

<br>


try 부분에서는 예외 상황을 미리 예측하고 처리할 수 있습니다.

catch 부분은 try에서 예외 상황이 발생 시 발생한 오류와 관련된 Exception을 처리합니다.

finally는 예외의 발생여부과 관계 없이 무조건 실행됩니다.

<br>


![예외과정](https://user-images.githubusercontent.com/109144975/200488392-fad06070-c657-4891-9abf-fd07db42cb84.JPG)

<br>

아래 예시는 자바에서 정수 int형을 0으로 나눌때 발생되는 ArithmeticException 예외 발생 예시입니다.

```java
public class ExceptionExam {
        public static void main(String[] args) {
            int i = 10;
            int j = 0;
            try{
                int k = i / j;
                System.out.println(k);
            }catch(ArithmeticException e){
                System.out.println("0으로 나눌 수 없습니다. : " + e.toString());
            }finally {
                System.out.println("오류가 발생하든 안하든 무조건 실행되는 블록입니다.");
            }
        }
    }
```

실행결과는 아래와 같습니다.

0으로 나눌 수 없습니다. : java.lang.ArithmeticException: / by zero

오류가 발생하든 안하든 무조건 실행되는 블록입니다.

i 와 j 에 정수를 할당하고 try 구문을 실행하는 시점에 integer을 0으로 나누게 되면 ArithmeticException 예외가 발생되어 나눈 값인 k가 출력되지 않고 catch 구문으로 이동합니다.

따라서 해당 예외 정보를 출력한 후 finally 구문으로 이동하여 해당 print문을 출력 후 종료됩니다.

[참고자료](https://coding-factory.tistory.com/280)