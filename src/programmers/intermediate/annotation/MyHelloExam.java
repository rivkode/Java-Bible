package programmers.intermediate.annotation;

import java.lang.reflect.Method;

public class MyHelloExam {

    public static void main(String[] args) {
        MyHello hello = new MyHello();

        try {
            Method method = hello.getClass().getDeclaredMethod("hello");

            if(method.isAnnotationPresent(Count100.class)) {
                for(int i=0; i<100; i++) {
                    hello.hello();
                }
            } else {
                hello.hello();
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        // getClass는 object가 가지고 있는 것임

    }
}
