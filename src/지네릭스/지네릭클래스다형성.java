package 지네릭스;

import java.util.ArrayList;
import java.util.List;

class 부모클래스 {}
class 아들클래스 extends 부모클래스 {}
class 딸클래스 extends 부모클래스 {}

public class 지네릭클래스다형성 {
    public static void main(String[] args) {
        // 부모 클래스를 생성하고 아들클래스및 딸 클래스를 추가합니다.
        List<부모클래스> 객체1 = new ArrayList<부모클래스>();

        // 아들 클래스 추가
        객체1.add(new 아들클래스());

        // 딸 클래스 추가
        객체1.add(new 딸클래스());
    }
}
