package 람다;

import java.util.function.Function;
import java.util.function.Supplier;

class 생성자테스트클래스 {
    // 기본 생성자
    생성자테스트클래스() {}

}
class 생성자테스트클래스2 {
    private String name;
    // 매게변수 하나를 받는 생성자
    생성자테스트클래스2(String name) { this.name = name; }
}
public class 생성자메서드참조1 {
    public static void main(String[] args) {

        // 생성자 메서드의 '람다' 예시
        // Supplier 함수형 인터페이스는 매개변수 없고 반환값만 설정할 수 있는 함수형 인터페이스 입니다.
        Supplier<생성자테스트클래스> supplier1 = () -> new 생성자테스트클래스();

        // 생성자 메서드의 '메서드 참조' 예시
        // Supplier 함수형 인터페이스는 매개변수가 없고 반환값만 설정할 수 있는 함수형 인터페이스로 기본 생성자 메서드 생성시 'new'키워드를 통해서 가능합니다.
        Supplier<생성자테스트클래스> supplier2 = 생성자테스트클래스::new;
        생성자테스트클래스 class1 = supplier1.get();
        생성자테스트클래스 class2 = supplier2.get();

        // 생성자 메서드의 '람다' 예시
        // Function 함수형 인터페이스는 매개변수 및 반환 값을 선언할 수 있으며 입력값을 받아서 반환 형태로 표현해 줍니다. 매게변수가 있는 생성자 생성 시 사용합니다.
        Function<String, 생성자테스트클래스2> function1 = name -> new 생성자테스트클래스2(name);

        // 생성자 메서드의 '람다' 예시
        // Function 함수형 인터페이스는 매개변수 및 반환 값을 선언할 수 있으며 매게변수를 및 반환값을 알 수 있으면 생성자를 호출 할 수 있습니다.
        Function<String, 생성자테스트클래스2> function2 = 생성자테스트클래스2::new;

        생성자테스트클래스2 class3 = function1.apply("홍길동");
        생성자테스트클래스2 class4 = function2.apply("임꺽정");
    }
}
