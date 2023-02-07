package 스트림;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 스트림특징5 {
    public static void main(String[] args) {
        // 기본 자료형의 경우 별도의 스트림을 생성 할 수있습니다.

        // 인트 스트림 생성
        IntStream intStream = IntStream.of(4,6,78,3,2).limit(2);
        System.out.println("intStream ==>" + intStream.count());

        // 더블 스트림 생성
        DoubleStream doubleStream = DoubleStream.of(3.14, 2.56, 4.58).sorted();
        System.out.println("doubleStream ==>" + doubleStream.sum());
    }
}
