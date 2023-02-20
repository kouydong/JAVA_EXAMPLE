package 스트림;

import java.util.stream.IntStream;

public class 스트림최종연산_forEach및forEachOrdered {
public static void main(String[] args) {
    System.out.println("병렬 처리를 통한 forEach 실행");
    // 병렬 처리로 인하여 출력 순서가 보장 되지 않습니다.
    IntStream.range(1, 10).parallel().forEach(System.out::println);

    System.out.println("병렬 처리를 통한 forEachOrdered 실행");
    // 병렬 처리 임에도 순서를 보장합니다.
    IntStream.range(1, 10).parallel().forEachOrdered(System.out::println);
}
}
