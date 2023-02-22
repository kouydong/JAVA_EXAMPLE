package 스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class 스트림최종연산_collect {
public static void main(String[] args) {
    // Collectors 클래스의 toList() 메서드를 통한 List 변환
    System.out.println("List " + Stream.of(1,2,3,4,5,6,67,2).collect(Collectors.toList()));

    // Collectors 클래스의 toCollection() 메서드를 통한 ArrayList 변환
    System.out.println("Collection " + Stream.of(1,2,3,4,5,6,67,2).collect(Collectors.toCollection(ArrayList::new)));

    // Collectors 클래스의 toSet() 메서드를 통한 set 변환
    System.out.println("Set " + Stream.of(1,2,3,4,5,6,67,2).collect(Collectors.toSet()));

    // Collectors 클래스의 toMap() 메서드를 통한 map 변환
    System.out.println("Map " + Stream.of(1,2,3,4,5,6,7,8).collect(Collectors.toMap(integer -> "숫자"+integer, Integer::intValue)));

    // Collectors 클래스의 카운팅 구하기
    System.out.println("카운팅 " + Stream.of(1,2,3,4,5,6,7,8).collect(Collectors.counting()));

    // 최대값 가져오기
    IntStream intStream = new Random().ints(1,46).distinct().limit(6);
    System.out.println("최대값 " + intStream.reduce(Integer::max).getAsInt());

    // 문자열 스트림의 요소를 모두 연결
    String[] names = new String[]{"홍길동", "임꺽정", "고길동"};
    System.out.println("이름은 " + Arrays.stream(names).collect(Collectors.joining(",")));
}
}
