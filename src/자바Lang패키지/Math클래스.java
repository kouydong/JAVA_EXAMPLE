package 자바Lang패키지;

public class Math클래스 {
    public static void main(String[] args) {
        // round 함수 사용
        for(double d = 0.0; d <= 1.5; d+= 0.1)
            System.out.printf("숫자 : %f, 반올림 숫자 : %d \n", d, Math.round(d));
    }
}
