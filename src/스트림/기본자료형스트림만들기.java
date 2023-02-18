package 스트림;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 기본자료형스트림만들기 {
    public static void main(String[] args) {
        IntStream 정수형스트림 = Arrays.stream(new int[]{4,6,45,35,2,1});

        System.out.println("배열 평균은 =" + Arrays.stream(new int[]{4,6,45,35,2,1}).average());
        System.out.println("배열 합계는 =" + Arrays.stream(new int[]{4,6,45,35,2,1}).count());
        System.out.println("배열 카운트는 =" + Arrays.stream(new int[]{4,6,45,35,2,1}).sum());

        // average(), sum(), count()의 경우 최종연산을 통해 스트림을 소비하므로 재 생성이 필요합니다.
//        System.out.println("배열 평균은 = " + 정수형스트림.average());
//        System.out.println("배열 합계는" + 정수형스트림.sum());
//        System.out.println("배열 카운트 =" + 정수형스트림.count());
    }
}
