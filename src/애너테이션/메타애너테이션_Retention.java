package 애너테이션;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME) // 컴파일 이후 클래스파일이 생성되고 실행 환경까지 수행합니다.
@interface RetentionAnnotation {
}

@RetentionAnnotation // ElementType.Type 적용 범위
public class 메타애너테이션_Retention {

    @RetentionAnnotation // ElementyType.Method 적용 범위
    public String myAnnotation() {
        return "어노테이션 만들기";
    }

    @RetentionAnnotation
    String message;

    public static void main(String[] args) {

    }
}