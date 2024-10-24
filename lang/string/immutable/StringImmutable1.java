package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java"); // String 내부 들어가보면 private final byte[] value; 임 변경 불가
        System.out.println("str = " + str);
    }
}
