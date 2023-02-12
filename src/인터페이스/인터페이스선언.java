package 인터페이스;

import java.util.Calendar;
import java.util.List;

public interface 인터페이스선언 {

    // 맴버 변수로 상수만 선언 가능합니다.
    // public final static long MAXSIZE = 100l 을 의미합니다.
    long MAXSIZE = 100l;
    int AGE = 40;

    // 디폴트 메서드 선언 및 구현이 가능합니다.
    // 자동으로 public abstract 형태로 선언되기 때문에 default 키워드 입력이 필요합니다.
    default long getMaxSize() {
        return this.MAXSIZE;
    }

    // static 메서드 선언 및 구현이 가능합니다.
    // 자동으로 public 형태로 선언되며 public static int getAge()을 의미합니다.
    static int getAge() {
        return AGE;
    }

    // 추상 메서드 선언 시 자동으로 public abstract 키워드가 생성됩니다.
    // public abstract String getName()을 의미합니다.
    String getName();

}
