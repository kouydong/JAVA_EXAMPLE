package 열거형상수;

enum 자동차상수 {
    자동차명("소나타"),
    배기량("2000"),
    도어("4"),
    컬러("흰색");

    // 열거형 맴버를 추가하기 위해서는 IV(Instance Variable)를 선언하고 생성자를 통해 값을 설정합니다.
    private final String value;

    // 생성자 호출
    자동차상수(String value) {this.value = value;}
}

public class 열거형맴버추가 {
    public static void main(String[] args) {

        // 열거형 클래스의 생성자는 접근제어자가 private 로 설정되기 때문에 생성자 호출이 불가합니다.
        // 자동차상수 carList = new 자동차상수("소나타"); // ERROR
    }
}