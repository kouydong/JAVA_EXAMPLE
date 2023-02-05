package 람다;
/**
 * 작성자 : kudd
 * 함수형 인터페이스란?
 * 람다식을 사용하기 위해서는 함수형 인테페이스를 구현해야 합니다.
 * 인터페이스의 경우 여러개의 추상 메서드들을 포함할 수 있지만 함수형 인터페이스의 경우 단 하나의 추상메서드만 포함할 수 있습니다.(여러개의 추상 메서드 선언 불가)
 * 즉 Functional Interface 는 일반적으로 '구현해야 할 추상 메소드가 하나만 정의된 인터페이스'를 가리킵니다.
 * 함수형 인터페이스는 @FunctionalInterface 어노테이션을 통해 선언할 수 있습니다.
 */
public class 함수형인터페이스예제2 {

    public static void main(String[] args) {
        // 함수형 인터페이스 정의된 '두값의계산' 메소드를 overriding
        함수형인터페이스 더하기 = ((first, second) -> first + second);

        // Overriding 함수를 호출
        System.out.printf("두 값의 합은 %d \n", 더하기.두값의계산(5,9));

        // 함수형 인터페이스 정의된 '두값의계산' 메소드를 overriding
        함수형인터페이스 빼기 = ((first, second) -> first - second);

        // Overriding 함수를 호출
        System.out.printf("두 값의 차는 %d \n", 빼기.두값의계산(5,9));
    }
}



/**
 * 작성자 : kudd
 * 함수형 인터페이스란?
 * 람다식을 사용하기 위해서는 함수형 인테페이스를 구현해야 합니다.
 * 인터페이스의 경우 여러개의 추상 메서드들을 포함할 수 있지만 함수형 인터페이스의 경우 단 하나의 추상메서드만 포함할 수 있습니다.(여러개의 추상 메서드 선언 불가)
 * 즉 Functional Interface 는 일반적으로 '구현해야 할 추상 메소드가 하나만 정의된 인터페이스'를 가리킵니다.
 * 함수형 인터페이스는 @FunctionalInterface 어노테이션을 통해 선언할 수 있습니다.
 */

// 함수형 인터페이스 설정
@FunctionalInterface
interface 함수형인터페이스 {

    // 구현해야 할 추상 메소드를 하나만 가질 수 있음
    int 두값의계산(int first, int second);

    // 구현해야 할 추상 메소드가 2개인 경우 오류 발생
//    public int xMoving(int x, int y);
}

