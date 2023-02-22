package 날짜;

import java.sql.Time;
import java.util.Date;

public class 타임스탬프 {
    public static void main(String[] args) {

        long timeStamp = new Date().getTime() / 1000;
        System.out.println("타임 스탬프는 " + timeStamp);

    }
}
