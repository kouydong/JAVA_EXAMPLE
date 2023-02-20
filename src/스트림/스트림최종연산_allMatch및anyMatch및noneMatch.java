package 스트림;

import java.util.stream.Stream;

public class 스트림최종연산_allMatch및anyMatch및noneMatch {
    public static void main(String[] args) {

        // 모든 조건이 매치 된 경우 true 반환합니다.
        boolean 모두50점이상 = Stream.of(95, 100, 51, 55, 60, 86).allMatch(integer -> integer > 50);
        System.out.println("모두 50점이 넘나요?" + 모두50점이상);

        // 조건 중에 하나라도 매치 된 경우 true 반환합니다.
        boolean 한명이라도90점이상 = Stream.of(95, 100, 51, 55, 60, 86).anyMatch(integer -> integer >= 90);
        System.out.println("90점 이상 존재 여부?" + 한명이라도90점이상);

        // 모든 조건이 매치 되지 않은 경우 true 반환
        boolean 모두50점이하 = Stream.of(95, 100, 51, 55, 60, 86).noneMatch(integer -> integer < 50);
        System.out.println("모두 50점 이하인가요?" + 모두50점이하);

        boolean 모두60점이하 = Stream.of(95, 100, 51, 55, 60, 86).noneMatch(integer -> integer < 60);
        System.out.println("모두 60점 이하인가요?" + 모두60점이하);
    }
}
