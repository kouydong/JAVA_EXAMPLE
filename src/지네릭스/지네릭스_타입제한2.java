package 지네릭스;
class 지네릭스<T> {
    T item;
    String toString(T item) {
        return String.valueOf(item);
    }

    // ERROR
    // 지네릭스 클래스에서 타입변수는 서로 다른 타입을 가질 수 있기 때문에 static 변수, 메서드를 설정하실 수 없습니다.
    /*
    static T item2;

    String toString(T item) {
        return String.valueOf(item);
    }
    */
}

public class 지네릭스_타입제한2 {
    public static void main(String[] args) {

    }
}
