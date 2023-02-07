package 스트림;

import java.util.stream.Stream;

public class 스트림특징4 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.<String>builder()
                                            .add("dd")
                                            .add("aaa")
                                            .add("CC").build();
        /*
        스트림의 매주 중요한 특징 중 하나는 병렬 스트림을 통해 스트림을 생성합니다.
        병렬 처리 스트림이란 다중 스레드로 스트림을 처리하여 보다 빠른 결과를 얻을 수 있습니다.
        */
        int sum = stringStream.parallel()
                .mapToInt(value -> value.length()).sum();
    }
}
