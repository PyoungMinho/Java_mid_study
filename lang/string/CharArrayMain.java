package lang.string;

public class CharArrayMain {

    public static void main(String[] args) {
        char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(charArr); //char 배열 프린트에 넣으면 붙여서 출력해준다

        String[] strArr = new String[]{"h", "e", "l", "l", "o"};
        System.out.println(strArr);

        String str = "hello";
        System.out.println("str = " + str);
    }
}
