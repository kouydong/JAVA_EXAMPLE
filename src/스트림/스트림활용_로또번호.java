package 스트림;

import java.util.Random;
import java.util.stream.Collectors;

public class 스트림활용_로또번호 {
    public static void main(String[] args) {
        String sNumbers =
                new Random()
                        .ints(1, 46)
                        .distinct()
                        .limit(6)
                        .sorted()
                        .mapToObj(value -> String.valueOf(value) + " ")
                        .collect(Collectors.joining());
        System.out.printf("로또번호 %s", sNumbers);
    }

}

