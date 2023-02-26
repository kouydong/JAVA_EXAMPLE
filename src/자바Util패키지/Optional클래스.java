package 자바Util패키지;

import java.util.Optional;

public class Optional클래스 {
    public static void main(String[] args) {

        // 아무것도 없는 Optional 객체 생성
        Optional<Object> optional1 = Optional.empty();
        // Optional 객체 생성
        Optional<String> optional2 = Optional.of("안녕하세요");
        Optional<Integer> optional3 = Optional.of(4);
        // of 메서드의 경우 null 을 담을 수 없으므로 NullPointException 발생합니다.
        // Optional<String> optional4 = Optional.of(null);
        // ofNullable 메서드의 경우 null 을 포함할 수 있으므로 NullPointException 이 발생하지 않습니다.
        Optional<String> optional5 = Optional.ofNullable(null);
        Optional<String> optional6 = Optional.ofNullable(null);

        // 객체 값 가져오기 null 경우 NullPointException 발생
        System.out.println("get() 방식으로 값 가져오기 " + optional2.get());

        // 객체 값이 null일 경우 대체값으로 반환합니다.
        System.out.println("orElse() 방식으로 값 가져오기 " + optional1.orElse("optional1의 대체값"));

        // 값이 null 경우 대체값으로 교환합니다. get() 및 else() 메서드의 기능을 함께 가지고 있습니다.
        System.out.println(optional5.orElseGet(() -> "optional5 대체값"));
        System.out.println(optional5.orElseGet(() -> new String("optional5 대체값")));

        // 메서드 참조 방식으로 값 설정
        System.out.println(optional5.orElseGet(String::new));

        // 값이 null 경우 메소드 참조방식으로 NPE 예외 발생
        // optional6.orElseThrow(NullPointerException::new);

        // 값이 null 경우 람다식으로 NPE 발생
        // optional6.orElseThrow(() -> new NullPointerException("Null 발생"));

        // isPresent 메서드는 optional 객체의 값이 null 이면 false null 이아니면 true 반환
        System.out.println("option5 값은 null이 아닌가요? " + optional5.isPresent());
        System.out.println("option2 값은 null이 아닌가요? " + optional2.isPresent());

        // ifPresnt 메서드는 Optional 객체의 값이 null 이 아닐 때만 작업을 수행합니다.
        Optional.ofNullable(null).ifPresent(o -> System.out.println(o)); // 아무 작업을 하지 않음
        Optional.ofNullable("람다식표현").ifPresent(o -> System.out.println(o)); // 값이 널이 아니므로 해당 문자열 출력
        Optional.ofNullable("메서드참조표현").ifPresent(System.out::println); // 값이 널이 아니므로 해당 문자열 출력

        // Optional 객체에서 filter(), map()등을 사용하여 조건을 설정하실 수 있습니다.
        System.out.println("해당 값은 " + Optional.of("4566").map(Integer::parseInt).get() * 2);
    }
}
