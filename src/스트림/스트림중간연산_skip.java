package 스트림;

import java.util.Arrays;

public class 스트림중간연산_skip {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Stream<T> skip(long n) : 앞에서부터 n 번까지 건너뛴 스트림을 생성합니다.
        // 앞에서 3개의 요소를 건너뛰고 내부 for 문을 이용하여 출력합니다.
        Arrays.stream(integers).skip(3).forEach(System.out::println);
        // 앞에서 5개의 요소를 건너뛰고 내부 for 문을 이용하여 출력합니다.
        Arrays.stream(integers).skip(5).forEach(integer -> System.out.println("값은 :" + integer));
    }
}
