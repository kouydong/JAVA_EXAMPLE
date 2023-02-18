package 람다;

import java.util.function.Function;

public class 배열메서드참조4 {
    public static void main(String[] args) {
        // 배열 메서드의 '람다' 예시
        // Function 함수형 인터페이스는 매개변수 및 반환 값을 선언할 수 있으며 입력값을 받아서 반환 형태로 표현해 줍니다.
        Function<Integer, String[]> function1 = arrayIndex -> new String[arrayIndex];

        // 배열 메서드의 '람다' 예시
        // Function 함수형 인터페이스는 매개변수 및 반환 값을 선언할 수 있습니다. 매개변수를 받아서 배열을 크기를 선앤해 줍니다.
        Function<Integer, String[]> function2 = String[]::new;
    }
}
