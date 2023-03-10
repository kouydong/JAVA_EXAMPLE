package 컬렉션;

import java.util.*;

public class 켈렉션활용 {
    public static void main(String[] args)
    {
        /*
          {
            "res_transdt" : "20230307141111"
            "res_success" : "true",
            "res_message" : "",
            "res_cnt" : "1",
            "res_list" = [
                            {
                                "aptcd" : "29278",
                                "orgaptcd" : "29278",
                                "dongho" : "01010502",
                                "occu_date" : "20230303",
                                "rel" : "Y"
                            },
                            {
                                "aptcd" : "30574",
                                "orgaptcd" : "30574",
                                "dongho" : "12030801",
                                "occu_date" : "20230303",
                                "rel" : "Y"
                            },
                        ]
          }
        */
        // 서브 Map 1 생성
        Map<String, String> subMap1 = new LinkedHashMap<>();
        subMap1.put("aptcd"     , "29278");
        subMap1.put("orgaptcd"  , "29278");
        subMap1.put("dongho"    , "01010502");
        subMap1.put("occu_date" , "20230303");
        subMap1.put("rel"       , "Y");

        // 서브 Map 2 생성
        Map<String, String> subMap2 = new LinkedHashMap<>();
        subMap2.put("aptcd"     , "30574");
        subMap2.put("orgaptcd"  , "30574");
        subMap2.put("dongho"    , "12030801");
        subMap2.put("occu_date" , "20230303");
        subMap2.put("rel"       , "N");

        List<Map<String, String>> resList = new LinkedList<>();
        // 리스트에 Map 추가
        resList.add(subMap1);
        resList.add(subMap2);

        Map<String, Object> returnMap = new LinkedHashMap<>();
        returnMap.put("res_transdt" , "20230307141111");
        returnMap.put("res_success" , "true");
        returnMap.put("res_message" , "");
        returnMap.put("res_cnt"     , "1");
        returnMap.put("res_list"    , resList);

        System.out.println("Json 문자열 구조 " + returnMap);
        System.out.println("res_success 추출 : " + returnMap.get("res_success")); // res_success 추출
        System.out.println("res_cnt 추출 : " + returnMap.get("res_cnt")); // res_cnt 추출

        // 리스트의 0번째 요소의 rel 값 추출
        System.out.println("rel 추출 : " +  ((List<Map<String, String>>) returnMap.get("res_list")).get(0).get("rel")); // rel 추출

        // 리스트의 1번째 요소의 rel 값 추출
        System.out.println("rel 추출 : " +  ((List<Map<String, String>>) returnMap.get("res_list")).get(1).get("rel")); // rel 추출
    }

}
