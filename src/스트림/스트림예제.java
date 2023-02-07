package 스트림;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 스트림예제 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); // 정수형 리스트 생성
        // 리스트스트림을 생성하고
        Stream<Integer> intStream = list.stream(); // 리스트스트림
        // 중간 연산을 통해 표준화된 방법으로 데이터를 정리하고
        intStream.limit(3).distinct().sorted()
        // 최종 연산을 통해 스트림을 소비합니다.
        .forEach(System.out::println);





        Stream<String> stringStream = Stream.of(new String[]{"a", "b","c"}); // 배열스트림
        Stream<Double> randomStream = Stream.generate(Math::random); // 람다식을 통한 스트림
        // 기본 자료형의 경우 자체적인 스트림을 제공
        IntStream intStream1 = new Random().ints(5); // 난수 스트림


    }
}
