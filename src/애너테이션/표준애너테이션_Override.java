package 애너테이션;

class 부모클래스 {

    void 부모클래스매서드() {}
}

public class 표준애너테이션_Override extends 부모클래스 {

    // @Override 애너테이션을 통해 재정할 메서드에 대해 컴파일러가 사전 점검해 줌
    @Override
    void 부모클래스매서드() {} // ERROR 부모객체에 Override 할 메서드가 없음

}
