package 람다;

import java.util.function.Function;

public class 클래스메서드참조 {
    public static void main(String[] args) {

        // 클래스 메서드의 '람다' 예시
        // Function 함수형 인터페이스는 매개변수 및 반환 값을 선언할 수 있으며 입력값을 받아서 반환 형태로 표현해 줍니다.
        Function<String, Integer> function1 = number -> Integer.parseInt(number);

        // 클래스 메서드의 '메서드 참조' 예시
        // Function 함수형 인터페이스의 매게변수 값을 알 수 있고 반환 값을 알 수 있으면 메서드 참조 형태로 출력이 가능합니다.
        Function<String, Integer> function2 = Integer::parseInt;
        System.out.println(function1.apply("40"));
        System.out.println(function2.apply("40"));
    }
}
