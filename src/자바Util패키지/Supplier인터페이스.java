package 자바Util패키지;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public interface Supplier인터페이스 {

    static void main(String[] args) {

        // 매개변수가 없고 출력만 있는 함수형 인터페이스를 구현할 때 사용합니다.
        // 문자열 supplier 구현
        Supplier<String> stringSupplier = () -> "Hello world";
        System.out.println("문자열은 : " + stringSupplier.get());

        // 로또 번호 만들기
        Supplier<Integer> intSupplier = () -> (int) (Math.random() * 45) + 1;
        List<Integer> lottoLists = new ArrayList<>();
        for(int i = 0; i < 6; i++) {
            lottoLists.add(intSupplier.get());
        }
        lottoLists.stream().sorted().forEach(System.out::println);
    }
}
