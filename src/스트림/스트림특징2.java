package 스트림;

import java.util.Arrays;
import java.util.stream.Stream;

public class 스트림특징2 {
    public static void main(String[] args) {

        String[] names = new String[]{"홍길동", "임꺽정", "박준", "고의동", "신사임당"};

        Stream<String> namesStream = Arrays.stream(names).sorted();

        // 스트림 최종 연산 foreach() 가 실행되면 해당 스트림은 종료됩니다.
        namesStream.forEach(System.out::println);

        // 종료된 스트림을 통해 또 다른 최종 연산 수행시 ERROR 가 발생합니다.
        namesStream.count(); // ERROR 발생
    }
}
