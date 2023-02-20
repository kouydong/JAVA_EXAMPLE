package 스트림;

import java.io.File;
import java.util.stream.Stream;

public class 스트림중간연산_map {
    public static void main(String[] args) {

        Stream<Integer> intStream1 = Stream.of(1,4,3,2,6,345,23,4);
        Stream<Integer> intStream2 = Stream.of(1,4,3,2,6,345,23,4);

        // 람다식으로 표현(Integer 스트림을 String 스트림으로 변환)
        Stream<String>  stringStream1 = intStream1.map(integer -> String.valueOf(integer));
        System.out.println("Integer Stream -> String stream 람다식으로 출력");
        stringStream1.forEach(s -> System.out.print(s));

        // 메서도 참조 방식으로 표현(Integer 스트림을 String 스트림으로 변환)
        Stream<String>  stringStream2 = intStream2.map(String::valueOf);
        System.out.println("\nInteger Stream -> String Stream 메서드참조로 출력");
        stringStream2.forEach(System.out::print);

        // 메서드 참조 방식으로 표현(File 스트림을 String 스트림으로 변환)
        System.out.println("\nFile Stream -> String Stream");
        Stream<File> fileStream = Stream.of(new File("홍길동.txt"), new File("임걱정.yml"), new File("고길동.bak"));
        fileStream.map(File::getName)       // File stream -> String Stream
                .map(String::toUpperCase)   // String stream -> String stream
                .forEach(System.out::println);
    }
}
