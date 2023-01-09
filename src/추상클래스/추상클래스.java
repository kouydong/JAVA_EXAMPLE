package 추상클래스;

/**
 * 추상 클래스의 사용
 * 추상 클래스를 사용하는 목적
 * 추상 클래스는 공통적으로 사용하는 메소드를 선언하여 상속 받은 클래스에서 직접 사용하거나 Overriding 을 통해 구현하게 만듬
 * 일반 클래스와 차이점은 단지 추상 메서드를 포함 여부 이외에 차이점이 없음(맴버 변수, 맴버 메소드, 상수 등을 가질 수 있음)
 *
 * 수강 신청 기간 중 학생들의 수강 신청 검색 데이터를 기반으로 다음 학기 개설 과목 선정(e.g : JAVA, Python, Machine Learning 등)
 * 데이터 분석 목적
 * 학생들의 검색 데이터를 통해 학생들이 가장 배우고 싶고 인기 잇는 과목들을 개설하여, 흥미를 유발하고 학업의 집중하여 학업 성취도 및 만족도를
 *
 */
abstract class 디폴트카 {
    abstract void 차량바디만들기();

    void 타이어만들기(String carName, Integer size) {
        System.out.printf("%s 차량의 %d 사이즈 타이어를 장착 합니다.\n", carName, size);
    }
}

class 소나타 extends 디폴트카 {

    @Override // 메소드를 오버라이딩
    void 차량바디만들기() {
        System.out.println("소나타 차량 바디를 장착합니다.");
    }

}

class 제니시스 extends 디폴트카 {
    @Override // 메소드를 오버라이딩
    void 차량바디만들기() {
        System.out.println("제니시스 차량 바디를 장착합니다.");
    }

}

public class 추상클래스 {

    public static void main(String[] args) {

        소나타 car1 = new 소나타();
        제니시스 car2 = new 제니시스();

        car1.차량바디만들기();
        car1.타이어만들기("소나타",19);

        car2.차량바디만들기();
        car2.타이어만들기("제니시스", 21);
    }

}
