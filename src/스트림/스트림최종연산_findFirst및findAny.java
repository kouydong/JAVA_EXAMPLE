package 스트림;

import java.util.Optional;
import java.util.stream.Stream;

public class 스트림최종연산_findFirst및findAny {
    public static void main(String[] args) {
        // findFirst 경우 순차 스트림에서 사용되며 첫 번째 요소를 반환합니다.
        Optional<Integer> intStream1 = Stream.of(95, 100, 51, 55, 60, 86)
                .filter(integer -> integer > 60)
                .findFirst();
        System.out.println("첫 번째 요소를 가져옵니다. :" + intStream1);

        // findAny 경우 순차 스트림에서는 첫 번째 요소를 반환합니다.
        Optional<Integer> intStream2 = Stream.of(95, 100, 51, 55, 60, 86)
                .filter(integer -> integer > 60)
                .findAny();
        System.out.println("첫 번째 요소를 가져옵니다. :" + intStream2);

        // findFirst 경우 병렬 스트림에서도 첫 번째 요소를 반환합니다.
        Optional<Integer> intStream3 = Stream.of(95, 100, 51, 55, 60, 86)
                .parallel()
                .filter(integer -> integer > 60)
                .findFirst();
        System.out.println("첫 번째 요소를 가져옵니다. :" + intStream3);

        // findAny 경우 병렬 스트림에서 사용되며 아무 요소를 반환합니다.
        Optional<Integer> intStream4 = Stream.of(95, 100, 51, 55, 60, 86)
                .parallel()
                .filter(integer -> integer > 60)
                .findAny();
        System.out.println("아무 요소를 가져옵니다. :" + intStream4);
    }
}
