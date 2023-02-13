package 애너테이션;

@FunctionalInterface
public interface 표준애너테이션_FunctionalInterface {

    // '@FunctionalInterface' 애너테이션 선언 시 단 한 개의 추상메서드만 가질 수 있고 컴파일러에 의해 사전 체크 됩니다.
    void 화면에출력(); // OK
}
