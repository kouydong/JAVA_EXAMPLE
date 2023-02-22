package 알고리즘;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Instant;


public class 알고리즘_MD5 {
    public static void main(String[] args) throws Exception
    {
        // 32 byte의 문자열을 생성한다.
        String a = createHashCode("100");
        String b = createHashCode("101454354353");
        String c = createHashCode("505");

        System.out.println("a =>" + a);
        System.out.println("b =>" + b);
        System.out.println("c =>" + c);
    }


    public static String createHashCode(String plainText) throws NoSuchAlgorithmException {
        String hashString = "";
        // MD2, MD4, MD5, SHA-1, SHA-256, SHA-512
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(plainText.getBytes());
        byte byteData[] = messageDigest.digest();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        hashString = sb.toString();

        return hashString;
    }
}
