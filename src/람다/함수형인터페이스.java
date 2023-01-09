package 람다;

/**
 * 작성자 : kudd
 *
 * 함수형 인터페이스란?
 * 람다식을 사용하기 위해서는 클래스가 함수형 인터페이스로 정의 되어 있어야 합니다.
 * Functional Interface 는 일반적으로 '구현해야 할 추상 메소드가 하나만 정의된 인터페이스'를 가리킵니다.
 * @FunctionalInterface 어노테이션을 통해 함수형 인터페이스를 설정
 *
 */

// 함수형 인터페이스 설정
@FunctionalInterface
public interface 함수형인터페이스 {
    // 구현해야 할 추상 메소드를 하나만 가질 수 있음
    int 두값의계산(int first, int second);
    // 구현해야 할 추상 메소드가 2개인 경우 오류 발생
//    public int xMoving(int x, int y);

}
