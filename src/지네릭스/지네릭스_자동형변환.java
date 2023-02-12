package 지네릭스;

import java.util.ArrayList;

public class 지네릭스_자동형변환 {
public static void main(String[] args) {
    ArrayList 숫자리스트1 = new ArrayList();
    숫자리스트1.add(10);
    숫자리스트1.add(20);
    숫자리스트1.add(30);

    // 제네릭스 타입이 아니므로 형변환 시 명시적 형변환이 필요
    Integer intValue = (Integer) 숫자리스트1.get(2);
    System.out.printf("일반 타입 %d \n", intValue);

    // 지네릭스 타입으로 설정
    ArrayList<Integer> 숫자리스트2 = new ArrayList();
    숫자리스트2.add(10);
    숫자리스트2.add(20);
    숫자리스트2.add(30);

    // ArrayList<Integer> 구문을 통해 묵시적 형변환이 발생.
    Integer intValue2 =  숫자리스트2.get(2);
    System.out.printf("지네릭스 타입 %d \n", intValue2);
}
}
