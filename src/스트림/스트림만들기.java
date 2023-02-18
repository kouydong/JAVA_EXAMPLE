package 스트림;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class 스트림만들기 {
    public static void main(String[] args) {
        // List 스트림을 생성합니다.
        List<String> 리스트컬렉션 = new ArrayList<String>();
        리스트컬렉션.add("리스트 홍길동");
        리스트컬렉션.add("리스트 임꺽정");

        // Set 스트림을 생성합니다.
        HashSet<String> 집합컬렉션 = new HashSet<>();
        집합컬렉션.add("집합 홍길동");
        집합컬렉션.add("집합 임꺽정");

        // forEach를 통해 스트림을 소비합니다.
        리스트컬렉션.stream().forEach(System.out::println);
        집합컬렉션.stream().forEach(string -> System.out.println(string));
    }
}
