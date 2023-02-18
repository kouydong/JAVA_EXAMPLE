package 람다;

import java.util.function.Function;
import java.util.function.Supplier;

class 테스트클래스 {

    private String name;
    테스트클래스() {}
    테스트클래스(String name) {this.name = name;}

}
public class 생성자메서드참조2 {
    public static void main(String[] args) {

        // '테스트클래스'의 기본생성자를 람다식으로 생성
        Supplier<테스트클래스> supplier1 = () -> new 테스트클래스(); // OK

        // '테스트클래스'의 매개변수하나인 생성자를 람다식으로 생성
        Function<String, 테스트클래스> function1 = name -> new 테스트클래스(name); // OK

        테스트클래스 class1 = supplier1.get();
        테스트클래스 class2 = function1.apply("홍길동");

        // '테스트클래스'를 메서드 참조 방식으로 생성
        // 컴파일러가 어떤 생성자를 호출 할 지 알 수 없음
    //        Supplier<테스트클래스> supplier2 = () -> 테스트클래스::new; // ERROR
    //        Function<String, 테스트클래스> function2 = name -> 테스트클래스::new; // ERROR
    }
}
