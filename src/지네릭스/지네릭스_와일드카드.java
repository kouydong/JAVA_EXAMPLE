package 지네릭스;

class 자동차<T> {
    public String toString() {return "자동차";}
}
class 중형자동차<T> extends 자동차 {
    public String toString() {return "중형자동차";}
}
class K5 extends 중형자동차<K5> {
    public String toString() {return "K5자동차";}
}

class 지네릭스클래스<T> {

    // 매서드의 매개변수로 '중형자동차'의 자손 객체만 매게변수 참조가 가능합니다.
    중형자동차 중형자동차만들기(자동차<? extends 중형자동차> car) {

        return new 중형자동차();
    }
}

public class 지네릭스_와일드카드 {
    public static void main(String[] args) {
        // '중형자동차' 자손 클래스만 가능
        지네릭스클래스<? extends 중형자동차> car1 = new 지네릭스클래스<K5>();

        // '자동차' 자손 클래스만 가능
        지네릭스클래스<? extends 자동차> car2 = new 지네릭스클래스<K5>();

        // '중형자동차' 조상 클래스만 가능
        지네릭클래스<? super 중형자동차> car3 = new 지네릭클래스<자동차>();

        // '중형자동차' 조상 클래스만 가능
        // 지네릭스클래스<? super 중형자동차> car4 = new 지네릭스클래스<K5>(); // ERROR

        car1.중형자동차만들기(new 중형자동차());
        car2.중형자동차만들기(new K5());
        //car3.중형자동차만들기(new 자동차()); // ERROR
    }
}
