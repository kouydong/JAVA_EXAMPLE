package 애너테이션;

import java.lang.annotation.*;


@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME) // 컴파일 이후 클래스파일이 생성되고 실행 환경까지 수행합니다.
@Documented
@interface DocumentedAnnotation {
}

@DocumentedAnnotation // ElementType.Type 적용 범위
public class 메타애너테이션_Documented {

    @DocumentedAnnotation // ElementyType.Method 적용 범위
    public String myAnnotation() {
        return "어노테이션 만들기";
    }

    @DocumentedAnnotation
    String message;

    public static void main(String[] args) {

    }
}