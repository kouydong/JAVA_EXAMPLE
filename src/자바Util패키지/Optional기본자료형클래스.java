package 자바Util패키지;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class Optional기본자료형클래스 {
    public static void main(String[] args) {
        OptionalInt intValue = OptionalInt.of(1);
        OptionalLong longValue = OptionalLong.of(2);
        OptionalDouble doubleValue = OptionalDouble.of(3);

        // OptionalInt 값을 가져오기 위해서는 getAsInt() 메서드를 사용합니다.
        System.out.println("int 값 가져오기 " + intValue.getAsInt());

        // OptionalInt 값을 가져오기 위해서는 getAsLong() 메서드를 사용합니다.
        System.out.println("long 값 가져오기 " + longValue.getAsLong());

        // OptionalInt 값을 가져오기 위해서는 getAsInt() 메서드를 사용합니다.
        System.out.println("double 값 가져오기 " + doubleValue.getAsDouble());

        // isPresent() 메서드를 통해 값의 존재 여부를 확인할 수 있습니다.
        System.out.println("int 값 존재 여부 " + intValue.isPresent());
        System.out.println("long 값 존재 여부 " + longValue.isPresent());
        System.out.println("double 값 존재 여부 " + doubleValue.isPresent());
    }
}
