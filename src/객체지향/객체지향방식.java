package 객체지향;

class 사람 {

    private int 몸무게;
    private int 신장;
    private String 이름;

    public int get몸무게() {
        return 몸무게;
    }

    public void set몸무게(int 몸무게) {
        this.몸무게 = 몸무게;
    }

    public int get신장() {
        return 신장;
    }

    public void set신장(int 신장) {
        this.신장 = 신장;
    }

    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }
}
public class 객체지향방식 {
    public static void main(String[] args) {

        사람 홍길동 = new 사람();

        // 모든 맴버 변수는 메소드를 통해서 설정하고 가져옴(캡슐화)
        홍길동.set몸무게(74);
        홍길동.set이름("홍길동");
        홍길동.set신장(180);

    }
}
