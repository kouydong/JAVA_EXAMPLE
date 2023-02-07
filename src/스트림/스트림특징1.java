package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 스트림특징1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 3, 2, 1); // 정수형 리스트 생성

        // 리스트스트림을 생성하고
        List<Integer> sortedlist = list.stream()
            // 중간 연산을 통해 표준화된 방법으로 데이터를 정리하고
            .distinct().sorted()
            // 최종 연산을 통해 스트림을 소비하고 값을 생성합니다.
            .collect(Collectors.toList());

        // 스트림의 특징1
        // 스트림의 결과는 기존 데이터를 변경하지 않습니다.
        System.out.println("list의 값은 =>" + list);
        System.out.println("sortedlist의 값은 =>" + sortedlist);
    }
}
