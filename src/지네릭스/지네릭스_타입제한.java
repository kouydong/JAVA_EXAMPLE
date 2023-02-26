// '자동차' 클래스 구현
class 자동차<T>{}

// 중형 자동차 클래스 구현('소나타' 및 'K5' 타입으로 제한)
class 중형자동차<T extends 소나타> extends 자동차 {}

// '소나타' 클래스 구현
class 소나타 extends 자동차 {}

// 'K5' 클래스 구현
class K5 extends 자동차 {}

// '레이' 클래스 구현
class 레이 extends 자동차 {}


public class 지네릭스_타입제한 {
    public static void main(String[] args) {

        자동차<소나타> car1 = new 자동차<>(); // OK
        // 타입 변수에 대입은 인스턴스 별로 다르게 가능 합니다.
        자동차<K5> car4 = new 자동차<>(); // OK

        중형자동차<소나타> car2 = new 중형자동차<>(); // OK

        자동차<레이> car3 = new 자동차<>(); // OK

        // 중형자동차의 Generics 타입을 '소나타' 클래스로 제한하여 다른 클래스를 참조 타입으로 설정 불가.
        // 중형자동차<레이> car4 = new 자동차<>(); // ERROR
    }
}
