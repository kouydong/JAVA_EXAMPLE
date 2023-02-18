package 스트림;

import java.util.Arrays;
import java.util.stream.Stream;

public class 배열스트림만들기 {
    public static void main(String[] args) {
        // Stream.of 배열을 통한 스트림 생성
        System.out.println("Stream.of 배열을 통한 스트림 생성");
        Stream<String> stream1 = Stream.of(new String[]{"홍길동", "임꺽정", "고길동"});
        stream1.forEach(System.out::print);

        // Stream.of 가변인자 메서드를 통한 스트림 생성
        System.out.println("\nStream.of 가변인자 메서드를 통한 스트림 생성");
        Stream<String> stream2 = Stream.of("홍길동", "임꺽정", "고길동");
        stream2.forEach(System.out::print);

        // Arrays.stream 배열을 통한 스트림 생성
        System.out.println("\nArrays.stream 배열을 통한 스트림 생성");
        Stream<String> stream3 = Arrays.stream(new String[]{"홍길동", "임꺽정", "고길동"});
        stream3.forEach(System.out::print);

        // Arrays.stream 배열을 통한 스트림 생성 (0, 2 배열 범주)
        System.out.println("\nArrays.stream 배열을 통한 스트림 생성 (0, 2 배열 범주)");
        Stream<String> stream4 = Arrays.stream(new String[]{"홍길동", "임꺽정", "고길동"},0,2);
        stream4.forEach(System.out::print);
    }
}
