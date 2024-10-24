package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello"; // 앞이 대문자로 시작하는 타입이 참조형 나머지는 기본형 (int,boolean)
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
