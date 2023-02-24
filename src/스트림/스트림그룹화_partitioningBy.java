package 스트림;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

class Person {
    String name;
    int sex;
    int age;

    public Person(String name, int sex, int age)
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

public class 스트림그룹화_partitioningBy {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("홍길동", 1, 99));
        personList.add(new Person("임꺽정", 1, 30));
        personList.add(new Person("신사임당", 2, 22));
        personList.add(new Person("고길동", 1, 45));
        personList.add(new Person("이순신", 1, 38));
        personList.add(new Person("황진이", 2, 24));
        personList.add(new Person("유관순", 2, 17));
        personList.add(new Person("김혜영", 2, 38));
        personList.add(new Person("심순애", 2, 24));
        personList.add(new Person("전봉준", 1, 37));

        System.out.println("personList : " + personList.toString());

        System.out.println("나이로 분할 처리");
        Map<Boolean, List<Person>> personByAge = personList.stream().collect(partitioningBy(person -> person.age > 40));
        System.out.println("40이상인 유저 " + personByAge.get(true));
        System.out.println("40이하인 유저 " + personByAge.get(false));


        System.out.println("성별로 분할 처리");
        Map<Boolean, Long> personBySex = personList.stream().collect(partitioningBy(person -> person.sex == 1,counting()));
        System.out.println("남자인 학생 " + personBySex.get(true));
        System.out.println("여자인 학생 " + personBySex.get(false));


        System.out.println("최고 나이 처리");
        Map<Boolean, Optional<Person>> personByMaxBy = personList.stream().collect(
                partitioningBy(person -> person.sex == 1, maxBy(comparingInt(person -> person.age))));
        System.out.println("남자 최고 나이 " + personByMaxBy.get(true).get());
        System.out.println("여자 최고 나이 " + personByMaxBy.get(false).get());

        System.out.println("다중 분할 처리");
        Map<Boolean, Map<Boolean, List<Person>>> multiPartioning = personList.stream().collect(partitioningBy(person -> person.age > 40, partitioningBy(person -> person.sex ==1)));
        System.out.println(multiPartioning.get(true).get(true)); // 30이상이면서 남자
        System.out.println(multiPartioning.get(false).get(true)); // 30이하이면서 남자

    }
}
