package 스트림;

import java.util.stream.IntStream;

public class 스트림중간연산_distinct {
    public static void main(String[] args) {
        // Stream<T> distinct() : 중복을 제거합니다.
        IntStream intStream = IntStream.of(1,2,3,5,5,6,6,7,9,10,9);
        intStream.distinct().forEach(System.out::println);
    }
}
