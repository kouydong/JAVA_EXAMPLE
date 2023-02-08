package 스트림;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class 스트림특징6 {
    public static void main(String[] args) {
        System.out.println("외부 출력");
        List<String> names =Arrays.asList("임꺽정", "홍길동", "고길동");

        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // 내부 출력1
        System.out.println("내부 출력1");
        List<String> names2 =Arrays.asList("임꺽정", "홍길동", "고길동");
        names2.stream().forEach(System.out::println);

        // 내부 출력2
        System.out.println("내부 출력2");
        names2.stream().forEach(name -> System.out.println(name));
    }
}
