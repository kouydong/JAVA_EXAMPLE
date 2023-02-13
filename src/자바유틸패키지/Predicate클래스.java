package 자바유틸패키지;

import java.util.function.Predicate;

public class Predicate클래스 {
    public static void main(String[] args) {
        // negate() 연산
        Predicate<Integer> p1 = integer -> integer >= 100;
        System.out.println("p1의 논리연산 " + p1.test(200)); // 200 >= 100 true
        System.out.println("p1의 NOT 논리연산 " + p1.negate().test(200)); // 200 < 100 false

        // and() 연산
        Predicate<Integer> p2 = integer -> integer % 2 == 0;
        Predicate<Integer> p3 = integer -> integer % 6 == 0;
        System.out.println("p2 and p3 논리연산 " + p2.and(p3).test(6)); // 6 % 2 == 0 && 6 % 6 == 0 true 반환
        System.out.println("p2 and p3 논리연산 " + p2.and(p3).test(4)); // 4 % 2 == 0 && 4 % 6 == 0 false 반환

        // or() 연산
        Predicate<Integer> p4 = integer -> integer % 2 == 0;
        Predicate<Integer> p5 = integer -> integer % 6 == 0;
        System.out.println("p4 or p5 논리연산 " + p4.or(p5).test(6)); // 6 % 2 == 0 || 6 % 6 == 0 true 반환
        System.out.println("p4 or p5 논리연산 " + p4.or(p5).test(4)); // 4 % 2 == 0 || 4 % 6 == 0 true 반환

        // isEquals() 연산
        Predicate<String> p6 = s -> s.equals("홍길동");
        System.out.println("p6의 문자열 비교 " + p6.test("홍길동"));
        System.out.println("p6의 문자열 비교 " + p6.test("임꺽정"));
        System.out.println("문자열 비교  " + Predicate.isEqual("홍길동").test("임꺽정"));

    }
}
