package 스트림;

import java.util.*;
import java.util.stream.Collectors;

public class List스트림 {
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

        List<String> ddd = lists.stream().map(streamMap -> streamMap.get("userid")).collect(Collectors.toList());

        System.out.println("ddd" + ddd.toString().replaceAll("\\[","").replaceAll("\\]",""));

;






    }
}
