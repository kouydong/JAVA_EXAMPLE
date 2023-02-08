package 스트림;

import java.util.Arrays;
import java.util.Comparator;

public class 스트림중간연산_sorted {
public static void main(String[] args) {
    // Stream<T> sorted() : 스트림 요소를 정렬합니다.
    Integer[] integers = new Integer[] {1,6,4,3,8,5,2,7,8,8};

    // 기본(순차) 정렬로 출력
    System.out.println("기본(순차) 정렬로 출력합니다.");
    Arrays.stream(integers).sorted().forEach(System.out::print);

    // 역순 정렬로 출력
    System.out.println("\n역순으로 정렬합니다.");
    Arrays.stream(integers).sorted(Comparator.reverseOrder()).forEach(System.out::print);

    // 기본(순차) 정렬로 출력(람다식 사용)
    System.out.println("\n람다식으로 기본(순차) 정렬로 출력합니다.");
    Arrays.stream(integers).sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::print);

    // 기본(순차) 정렬로 출력(메소드 참조식)
    System.out.println("\n메소드참조식으로 기본(순차) 정렬로 출력합니다.");
    Arrays.stream(integers).sorted(Integer::compareTo).forEach(System.out::print);
}
}
