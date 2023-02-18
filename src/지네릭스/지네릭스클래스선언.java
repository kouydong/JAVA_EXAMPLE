package 지네릭스;

// 지네릭스 인터페이스를 구현 타입 변수로 'T' 사용
interface 사람인터페이스<T>
{
    void 이름가져오기();
}

// 사람클래스에서 사람인터페이스 추상 메서드를 구현
class 사람클래스<T> implements 사람인터페이스<T>
{
    @Override
    public void 이름가져오기()
    {
        System.out.println("이름을 가져 옵니다.");
    }
}

public class 지네릭스클래스선언
{
    public static void main(String[] args)
    {
        // '사람인터페이스' 타입을 '사람클래스'로 제한
        사람인터페이스<사람클래스> 사람1 = new 사람클래스<>();
        사람1.이름가져오기();
    }
}