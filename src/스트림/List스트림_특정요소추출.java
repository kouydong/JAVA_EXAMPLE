package 스트림;

import java.util.*;
import java.util.stream.Collectors;

public class List스트림_특정요소추출 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("userid", "홍길동");
        map1.put("password", "1234");

        Map<String, String> map2 = new HashMap<>();
        map2.put("userid", "임꺽정");
        map2.put("password", "5678");

        List<Map<String, String>> lists = new ArrayList<>();

        lists.add(map1);
        lists.add(map2);
        // [{password=1234, userid=홍길동}, {password=5678, userid=임꺽정}]

        // List 객체를 스트림으로 만들고 Map 컬렉션을 -> String 객체로 변환합니다.
        // map은 데이터 타입을 변환 하는 경우 사용합니다.
        List<String> newLists = lists.stream().map(streamMap -> String.valueOf(streamMap.get("userid"))).collect(Collectors.toList());

        System.out.println("newLists" + newLists.toString().replaceAll("\\[","").replaceAll("\\]",""));
    }
}
