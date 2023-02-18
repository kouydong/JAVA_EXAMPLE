package 지네릭스;

interface 지네릭인터페이스<T> {
    String getName();
}
class 일반클래스 implements 지네릭인터페이스<일반클래스> {
    private String name = "홍길동";
    public String getName() {
        return this.name;
    }
}

public class 지네릭클래스다형성2 {
    public static void main(String[] args) {
        지네릭인터페이스<일반클래스> 클래스 = new 일반클래스();
        System.out.println("클래스 이름은 " + 클래스.getName());
    }
}
