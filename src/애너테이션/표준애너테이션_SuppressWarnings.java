package 애너테이션;

import java.util.ArrayList;
import java.util.List;

public class 표준애너테이션_SuppressWarnings {
    public static void main(String[] args) {

        @SuppressWarnings("unchecked")
        // 지네릭스 인터페이스 및 클래스로 타입을 설정하지 않아 경고 메시지가 발생해야 하지만 @SuppressWarnings를 통해 경고 메시지를 억제합니다.
        List list = new ArrayList<>();
        list.add(new String("홍길동"));
    }
}
