package 애너테이션;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
}

@MyAnnotation // ElementType.Type 적용 범위
public class 메타에너테이션_Target {

    @MyAnnotation // ElementyType.Method 적용 범위
    public String myAnnotation() {
        return "어노테이션 만들기";
    }

    @MyAnnotation
    String message;

    public static void main(String[] args) {

    }
}
