package 스트림;

import java.util.Random;
import java.util.stream.Collectors;

public class 스트림활용_인증번호 {
    public static void main(String[] args)
    {
        String sNumbers =
                new Random()
                        .ints(100000, 1000000)
                        .limit(1)
                        .mapToObj(value -> String.valueOf(value))
                        .collect(Collectors.joining());
        System.out.printf("인증번호 %s", sNumbers);

    }
}
