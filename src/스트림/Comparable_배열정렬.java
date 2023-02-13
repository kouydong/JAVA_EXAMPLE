package 스트림;

import java.util.Arrays;
import java.util.function.Predicate;

public class Comparable_배열정렬 {
    public static void main(String[] args) {
        String[] stringArrays = {"Dog", "Zebra", "Lion", "Tiger", "Cat"};

        // 대소문자를 구분하여 오름 차순 정렬(정렬 대상만 있음)
        Arrays.sort(stringArrays);
        System.out.println("Arrays.sort() 메서드를 통한 정렬 : " + Arrays.toString(stringArrays));

        // 대소문자 구분없이 오름 차순 정렬(정렬 대상 + 정렬 기준)
        Arrays.sort(stringArrays, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Arrays.sort() 메서드를 통한 정렬 : " + Arrays.toString(stringArrays));

        // 대소문자 구분없이 내림 차순 정렬(정렬 대상 + 정렬 기준)
        Arrays.sort(stringArrays, String.CASE_INSENSITIVE_ORDER.reversed());
        System.out.println("Arrays.sort() 메서드를 통한 정렬 : " + Arrays.toString(stringArrays));

    }
}
