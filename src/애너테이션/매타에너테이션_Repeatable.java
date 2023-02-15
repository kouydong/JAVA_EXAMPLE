package 애너테이션;

import java.lang.annotation.*;

// RePeatableAnnotation을 받기 위한 애너테이션
@interface RepeatableAnnotations {
    RepeatableAnnotation[] value();
}

//@Repeatable(RepeatableAnnotations.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@interface RepeatableAnnotation {
    String value();
}

//@RepeatableAnnotation("Repeatable 테스트 1")
//@RepeatableAnnotation("Repeatable 테스트 2")
public class 매타에너테이션_Repeatable {
    public static void main(String[] args) {

    }
}