package 인터페이스;

interface 동물 {

    void 이동한다(int x, int y); // public abstract void 이동한다(int x, int y) 의 의미
    void 먹는다(); // public abstract void 먹는다() 의 의미

}

abstract class 포유류 {

    abstract void 자식을낳는다();

}

class 사람 extends 포유류 implements 동물 {

    @Override
    public void 이동한다(int x, int y) {}
    @Override
    public void 먹는다() { }
    @Override
    public void 자식을낳는다() {}

}

public class 인터페이스다형성 {
    public static void main(String[] args) {

        // 추상 클래스 부모 객체로 자식 객체 받기
        포유류 person = new 사람();
        동물 person2 = new 사람();

    }
}
