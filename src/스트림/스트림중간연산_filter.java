package 스트림;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class 스트림중간연산_filter {
    public static void main(String[] args) {
        // Stream<T> filter(Predicate predicate) : 조건에 맞는 요소만 추출합니다.
        // 조건에 맞는 요소만 추출합니다.
        IntStream intStream = IntStream.range(1, 100); // 1~99까지의 int 스트림 생성
        // 짝수만 출력
        intStream.filter(value -> value % 2 == 0).forEach(System.out::println);

        IntStream intStream2 = IntStream.rangeClosed(1, 100); // 1~100까지의 int 스트림 생성
        // 작수이면서 5의 나머지가 0인 숫자만 출력
        intStream2.filter(value -> value % 2 == 0 && value % 5 == 0).forEach(System.out::println);

        String[] names = {"홍길동", "임꺽정", "고길동"};
        Arrays.stream(names).parallel().filter(s -> s.charAt(0) == '고').forEach(System.out::println);
    }
}


