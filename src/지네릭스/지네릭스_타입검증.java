package 지네릭스;

import java.util.Arrays;
import java.util.List;

/**
 * JDK 1.5에처 처음 도입되었고 지네릭스는 람다식만큼 큰 변화였습니다. 컴파일 시 컬렉션 객체에 타입을 체크해주는 기능입니다. 이 기능이 도입 되기 Runtime 시 ClassCastException 때문에 고통받았던 기억들이 있을 것입니다.
 *
 * 지네릭스란 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 기능입니다. 객체의 타입을 컴파일 시에 체크하기 때문에 객체의 타입 안전성을 높이고 형변환의 번거로움을 줄어듭니다.
 *
 */
public class 지네릭스_타입검증 {

    public static void main(String[] args) {
        // Generic 클래스 미사용(타입체크 하지 않음)
        List arrayList = Arrays.asList(1,"홍길동",3);
        // Runtime 시 ClassCastException 발생
//        Integer intValue = (Integer) arrayList.get(1);


        // Generic 클래스 사용(타입체크 함)하여 컴파일 시 예외를 사전 점검합니다.
//         List<Integer> arrayList = Arrays.asList(1, "홀길동",3);

    }
}
