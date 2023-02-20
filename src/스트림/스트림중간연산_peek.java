package 스트림;

import java.util.stream.Stream;

public class 스트림중간연산_peek {
    public static void main(String[] args) {
        // peek는 스트림을 소비하지 않으므로 지속적인 연산이 가능합니다.
        System.out.println("peek 중간 연산 실행");
        Stream.of("홍길동", "임꺽정", "고길동")
                .filter(str -> !str.equals("홍길동"))
                .peek(str -> System.out.println("이름은 : " + str))
                .filter(str -> str.equals("고길동"))
                .peek(str -> System.out.println("이름은 : " + str))
                .forEach(System.out::println);
    }
}
