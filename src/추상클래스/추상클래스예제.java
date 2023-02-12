package 추상클래스;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

abstract class TV추상클래스 {
    // 일반 맴버변수
    boolean onOff;
    // 생성자
    TV추상클래스() {
        this.onOff = false;
    }
    // 일반 메서드
    boolean 전원온오프(boolean onOff) {
        return (this.onOff)?false:true;
    }
    // 추상 메서드(메서드 선언부만 존재) -> 몸통이 없음
    abstract void 소리조정();
    abstract boolean 전원온오프();
    abstract void 채널이동(int 채널번호);
}

class S사TV클래스 extends TV추상클래스 {

    // TV추상클래스에 정의된 기능 정의
    @Override
    void 소리조정() {
        // S사 타입에 맞게 소리조정 메서드 구현
    }
    @Override
    boolean 전원온오프() {
        // S사 타입에 맞게 전원온오프 메서드 구현
        return false;
    }
    @Override
    void 채널이동(int 채널번호) {
        // S사 타입에 맞게 채널이동 메서드 구현
    }

}

class L사TV클래스 extends TV추상클래스 {

    // TV추상클래스에 정의된 기능 정의
    @Override
    void 소리조정() {
        // L사 타입에 맞게 소리조정 메서드 구현
    }
    @Override
    boolean 전원온오프() {
        // L사 타입에 맞게 전원온오프 메서드 구현
        return false;
    }
    @Override
    void 채널이동(int 채널번호) {
        // L사 타입에 맞게 채널이동 메서드 구현
    }

}

public class 추상클래스예제 {

    S사TV클래스 tr1 = new S사TV클래스(); // OK
    L사TV클래스 tv2 = new L사TV클래스(); // OK

    // 상속을 통한 다형성 제공
    TV추상클래스 tv3 = new S사TV클래스(); // OK
    TV추상클래스 tv4 = new L사TV클래스(); // OK

}