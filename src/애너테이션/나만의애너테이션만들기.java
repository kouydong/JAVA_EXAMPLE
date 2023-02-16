package 애너테이션;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.Date;

@Target({ElementType.FIELD,ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface 내애너테이션1 {
    // value 값일 기본 메서드로 애너테이션 호출 시 요소가 value 있는 경우 요소의 이름을 생략하실 수 있습니다.
    String value();
    // default 키워드를 통해 요소의 기본값을 설정 하실 수 있습니다.
    int count() default 1;
    // 요소의 타입이 배열인 경우 괄호를 사용해야 합니다.
    String[] names();
}

@Target({ElementType.FIELD,ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface 내애너테이션2 {
    // Value 값일 기본 메서드로 애너테이션 호출 시 요소의 이름을 생략하실 수 있습니다.
    String value();
}

public class 나만의애너테이션만들기 {
    @내애너테이션1(value = "value 요소 생략 가능", count=3, names = {"홍길동", "임꺽정", "고길동"})
    @내애너테이션2("value 요소 생략 가능")
    public static void main(String[] args) {

        Class<나만의애너테이션만들기> class객체 = 나만의애너테이션만들기.class;

        내애너테이션1 annotation1 = class객체.getAnnotation(내애너테이션1.class);
        내애너테이션2 annotation2 = class객체.getAnnotation(내애너테이션2.class);

        System.out.println("내애너테이션1 값1 : " + annotation1.value());
        System.out.println("내애너테이션1 값2 : " + annotation1.count());
        System.out.println("내애너테이션1 값3 : " + annotation1.names());

        System.out.println("내애너테이션2 값1 : " + annotation2.value());
    }
}
