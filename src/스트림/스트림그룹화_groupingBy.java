package 스트림;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Arrays.stream;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.partitioningBy;

class Person2 {
    String name;
    int sex;
    int age;

    public Person2(String name, int sex, int age)
    {
        this.name = name;
        this.sex  = sex;
        this.age  = age;
    }

    @Override
    public String toString() {
        return "name=" + name + ",sex=" + sex + ",age=" + age;
    }
}
public class 스트림그룹화_groupingBy {
public static void main(String[] args) {
    List<Person2> personList = new ArrayList<>();
    personList.add(new Person2("홍길동", 1, 99));
    personList.add(new Person2("임꺽정", 1, 30));
    personList.add(new Person2("신사임당", 2, 22));
    personList.add(new Person2("고길동", 1, 45));
    personList.add(new Person2("이순신", 1, 38));
    personList.add(new Person2("황진이", 2, 24));
    personList.add(new Person2("유관순", 2, 17));
    personList.add(new Person2("김혜영", 2, 38));
    personList.add(new Person2("심순애", 2, 24));
    personList.add(new Person2("전봉준", 1, 37));

    System.out.println("성별로 분할 처리");
    Map<Boolean, List<Person2>> personBySex = personList.stream().collect(groupingBy(person2 -> person2.sex == 1));
    System.out.println(personBySex.get(true));
    System.out.println(personBySex.get(false));

    System.out.println("나이로 분할 처리");
    Map<Boolean, List<Person2>> personByAge = personList.stream().collect(groupingBy(person2 -> person2.age > 40));
    System.out.println("40이상인 유저 " + personByAge.get(true));
    System.out.println("40이하인 유저 " + personByAge.get(false));


    System.out.println("최고 나이 처리");
    Map<Boolean, Optional<Person2>> personByMaxBy = personList.stream().collect(
            partitioningBy(person2 -> person2.sex == 1, maxBy(comparingInt(person2 -> person2.age))));
    System.out.println("남자 최고 나이 " + personByMaxBy.get(true).get());
    System.out.println("여자 최고 나이 " + personByMaxBy.get(false).get());

    System.out.println("다중 분할 처리");
    Map<Boolean, Map<Boolean, List<Person2>>> multiPartioning = personList.stream().collect(partitioningBy(person2 -> person2.age > 40, partitioningBy(person2 -> person2.sex ==1)));
    System.out.println(multiPartioning.get(true).get(true)); // 40이상이면서 남자
    System.out.println(multiPartioning.get(false).get(true)); // 40이하이면서 남자
}
}
