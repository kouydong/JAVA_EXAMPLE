package 자바Util패키지;

import java.util.function.Function;

public class Function인터페이스결합 {
    public static void main(String[] args) {
        // 문자열의 결합
        Function<String, String> name = (nameString) -> nameString + "님";
        Function<String, String> message = (messageString) -> messageString + "방갑습니다.";

        Function<String, String> totalMessage1 = name.andThen(message);
        Function<String, String> totalMessage2 = message.compose(name);

        System.out.println("전체 메시지 " + totalMessage1.apply("홍길동"));
        System.out.println("전체 메시지 " + totalMessage2.apply("임꺽정"));
    }
}
