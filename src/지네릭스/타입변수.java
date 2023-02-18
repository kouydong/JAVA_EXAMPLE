package 지네릭스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class 지네릭클래스<T>
{
    private String name;
    private int age;
}

class 클래스 {

}
public class 타입변수 {
    public static void main(String[] args) {

        // Conllection List 지네릭 클래스의 타입을 String 으로 제한
        List<String> list = new ArrayList<>();

        // Collection Map 지네릭 클래스의 타입을 String, String 으로 제한
        Map<String, String> map = new HashMap<>();

        // 지네릭 클래스 객체를 생성 시 타입 변수 대신 실제 타입을 대입합니다.
        지네릭클래스<클래스> 객체 = new 지네릭클래스();
    }
}
