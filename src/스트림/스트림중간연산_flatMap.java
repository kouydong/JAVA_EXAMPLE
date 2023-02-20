package 스트림;

import java.util.Arrays;
import java.util.stream.Stream;

public class 스트림중간연산_flatMap {
    public static void main(String[] args) {
        Stream<String[]> stream1 = Stream.of( new String[]{"홍길동", "임꺽정", "고길동"}
                                            ,new String[]{"홍길동", "임꺽정", "고길동"});

        Stream<String[]> stream2 = Stream.of( new String[]{"홍길동", "임꺽정", "고길동"}
                ,new String[]{"홍길동", "임꺽정", "고길동"});


        // map 사용할 경우 각 배열에 대한 스트림이 생성됩니다.
        stream1.map(Arrays::asList).forEach(System.out::println);

        // flatMap 사용할 경우 각 배열에 대한 스트림이 하나의 스트림으로 재 생성됩니다.
        stream2.flatMap(Arrays::stream).forEach(System.out::println);
    }
}
