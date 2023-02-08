package 스트림;

import java.util.Arrays;
import java.util.List;

public class 스트림의활용1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("임꺽정", "홍길동", "신사임당");

        // List 객체로 스트림을 생성하고 forEach를 통해 각각의 리스트 영역을 추출함
        list.stream().forEach(name -> System.out.println(name));

    }
}
