package 추상클래스;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

abstract class 디폴트카1 {
    private Integer 휠사이즈;
    private String 차량명;
    void 차량바디만들기(String 차량명) {System.out.println(차량명 + "차량 바디를 장착합니다."); }
    void 타이어만들기(Integer 휠사이즈) {System.out.printf("%d 사이즈 타이어를 장착 합니다.\n", 휠사이즈);}
    abstract void 차량특성();
}

class 소나타1 extends 디폴트카1 {
    void 차량특성() {System.out.println("소나타의 자체 특성을 구현합니다.");}
}

public class 추상클래스작성_유의사항 {
    public static void main(String[] args) {

        소나타1 car1 = new 소나타1();
        car1.차량바디만들기("소나타"); //  OK
        car1.타이어만들기(19); // OK
        car1.차량특성(); // OK

        디폴트카1 car2 = new 소나타1();
        car2.차량바디만들기("소나타"); // OK
        car2.타이어만들기(19); // OK
        car2.차량특성(); // OK

    }
}
