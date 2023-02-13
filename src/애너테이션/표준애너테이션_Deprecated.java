package 애너테이션;

class 샘플클래스 {
    @Deprecated
    public int getDate() {
            return Integer.parseInt(new String("40"));
            }
}

public class 표준애너테이션_Deprecated {
    public static void main(String[] args) {
        샘플클래스 object = new 샘플클래스();
        object.getDate();
    }
}


