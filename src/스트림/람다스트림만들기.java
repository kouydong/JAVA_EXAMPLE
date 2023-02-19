package 스트림;

import java.util.Random;
import java.util.stream.Stream;

public class 람다스트림만들기 {
    public static void main(String[] args) {
        // interate를 통한 람다 스트림 생성
        Stream<Integer> 짝수스트림 = Stream.iterate(0, integer -> integer+2);
        짝수스트림.limit(5).forEach(System.out::println);

        // generate를 통한 람다 스트림 생성
        Stream<Double> 랜덤스트림1 = Stream.generate(Math::random);
        Stream<Double> 랜덤스트림2 = Stream.generate(() -> Math.random());

        랜덤스트림1.limit(5).forEach(System.out::println);
        랜덤스트림2.limit(5).forEach(aDouble -> System.out.println("람다식을 통한 랜덤 스트림 :" + aDouble));
    }
}
