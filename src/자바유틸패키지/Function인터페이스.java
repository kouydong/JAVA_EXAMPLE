package 자바유틸패키지;

import java.util.Optional;
import java.util.function.Function;

public class Function인터페이스 {
    public static void main(String[] args) {
        Function<String, String> f = (string) -> string + "방갑습니다.";

       /**
       * Applies this function to the given argument.
       *
       * @param t the function argument
       * @return the function result
       */
        f.apply("안녕하세요");
        System.out.println(f.toString());

    }
}
