package 열거형상수;

public class 열거형클래스 {
    enum 소나타{자동차명, 배기량, 도어, 컬러};
    enum K5 {자동차명, 배기량, 도어, 컬러};

    public static void main(String[] args) {

        소나타 car1 = 소나타.자동차명;
        K5 car2 = K5.자동차명;
        소나타 car3 = 소나타.도어;
        // 열거형 상수의 비교는 '==' 및 compareTo() 메서드 사용이 가능합니다.
        if(car1 == 소나타.자동차명) System.out.println("소나타 입니다.");

        if(car2 == K5.자동차명) System.out.println("K5 입니다.");

        // compareTo() 메서드 사용
        if(car1.compareTo(소나타.도어) < 0) System.out.println("자동차 상수는 도어보다 먼저 정의된 상수 입니다.");

        // valueOf("상수이름")은 열거형 상수의 값을 반환합니다.
        // 소나타.valueOf("배기량") == 소나타.배기량
        System.out.println("상수의 값은 : " + 소나타.valueOf("배기량"));

        // values() 열거형 상수를 배열 형태로 반환합니다.
        소나타[] enumCarList = 소나타.values();
        for(소나타 car : enumCarList) {
            System.out.printf("%s %d \n",car.name(), car.ordinal());
        }
    }
}
