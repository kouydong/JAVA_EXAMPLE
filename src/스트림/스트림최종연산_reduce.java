package 스트림;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 스트림최종연산_reduce {
    public static void main(String[] args) {
        // int 스트림 활용
        int 카운트 = IntStream.of(4,5,6,7,43,2,5,6,7).reduce(0,(left, right) -> left + 1);
        int 합계 = IntStream.of(4,5,6,7,43,2,5,6,7).reduce(0,(left, right) -> left + right);
        int 최대값 = IntStream.of(4,5,6,7,43,2,5,6,7).reduce((left, right) -> left > right ? left : right).getAsInt();
        int 최소값 = IntStream.of(4,5,6,7,43,2,5,6,7).reduce((left, right) -> left < right ? left : right).getAsInt();

        System.out.println("카운트  : " + 카운트);
        System.out.println("합  : " + 합계);
        System.out.println("최대값  : " + 최대값);
        System.out.println("최소값  : " + 최소값);

        // String 스트림 활용
        String 이름들 = Stream.of("홍길동", "임꺽정", "고길동").reduce("",(s, s2) -> s + s2 + " ");
        System.out.println("이름은" + 이름들);

    }
}
