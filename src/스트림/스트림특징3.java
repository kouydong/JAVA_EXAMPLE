package 스트림;

import java.util.Random;
import java.util.stream.IntStream;

public class 스트림특징3 {
    public static void main(String[] args) {
        // 1~45까지의 무한 스트림
        IntStream intStream = new Random().ints(1,46);

        // 최종 연산 forEach() 가 수행되기 전까지 중간 연산은 수행되지 않습니다.
        intStream.distinct().limit(6).sorted().forEach(value -> System.out.println(value + ","));
    }
}
