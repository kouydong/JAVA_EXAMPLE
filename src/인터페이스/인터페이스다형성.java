package 인터페이스;

interface 동물 {
    void 이동한다(int x, int y);
    void 먹는다();
    int a = 10;
}

class 사람 implements 동물 {

    @Override
    public void 이동한다(int x, int y) {
        // 이동과 관련된 로직을 설계
    }

    @Override
    public void 먹는다() {
        // 먹는 것과 관련된 로직을 설계
    }

}

public class 인터페이스다형성 {
    public static void main(String[] args) {

    }
}
