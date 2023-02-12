package 인터페이스;

interface 인터페이스 {
    String 이름가져오기(); // public abstract String 이름가져오기();
    int 나이가져오기(); // public abstract int 나이가져오기();
}

class 인터페이스구현클래스 implements 인터페이스 {
    private String 이름;
    private int 나이;

    public 인터페이스구현클래스(String 이름, int 나이) {
        this.이름 = 이름;
        this.나이 = 나이;
    }

    public String 이름가져오기() {
        return this.이름;
    }

    public int 나이가져오기() {
        return this.나이;
    }

}

public class 인터페이스구현 {

    public static void main(String[] args) {
        인터페이스 사람 = new 인터페이스구현클래스("홍길동", 30);
        System.out.println("이름은 : " + 사람.이름가져오기());
        System.out.println("나이는 : " + 사람.나이가져오기());
    }

}
