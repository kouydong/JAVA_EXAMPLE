package 람다;

public class 함수형인터페이스예제1 {

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
