package 스트림;

import java.util.Arrays;

public class 스트림중간연산_limit {
    public static void main(String[] args) {
        // Stream<T> limit(long maxsize) : maxsize 이후으 스트림 요소는 잘러 냅니다.
        // maxSize 2 이후의 스트림 요소는 잘러 냅니다.
        String[] names = {"홍길동", "임꺽정", "고길동", "둘리", "김하나"};
        Arrays.stream(names).limit(2).forEach(name -> System.out.println("이름은 : " + name));
    }
}
