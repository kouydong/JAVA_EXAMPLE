package 자바Util패키지;

import java.util.function.Consumer;

public class Consumer인터페이스 {
public static void main(String[] args) {
    // Consumer<T> 인터페이스는 매개변수가 있고 반환값이 없는 함수형 인터페이스 입니다.
    Consumer<Integer> intConsumer = integer -> System.out.println(integer);
    intConsumer.accept(20);

    // accept 를 통해 Consumer<String>으로 정의된 함수를 하고 매개변수를 소비합니다.
    Consumer<String> stringConsumer = s -> System.out.println(s);
    stringConsumer.accept("Hello world");
}
}
