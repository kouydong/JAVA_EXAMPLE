package 레코드;
/*
자바16에 추가되었고 가장 큰 특징은 불편(immutable)의 특징을 가집니다.
*/

class 유저1 {

    private final String 아이디;
    private final String 이름;

    public 유저1(String 아이디, String 이름) {
        this.아이디 = 아이디;
        this.이름 = 이름;
    }

    public String 아이디가져오기() {
        return this.아이디;
    }

    public String 이름가져오기() {
        return this.이름;
    }
}

/*
    아래의 레코드는 상기에 정의된 클래스와 동일하다.
    'private final 아이디' 처럼 불편이며 상속이 불가능하다.
    생성자 및 Getter 를 만들 필요가 없다.
    보다 간결하게 표현 할 수 있다.
*/
record 유저2(String 아이디, String 이름) {

}

public class 레코드 {
    public static void main(String[] args) {

        // 클래스 DTO로 접근 시
        유저1 사람1 = new 유저1("kouydong", "고의동");
        System.out.printf("유저1 아이디 %s", 사람1.아이디가져오기());
        System.out.printf("유저1 이름 %s \n", 사람1.이름가져오기());

        유저2 사람2 = new 유저2("kouydong", "고의동");
        System.out.printf("유저2 아이디 %s", 사람2.아이디());
        System.out.printf("유저2 이름 %s \n", 사람2.이름());
    }
}
