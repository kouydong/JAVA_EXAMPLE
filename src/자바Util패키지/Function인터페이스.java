package 자바Util패키지;

import java.util.function.Function;

public class Function인터페이스 {
    public static void main(String[] args) {
        // 람다식
        Function<String, String> requiredName1 = s ->  s + "을 입력하세요";
        System.out.println(requiredName1.apply("이름"));

        // 항등함수
        Function<Integer, Integer> sameNumber = integer -> integer;
        System.out.println(sameNumber.apply(20));

    }
}
