package 스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class 스트림의활용2 {
    public static void main(String[] args) {

        List<Member> members = new ArrayList<>();

        members.add(new Member("둘리", 31));
        members.add(new Member("홍길동", 35));
        members.add(new Member("임꺽정", 32));
        members.add(new Member("김미영", 52));
        members.add(new Member("고길동", 41));

        // 스트림 객체를 생성해서
        List<String> memberNames = members.stream()
                                    // 필터를 및 소트를 통해 데이터를 추출하고
                                    .filter(member -> member.getAge() > 34)
                                    .sorted()
                                    .map(Member::getName)
                                    .collect(Collectors.toList());

        for(String name : memberNames) {
            System.out.println(name);
        }
    }
}
