package 스트림;

import java.util.Random;
import java.util.stream.IntStream;

public class 난수스트림만들 {
public static void main(String[] args) {
    // ints 메서드를 통해 무한대의 intStream 생성합니다.
    System.out.println("ints 메서드를 통해 무한대의 intStream 생성합니다.");
    IntStream 무한대의난수 = new Random().ints();
    무한대의난수.limit(6).forEach(System.out::println);

    // ints 메서드를 통해 유한대의 5개 요소를 가지는 intStream 생성합니다.
    System.out.println("ints 메서드를 통해 유한대의 5개 요소를 가지는 intStream 생성합니다.");
    IntStream 무한대의난수2 = new Random().ints(5);
    무한대의난수2.forEach(System.out::println);


    // ints 메서드를 통해 0 ~45 사이의 무한대의 intStream  생성합니다.
    System.out.println("ints 메서드를 통해 0 ~45 사이의 무한대의 intStream  생성합니다.");
    IntStream 무한대의난수3 = new Random().ints(0, 46);
    무한대의난수3.limit(6).forEach(System.out::println);

    // 특정 범위(1~4)의 정수를 요소로 갖는 스트림을 생성합니다.
    IntStream 특정범위1 = IntStream.range(1, 5);
    System.out.println("특정 범위(1~4)의 정수를 요소로 갖는 스트림을 생성합니다.");
    특정범위1.forEach(System.out::println);

    // 특정 범위(1~5)의 정수를 요소로 갖는 스트림을 생성합니다.
    IntStream 특정범위2 = IntStream.rangeClosed(1, 5);
    System.out.println("특정 범위(1~5)의 정수를 요소로 갖는 스트림을 생성합니다.");
    특정범위2.forEach(System.out::println);
}
}
