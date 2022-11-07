# 스택

Stack은 "쌓다", "더미" 라는 의미를 가지고 있다. 접시를 차곡차곡 쌓아 올리는
듯이 데이터를 쌓아 올리는 형상으로 생각할 수 있다. Stack(스택)은 Queue(큐)와 함께
자바에서 사용되는 가장 기본적인 자료구조 중 하나다.

Stack(스택)은 '마지막에 추가된 데이터가 가장 먼저 나온다' 라는 특징을 가지고 있다.
LIFO(Last In First Out) 동작이라고 한다. 함께 많이 사용되는 Queue(큐)의 경우
먼저 추가된 데이터가 먼저 나오는 FIFO(First In First Out) 동작을 갖는 것과 비교된다.

스택 자료구조는 추가동작, 빼기동작을 통해 쉽게 사용할 수 있다.

아래 예제코드를 통해 살펴보자.

```java
Stack<Integer> stack = new Stack<>();
Scanner in = new Scanner(System.in);
int num = in.nextInt();

for(int i=0; i<num; i++) {
    stack.push(in.nextInt());
}

for(int i=0; i<num; i++) {
    int peek = stack.peek();
    System.out.println(peek);
    stack.pop();
}
```

위 코드는 5개의 숫자가 입력된 역순으로 다시 출력되는 코드이다.

입력 : <br>
5 <br>
1 2 3 4 5

출력 : <br>
5 <br>
4 <br>
3 <br>
2 <br>
1 <br>

'push'메소드를 통해 stack에 원하는 값을 넣을 수 있으며 'pop'을 통해 최상위 값을
빼낼 수 있다.
peek는 가장 최상위 값을 반환하는 메소드이다.

<br>

> int pop = stack.pop();

위 코드로도 동일한 동작을 구현 할 수 있지만 peek를 처음 알게되어 사용해보았다.