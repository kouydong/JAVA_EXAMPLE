package 람다;

public class 람다예제1 {
    public static void main(String[] arguments) {
    /*
        1. 람다는 매개변수 화살표(->) 함수몸체로 이용하여 사용 할 수 있음
        2. 함수몸체가 단일 실행문이면 괄호{}를 생략 할 수 있습니다.
        3. 함수몸체가 return문으로만 구성되어 있는 경우 괄호{}를 생략 할 수 없음.
        4. 전달되는 매게변수가 2개 이상인 경우 소괄호('()')를 생략 할 수 없음.
        ((x, y) -> {}) // OK
        (x, y -> {}) // ERROR
     */

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("스레드를 실행합니다1");
            }
        }).start();

        // 상기 구문을 람다식으로 변경
        new Thread(()-> {
            System.out.println("스레드를 실행합니다2");
        }).start();
    }
}
